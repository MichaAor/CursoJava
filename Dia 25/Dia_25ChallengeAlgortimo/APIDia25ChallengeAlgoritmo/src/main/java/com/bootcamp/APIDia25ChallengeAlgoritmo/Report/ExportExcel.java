package com.bootcamp.APIDia25ChallengeAlgoritmo.Report;

import com.bootcamp.APIDia25ChallengeAlgoritmo.Model.Estudiante;
import com.bootcamp.APIDia25ChallengeAlgoritmo.Model.Materia;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExportExcel {
    private XSSFSheet sheet;
    private XSSFWorkbook workbook;
    private ArrayList<Estudiante> students;
    private List<Materia> materias;
    public ExportExcel(ArrayList<Estudiante> st){
        this.students=st;
        workbook=new XSSFWorkbook();
    }

    public ExportExcel(List<Materia> cl) {
        this.materias =cl;
        workbook=new XSSFWorkbook();
    }


    private void readHeader(){
        if(materias !=null) {sheet = workbook.createSheet("Materias_List");}
        else {sheet = workbook.createSheet("Estudiantes_List");}

        Row row = sheet.createRow(0);
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setFontHeight(20);
        font.setBold(true);
        style.setFont(font);
        if(materias !=null){
            createCell(row, 0, "codeMate", style);
            createCell(row, 1, "nombre", style);
        }else {
            createCell(row, 0, "Dni", style);
            createCell(row, 1, "Telefono", style);
            createCell(row, 2, "Apellido", style);
            createCell(row, 3, "Telefono", style);
        }
    }

    private void createCell(Row row, int i, Object name, CellStyle style) {
        sheet.autoSizeColumn(i);
        Cell cell = row.createCell(i);

        if(name instanceof Integer) cell.setCellValue((Integer) name);
        else if(name instanceof Boolean) cell.setCellValue((Boolean) name);
        else if(name instanceof Long) cell.setCellValue((Long) name);
        else cell.setCellValue((String) name);
        cell.setCellStyle(style);
    }
    private void readBody(){
        int rowCounter=1;
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setFontHeight(20);
        style.setFont(font);

        if(materias !=null) {
            for (Materia cl : materias){
                Row row = sheet.createRow(rowCounter);
                int counterColumn = 0;
                createCell(row, counterColumn++, counterColumn, style);
                createCell(row, counterColumn++, cl.getNombre(), style);

                rowCounter++;
            }
        }else{
            for (Estudiante st : students) {
                Row row = sheet.createRow(rowCounter);
                int counterColumn = 0;
                createCell(row, counterColumn++, st.getDni(), style);
                createCell(row, counterColumn++, st.getNombre(), style);
                createCell(row, counterColumn++, st.getApellido(), style);
                createCell(row, counterColumn++, st.getTelefono(), style);
                rowCounter++;
            }
        }
    }
    public void CreateXcelFile(HttpServletResponse response) throws IOException{
        readHeader();
        readBody();
        ServletOutputStream stream = response.getOutputStream();
        workbook.write(stream);
        workbook.close();
        stream.close();
    }
}
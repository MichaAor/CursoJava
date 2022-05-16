package com.bootcamp.APIDia25ChallengeAlgoritmo.Report;

import com.bootcamp.APIDia25ChallengeAlgoritmo.Model.Estudiante;
import com.bootcamp.APIDia25ChallengeAlgoritmo.Model.Materia;
import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PDFReport {
    private List<Estudiante> students;
    private List<Materia> classes;

    public PDFReport(ArrayList<Estudiante> students){
        this.students=students;
    }
    public PDFReport(List<Materia> classes){
        this.classes=classes;
    }

    public void headerTable(PdfPTable table){
        PdfPCell cell=new PdfPCell();
        cell.setBackgroundColor(Color.GRAY);
        cell.setPadding(20);
        if(students!=null){
            cell.setPhrase(new Phrase("Dni"));
            table.addCell(cell);
            cell.setPhrase(new Phrase("Nombre"));
            table.addCell(cell);
            cell.setPhrase(new Phrase("Apellido"));
            table.addCell(cell);
            cell.setPhrase(new Phrase("Telefono"));
            table.addCell(cell);
        }else{
            cell.setPhrase(new Phrase("CodigoMateria"));
            table.addCell(cell);
            cell.setPhrase(new Phrase("Nombre"));
            table.addCell(cell);
        }
    }
    public void BodyTable(PdfPTable table){
        if(students!=null) {
            for (Estudiante student: students){
                table.addCell(String.valueOf(student.getDni()));
                table.addCell(student.getNombre());
                table.addCell(student.getApellido());
                table.addCell(student.getTelefono());
            }
        }else{
            for (Materia cl:classes){
                table.addCell(String.valueOf(cl.getCodMat()));
                table.addCell(cl.getNombre());
            }
        }
    }
    public void export(HttpServletResponse hsr) throws DocumentException, IOException {
        Document doc= new Document(PageSize.A4);
        PdfWriter.getInstance(doc,hsr.getOutputStream());
        doc.open();
        Paragraph par;
        if(students!=null){
            par=new Paragraph("Lista de Estudiantes");
        }
        else {
            par=new Paragraph("Lista de Clases");
        }
        par.setAlignment(par.ALIGN_CENTER);
        doc.add(par);
        PdfPTable pdf;
        if(students!=null){
            pdf=new PdfPTable(5);
        }
        else {
            pdf=new PdfPTable(2);
        }
        headerTable(pdf);
        BodyTable(pdf);
        doc.add(pdf);
        doc.close();
    }
}

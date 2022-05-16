package com.bootcamp.APIDia25ChallengeAlgoritmo.Controller;

import com.bootcamp.APIDia25ChallengeAlgoritmo.Model.Estudiante;
import com.bootcamp.APIDia25ChallengeAlgoritmo.Model.Materia;
import com.bootcamp.APIDia25ChallengeAlgoritmo.Model.Report;
import com.bootcamp.APIDia25ChallengeAlgoritmo.Report.ExportExcel;
import com.bootcamp.APIDia25ChallengeAlgoritmo.Report.PDFReport;
import com.bootcamp.APIDia25ChallengeAlgoritmo.Service.EstudianteService;
import com.bootcamp.APIDia25ChallengeAlgoritmo.Service.MateriaService;
import com.lowagie.text.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/reports")
public class ReportsController {
    @Autowired
    EstudianteService es;
    @Autowired
    MateriaService ms;

    @GetMapping
    public String getForm(Model model) {
        Report rep = new Report();
        model.addAttribute("report", rep);
        return "ReportIndex";
    }

    @GetMapping("/send")
    public String send(@ModelAttribute("report") Report report, Model model) {
        return "redirect:/reports/" + report.getType() + "/" + report.getList();
    }

    @GetMapping("/PDF/estudiante")
    public void getPdfStudents(HttpServletResponse response) throws DocumentException, IOException {
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "students.pdf");
        ArrayList<Estudiante> estudiantes = (ArrayList<Estudiante>) es.getAllEstudiantes();
        PDFReport pdfclass = new PDFReport(estudiantes);
        pdfclass.export(response);
    }

    @GetMapping("/PDF/materias")
    public void getPdfClasses(HttpServletResponse response) throws DocumentException, IOException {
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "classes.pdf");
        List<Materia> materias = ms.getAllMaterias();
        PDFReport pdfclass = new PDFReport(materias);
        pdfclass.export(response);
    }

    @GetMapping("/Excel/estudiantes")
    public void getExcelStudents(HttpServletResponse response) throws DocumentException, IOException {
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment;filename=Students_List.xlsx");
        ArrayList<Estudiante> estudiantes = es.getAllEstudiantes();
        ExportExcel excel = new ExportExcel(estudiantes);
        excel.CreateXcelFile(response);
    }

    @GetMapping("/Excel/materias")
    public void getExcelClasses(HttpServletResponse response) throws DocumentException, IOException {
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment;filename=Classes_List.xlsx");
        List<Materia> materias = ms.getAllMaterias();
        ExportExcel excel = new ExportExcel(materias);
        excel.CreateXcelFile(response);
    }

    @GetMapping("/Excel/Alphabetical")
    public void getExcelStudentsInAlphabeticalOrder(HttpServletResponse response) throws DocumentException, IOException {
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment;filename=Students_List.xlsx");
    }
}
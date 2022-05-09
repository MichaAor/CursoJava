package com.bootcamp.Dia21_ChallengeAlgoritmo.Controller;

import com.bootcamp.Dia21_ChallengeAlgoritmo.Controller.Service.FilesStorageService;
import com.bootcamp.Dia21_ChallengeAlgoritmo.Model.FileImg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/files")
public class FileImgController{
    @Autowired
    FilesStorageService storageService;

    @GetMapping
    public String getListFiles(Model model) {
        List<FileImg> files = storageService.loadAll().map(path -> {
            String filename = path.getFileName().toString();
            String url = MvcUriComponentsBuilder
                    .fromMethodName(FileImgController.class, "getFile", path.getFileName().toString()).build().toString();
            return new FileImg(filename, url);
        }).collect(Collectors.toList());
        model.addAttribute("files", files);
        return "fileIndex";
    }


    @GetMapping("/files/{filename:.+}")
    @ResponseBody
    public ResponseEntity<Resource> getFile(@PathVariable String filename) {
        Resource file = storageService.load(filename);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"").body(file);
    }

    @PostMapping
    public String uploadFile(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttrs) {
        String message = "";
        try {
            storageService.save(file);
            message = "Archivo añadido " + file.getOriginalFilename();
            redirectAttrs
                    .addFlashAttribute("mensaje", message)
                    .addFlashAttribute("clase", "success");
            return "redirect:/files";
        } catch (Exception e) {
            message = "Error al cargar el archivo: " + file.getOriginalFilename() + "!";
            redirectAttrs
                    .addFlashAttribute("mensaje", message)
                    .addFlashAttribute("clase", "success");
            return "redirect:/files";
        }
    }



}

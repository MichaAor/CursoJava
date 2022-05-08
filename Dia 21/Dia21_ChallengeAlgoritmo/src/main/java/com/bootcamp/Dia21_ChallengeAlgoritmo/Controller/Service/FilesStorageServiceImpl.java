package com.bootcamp.Dia21_ChallengeAlgoritmo.Controller.Service;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

@Service
public class FilesStorageServiceImpl implements FilesStorageService {

	 private final Path root = Paths.get("archivos");	///DCLARACION DE RUTA DE GUARDADO


	  @Override
	  public void init() {			///Usado para crear la carpeta donde guardar
	    try {
	      Files.createDirectory(root);
	    } catch (IOException e) {
	      throw new RuntimeException("Error no se puede crear la carpeta");
	    }
	  }
	  

	  @Override
	  public String saveUploads(MultipartFile file) {	//Usado solo para guardar arch de cliente
		  String fileoptions=file.getOriginalFilename();
	    try {
	      Files.copy(file.getInputStream(), this.root.resolve(file.getOriginalFilename()));
	      
	    } catch (Exception e) {
	      throw new RuntimeException("Error fallo al subir el archivo" + e.getMessage());
	    }
	    return fileoptions;
	  }
	  
	  @Override
	  public void save(MultipartFile file) {		//Guardado gral desde IndexFile
	    try {
	      Files.copy(file.getInputStream(), this.root.resolve(file.getOriginalFilename()));
	    } catch (Exception e) {
	      throw new RuntimeException("Error fallo al subir el archivo" + e.getMessage());
	    }
	  }


	  @Override
	  public Resource load(String filename) {	//Cargar Archivos al cotroller
	    try {
	      Path file = root.resolve(filename);
	      Resource resource = new UrlResource(file.toUri());
	      if (resource.exists() || resource.isReadable()) {
	        return resource;
	      } else {
	        throw new RuntimeException("No se puede leer el archivo");
	      }
	    } catch (MalformedURLException e) {
	      throw new RuntimeException("Error: " + e.getMessage());
	    }
	  }
	  
	  @Override
	  public void deleteAll() {
	    FileSystemUtils.deleteRecursively(root.toFile());
	  }
	  
	  @Override
	  public Stream<Path> loadAll() {
	    try {
	      return Files.walk(this.root, 1).filter(path -> !path.equals(this.root)).map(this.root::relativize);
	    } catch (IOException e) {
	      throw new RuntimeException("Error no se puede listar");
	    }
	  }
	}

package com.bootcamp.Dia21_ChallengeAlgoritmo;

import com.bootcamp.Dia21_ChallengeAlgoritmo.Controller.Service.FilesStorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class Dia21ChallengeAlgoritmoApplication implements CommandLineRunner {
	@Resource
	FilesStorageService storageService;
	public static void main(String[] args) {
		SpringApplication.run(Dia21ChallengeAlgoritmoApplication.class, args);

	}
	@Override
	public void run(String... arg) throws Exception {
		storageService.deleteAll();
		storageService.init();
	}

}

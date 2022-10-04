package com.leapworx.notemaker;

import com.leapworx.notemaker.controller.NoteController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableCaching
public class NotemakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotemakerApplication.class, args);
	}

}

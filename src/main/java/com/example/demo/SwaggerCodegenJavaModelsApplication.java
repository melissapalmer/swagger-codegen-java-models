package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.petstore.api.model.Category;
import com.example.demo.petstore.api.model.Pet;

@SpringBootApplication
public class SwaggerCodegenJavaModelsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerCodegenJavaModelsApplication.class, args);
		
		Category cats = new Category() {{
			setId(1L);
			setName("Cats");
		}};
		
		Pet pet = new Pet() {{
			setId(1L);
			setName("Black Cat");
			setCategory(cats);
			setStatus(StatusEnum.AVAILABLE);
		}};
		
		System.out.println("");
		System.out.println("==================================================");
		System.out.println("Using pet generated code: \n" + pet + "\n");
		System.out.println("==================================================");
		System.out.println("");
	}
}

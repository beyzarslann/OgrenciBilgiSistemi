package edu.gazi.FullProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FullProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullProjectApplication.class, args);
		//entity -> dto -> repo -> mapper -> ogrenciservice -> ogrenciImpl (burada override edilen metodda tüm ogrenci listesini cek. -> controller
	}
}
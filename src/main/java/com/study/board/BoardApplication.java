package com.study.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = {"service"})

@SpringBootApplication
public class BoardApplication {

	public static void main(String[] args) {
				SpringApplication.run(BoardApplication.class, args);
	}


}


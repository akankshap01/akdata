package com.training.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainApp {
   public static void main(String[] args) {
	   SpringApplication.run(MainApp.class, args);
      /*ApplicationContext ctx=SpringApplication.run(MainApp.class, args);
      for(String nm:ctx.getBeanDefinitionNames()) {
    	  System.out.println(nm);
      }*/
   }
}

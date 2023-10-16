package com.codebased.Lulu_02_week4_Springboot.service;
import org.springframework.stereotype.Service;

@Service

public class Myservice {
	
		

	
			public String process() {
				
				System.out.println("I got trigged from controller rest API");
				return "<H1>I got trigged from controller rest API</H1>";

			
			}
			
			

		}



	



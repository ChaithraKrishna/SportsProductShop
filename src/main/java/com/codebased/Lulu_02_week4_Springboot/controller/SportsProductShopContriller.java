package com.codebased.Lulu_02_week4_Springboot.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codebased.Lulu_02_week4_Springboot.entity.SportsProductShop;
import com.codebased.Lulu_02_week4_Springboot.repository.SportsProductShoprepo;


@RestController
public class SportsProductShopContriller {
	
		
			//CRUD with SportsProductShop
			
	@RestController
	public class PromotionsController{
		
		//CRUD with Customer care
		
		@Autowired
                  SportsProductShoprepo sportsproductshopRepository;
		
		@GetMapping("/getSportsProductShop")
		public List< SportsProductShop> getSportsProductShop() {

			return sportsproductshopRepository.findAll(); // select * from <TableName>;
		}
			
			@PostMapping("/addSportsProductShop")
			public SportsProductShop createuser(@RequestBody SportsProductShop sps) {
				return sportsproductshopRepository.save(sps);
			}
			
		
			@DeleteMapping("/deleteSportsProductShop/{id}")
			public void deleteSportsProductShop(@PathVariable("id") Integer id  ) {

		 

				sportsproductshopRepository.deleteById(id); // select * from <TableName>;

			}
			
			
			
	}
}

		



		
		



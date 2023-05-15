package com.xamcheck.accelerate.student.app.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xamcheck.accelerate.student.app.api.dto.ResponceDto;


@RestController
@RequestMapping("/students")
public class StudentAppController {

	@GetMapping("/test")
	public ResponceDto test() {
		ResponceDto responceDto=new ResponceDto();
		responceDto.setMessage("Just test the student App Ends Points");
		return responceDto;
		
	}

}

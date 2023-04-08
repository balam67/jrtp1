package com.ashokit.controller;


import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.entity.CitizenPlanEntity;
import com.ashokit.repository.CitizenPlanRepository;
import com.ashokit.service.CitizenPlanService;
import com.ashokit.utils.ConvertPdf;
import com.lowagie.text.DocumentException;

import jakarta.servlet.http.HttpServletResponse;


@Controller
//@RestController
public class CitizenPlanController {

	@Autowired
	private CitizenPlanRepository repo;
	@Autowired
	private CitizenPlanService citizenPlanService;
	
	@Autowired
	private ConvertPdf convertPdf;
	
	@GetMapping("/plannames")
	public List<String> getPlanNames(){
		return citizenPlanService.getPlanNames();
	}
	
	
	@GetMapping("/planstatuses")
	public List<String> getPlanStatuses(){
		return citizenPlanService.getPlanStatuses();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * @GetMapping("/p") public String setListToPdfConverter() {
	 * 
	 * //List<CitizenPlanEntity> listCitizenPlanEntity
	 * =citizenPlanService.convertPdf(); List<CitizenPlanEntity>
	 * listCitizenPlanEntity=repo.findAll();
	 * 
	 * convertPdf.setListCitizenDto(listCitizenPlanEntity);
	 * 
	 * return "index1"; //return listCitizenPlanEntity.toString(); }
	 */
	 
	
	
	
	
	
	/*
	 * @GetMapping("/pdf") public void convertToPdf(HttpServletResponse response
	 * )throws DocumentException, IOException {
	 * 
	 * setListToPdfConverter();
	 * 
	 * response.setContentType("application/pdf"); DateFormat dateFormatter = new
	 * SimpleDateFormat("yyyy-MM-dd_HH:mm:ss"); String currentDateTime =
	 * dateFormatter.format(new Date());
	 * 
	 * String headerKey = "Content-Disposition"; String headerValue =
	 * "attachment; filename=users_" + currentDateTime + ".pdf";
	 * response.setHeader(headerKey, headerValue);
	 * 
	 * List<CitizenPlanEntity> citizenPlanEntity = citizenPlanService.convertPdf();
	 * com.ashokit.utils.ConvertPdf convertPdf =new com.ashokit.utils.ConvertPdf();
	 * 
	 * convertPdf.export(response);
	 * 
	 * 
	 * }
	 */
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}

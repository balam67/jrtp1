package com.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.entity.CitizenPlanEntity;
import com.ashokit.form.SearchForm;
import com.ashokit.repository.CitizenPlanRepository;
import com.ashokit.utils.ConvertExcel;
import com.ashokit.utils.ConvertPdf;

@Service
public class CitizenPlanServiceImpl implements CitizenPlanService {

	@Autowired
	private CitizenPlanRepository repo;
	
	@Autowired
	private ConvertPdf convertPdf;
	@Autowired
	private ConvertExcel convertExcel;
	
	@Override
	public List<String> getPlanNames() {
		
		return repo.getPlanNames();
	}

	@Override
	public List<String> getPlanStatuses() {
		
		return repo.getPlanStatuses();
	}
	
	
	
	
	
	
	
	
	
	
	
	

	/*
	 * @Override public List<CitizenPlanDto> search(SearchForm searchForm) { return
	 * repo.findAll();
	 * 
	 * }
	 */
	/*
	 * @Override public List<CitizenPlanEntity> convertPdf() {
	 * 
	 * List<CitizenPlanEntity> listCitizenPlanEntity= repo.findAll();
	 * 
	 * ConvertPdf convertPdf= new ConvertPdf();
	 * convertPdf.setListCitizenDto(listCitizenPlanEntity);
	 * 
	 * return true; }
	 */

	@Override
	public boolean convertExcel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<CitizenPlanEntity> convertPdf() {
		// TODO Auto-generated method stub
		List<CitizenPlanEntity> listCitizenPlanEntity= repo.findAll();
		
		 //convertPdf.setListCitizenDto(listCitizenPlanEntity);
		
		 return listCitizenPlanEntity;
		
	}

	

}

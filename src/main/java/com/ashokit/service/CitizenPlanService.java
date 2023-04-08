package com.ashokit.service;

import java.util.List;


import com.ashokit.entity.CitizenPlanEntity;
import com.ashokit.form.SearchForm;

public interface CitizenPlanService {

	public List<String> getPlanNames();
	public List<String> getPlanStatuses();
	
	
	
	
	
	
	
	
	
	
	
	
	
	public List<CitizenPlanEntity> convertPdf();
	public boolean convertExcel();
}

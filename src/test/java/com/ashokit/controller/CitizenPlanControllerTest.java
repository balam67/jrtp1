package com.ashokit.controller;


import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;




@SpringBootTest
public class CitizenPlanControllerTest {

	
  
	@Test
    public void getPlanNamesTest() {

       
        List<String> expectedPlanNames = Arrays.asList("FOODA","MEDICALA","EMPLOYMENTA","CASHA");
       CitizenPlanController citizenPlanController =new CitizenPlanController();
        List<String> actualPlanNames= citizenPlanController.getPlanNames();
        System.out.println("Actual====="+actualPlanNames);
        
        
		/*
		 * Assert.assertEquals(actualPlanNames,expectedPlanNames);
		 */
    }

	/*
	 * @Test public void getPlanStatusesTest() {
	 * 
	 * 
	 * List<String> expectedPlanNames =
	 * Arrays.asList("APP","MEDICAL","EMPLOYMENT","CASH"); CitizenPlanController
	 * citizenPlanController =new CitizenPlanController(); List<String>
	 * actualPlanNames= citizenPlanController.getPlanNames();
	 * 
	 * Assert.assertEquals(expectedPlanNames, actualPlanNames);
	 * 
	 * }
	 */
	
}

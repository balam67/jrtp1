package com.ashokit.utils;

import java.awt.Color;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Component;


import com.ashokit.entity.CitizenPlanEntity;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.CMYKColor;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import jakarta.servlet.http.HttpServletResponse;

@Component
public class ConvertPdf {

	
	List<CitizenPlanEntity> listCitizenPlanEntity;

	 public void setListCitizenDto(List<CitizenPlanEntity> listCitizenPlanEntity) {
		 this.listCitizenPlanEntity=listCitizenPlanEntity;
		 System.out.println("listCitizenPlanEntity.................."  + listCitizenPlanEntity.toString());
	 }
     
	
	 
	 
	 
	    private void writeTableHeader(PdfPTable table) {
	        PdfPCell cell = new PdfPCell();
	        cell.setBackgroundColor(Color.BLUE);
	        cell.setPadding(5);
	         
	        Font font = FontFactory.getFont(FontFactory.HELVETICA);
	        font.setColor(Color.WHITE);
	         
	        cell.setPhrase(new Phrase("User ID", font));
	         
	        table.addCell(cell);
	         
	        cell.setPhrase(new Phrase("E-mail", font));
	        table.addCell(cell);
	         
	        cell.setPhrase(new Phrase("Full Name", font));
	        table.addCell(cell);
	         
	        cell.setPhrase(new Phrase("Roles", font));
	        table.addCell(cell);
	         
	        cell.setPhrase(new Phrase("Enabled", font));
	        table.addCell(cell);       
	    }
	     
	    private void writeTableData(PdfPTable table) {
	        for (CitizenPlanEntity citizenPlanEntity : listCitizenPlanEntity) {
	            table.addCell(String.valueOf(citizenPlanEntity.getGender()));
	            table.addCell(citizenPlanEntity.getPlanName());
	            table.addCell(citizenPlanEntity.getDenialReason());
	            table.addCell(citizenPlanEntity.getDenialReason());
	            table.addCell(citizenPlanEntity.getDenialReason());
	        }
	    }
	     
	    public void export(HttpServletResponse response) throws DocumentException, IOException {
	        Document document = new Document(PageSize.A4);
	        PdfWriter.getInstance(document, response.getOutputStream());
	         
	        document.open();
	        Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
	        font.setSize(18);
	        font.setColor(Color.BLUE);
	         
	        Paragraph p = new Paragraph("List of Users", font);
	        p.setAlignment(Paragraph.ALIGN_CENTER);
	         
	        document.add(p);
	         
	        PdfPTable table = new PdfPTable(5);
	        table.setWidthPercentage(100f);
	        table.setWidths(new float[] {1.5f, 3.5f, 3.0f, 3.0f, 1.5f});
	        table.setSpacingBefore(10);
	         
	        writeTableHeader(table);
	        writeTableData(table);
	         
	        document.add(table);
	         
	        document.close();
	         
	    
		}
	
}

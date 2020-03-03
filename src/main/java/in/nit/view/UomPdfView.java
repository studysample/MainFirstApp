package in.nit.view;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import in.nit.model.Uom;

public class UomPdfView extends AbstractPdfView {
	
	@SuppressWarnings({ "unchecked", "unused" })
	protected void buildPdfDocument(
			Map<String, Object> model, 
			Document document, PdfWriter writer,
			HttpServletRequest request, 
			HttpServletResponse response) 
			throws Exception {
		//download File
		response.addHeader("Content-Disposition", "attachment;filename=CreatingUoms.pdf");
		//create element
		Paragraph p=new Paragraph("UOM PDF HAS BEEN CREATED");
		//add element to document
		document.add(p);
		
		//read data from model
		List<Uom> list=(List<Uom>)model.get("list");
		
		//creating table with no. of columns
		PdfPTable t=new PdfPTable(4);
		t.addCell("ID");
		t.addCell("MODEL");
		t.addCell("TYPE");
		t.addCell("DESCRIPTION");
		
		//ADD DATA TO TABLE
		for(Uom u:list) {
			t.addCell(u.getUomId().toString());
			t.addCell(u.getUomModel());
			t.addCell(u.getUomType());
			t.addCell(u.getUomDesc());
		}
		
		//add table to document
		document.add(t);
		
		//print Date&Time
		document.add(new Paragraph(new Date().toString()));
	}

}
















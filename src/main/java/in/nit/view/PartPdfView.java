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

import in.nit.model.Part;

public class PartPdfView extends AbstractPdfView {

	@SuppressWarnings("unchecked")
	@Override
	protected void buildPdfDocument(
			Map<String, Object> model, 
			Document document, 
			PdfWriter writer,
			HttpServletRequest request, 
			HttpServletResponse response) 
					throws Exception {

		response.addHeader("Content-Disposition", "attachment;filename=CreatingParts.pdf");
		
		Paragraph p=new Paragraph("Welcome To Part PDF");
		
		document.add(p);
	
		List<Part> list=(List<Part>)model.get("list");
		
		PdfPTable t=new PdfPTable(10);
		t.addCell("ID");
		t.addCell("PART CODE");
		t.addCell("LENGTH");
		t.addCell("WIDTH");
		t.addCell("HEIGHT");
		t.addCell("BASE COST");
		t.addCell("BASE CURRENCY");
		t.addCell("NOTE");
		t.addCell("UOMOB");
		t.addCell("OMSALEOB");
		
		for(Part pob:list) {
			t.addCell(pob.getId().toString());
			t.addCell(pob.getPartCode());
			t.addCell(pob.getPartLen());
			t.addCell(pob.getPartWid());
			t.addCell(pob.getPartHgt());
			t.addCell(pob.getBaseCost());
			t.addCell(pob.getBaseCurrency());
			t.addCell(pob.getNote());
			t.addCell(pob.getUomob().getUomModel());
			t.addCell(pob.getOmSaleOb().getOmCode());
			
			document.add(t);
			
			document.add(new Paragraph(new Date().toString()));
			
		}
	}

}











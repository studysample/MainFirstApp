package in.nit.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import in.nit.model.OrderMethod;

public class OrderMethodExcelView extends AbstractXlsxView  {
	
	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
response.addHeader("Content-Diposition", "attachment;filename=ordermethods.xlsx");
		
		Sheet s=workbook.createSheet("OrderMethodS");
		
		setHeader(s);
		
		@SuppressWarnings("unchecked")
		List<OrderMethod> list=(List<OrderMethod>) model.get("list");
		
		setBody(s,list);
	}
	private void setHeader(Sheet s) {
		Row r=s.createRow(0);
		r.createCell(0).setCellValue("ID");
		r.createCell(1).setCellValue("MODE");
		r.createCell(2).setCellValue("CODE");
		r.createCell(3).setCellValue("METHOD");
		r.createCell(4).setCellValue("ACCEPT");
		r.createCell(5).setCellValue("DESCRIPTIO");
		
	}
	
	private void setBody(Sheet s, List<OrderMethod> list) {
  	int count=1;
  	for (OrderMethod st:list) {
  		Row r=s.createRow(count++);
  		r.createCell(0).setCellValue(st.getOmId());
		r.createCell(1).setCellValue(st.getOmMode());
		r.createCell(2).setCellValue(st.getOmCode());
		r.createCell(3).setCellValue(st.getOmMethod());
		r.createCell(4).setCellValue(st.getOmAccept());
		r.createCell(5).setCellValue(st.getOmDesc());
		
  		
		
	}
	}
	 	
}

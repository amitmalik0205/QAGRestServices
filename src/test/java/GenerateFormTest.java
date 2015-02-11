import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qait.qag.formgenerator.simpletemplate.domain.SimpleTemplateJsonParent;


public class GenerateFormTest {
	
	public static void main(String[] args) throws IOException {
		
		String url = "http://localhost:8080/QAGRestServices/rest/qag-service/generate-form";
		
		//String url = "http://localhost:8080/QAGRestServices/rest/qag-service/test";
		
		ObjectMapper mapper = new ObjectMapper();
		
		SimpleTemplateJsonParent jsonObject = mapper.readValue(new File("C:\\Amit\\QAG\\long_json_2.txt"), SimpleTemplateJsonParent.class);	
		
		//StudentFormDetailDto jsonObject = mapper.readValue(new File("C:\\Amit\\QAG\\test.txt"), StudentFormDetailDto.class);	
				
		String content = mapper.writeValueAsString(jsonObject);
		System.out.println(content);
					
		TestUtil.sendRequest(url, content, "POST");
				
	}

}

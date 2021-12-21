package dataDrivenTesting;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class ReadDataFromJson {
	

	@Test
	public String readFromJsonFile(String key) throws IOException, ParseException  {
		FileReader fr =new FileReader(PathConstant.JasonPath);
		JSONParser jsp=new JSONParser();
		Object obj=jsp.parse(fr);
		HashMap map=(HashMap) obj;
		String value =map.get(key).toString();
		return value;
	}
}

package pt.pedrogomes.chatgpt.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ConfigParser {
	
	public static Map<String, String> parse(String filePath) throws IOException{
		Map<String, String> result = new HashMap();
		
		
		List<String> lines= FileUtils.readLines(filePath);
		//KEY=VALUE
		for (int i = 0; i < lines.size(); i++) {
			String line = lines.get(i).trim();//equivalente a lines[i]num array
			
			if (line.startsWith("#")) {
				continue;
			}
			
			int splitPosition = line.indexOf("=");
			
			if (splitPosition != -1) {
				String key = line.substring(0,splitPosition);
				
				String value = line.substring(splitPosition + 1);
				
				result.put(key, value);
			}
			
		}
		return result;
	}
}

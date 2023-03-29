package pt.pedrogomes.chatgpt.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

    public List<String> readLines(String filePath) throws IOException {

        List<String> result = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        line = reader.readLine();
        try {
        	while((line = reader.readLine()) != null){
            	result.add(line);
            }
		} finally {
			//libertar a memoria, finally sempre executado quando há erro ou não
	        reader.close();
		}
        return result;
    }
}
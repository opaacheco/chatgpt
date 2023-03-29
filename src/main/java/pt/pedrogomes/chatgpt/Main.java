package pt.pedrogomes.chatgpt;
import pt.pedrogomes.chatgtp.model.request.*;
import pt.pedrogomes.chatgtp.model.*;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Main {
	private static final String token = "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";
	
	Chat c = new Chat();
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OpenAIrequest req = new OpenAIrequest();
		req.setModel("text-davinci-003");
		req.setPrompt("You are and AI\nAI:");
		req.setTemperatura(0.5f);
		req.setMaxTokens(60);
		req.setTopP(1.0f);
		req.setFrequencyPenalty(0.5f);
		req.setPresencePenalty(0.5f);
		req.setStop(new String[] {"AI:"});
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonPayload = null;
		try {
			jsonPayload = mapper.writeValueAsString(req);
		} catch (JsonProcessingException e) {
			System.err.println(e.getMessage());
			return;
		}
		System.out.println(jsonPayload);
	}

}

package pt.pedrogomes.chatgpt;

import java.util.ArrayList;
import java.util.List;

public class Chat {
	private String prompt;
	private List<Message> message;
	
	public Chat() {
		this.message = new ArrayList<>();
	}
	
	public String getPrompt() {
		return prompt;
	}
	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}
	public List<Message> getMessage() {
		return message;
	}
	
	 
	public void setMessage(List<Message> message) {
		//if (condition) {
			
		//}
		this.message = message;
	}

	public void addMessage(Message message) {
		if (this.message==null) {
			this.message = new ArrayList<>();
		}
		this.message.add(message);
	}
}

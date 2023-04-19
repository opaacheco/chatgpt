import java.util.ArrayList;
import java.util.List;

import pt.pedrogomes.chatgpt.Message;

public class chat {
    private final String prompt;
    private final List<Message> messages;

    public chat(String prompt) {
		super();
		this.prompt = prompt;
		this.messages = new ArrayList<>();
	}
    
	public String getPrompt() {
        return prompt;
    }
	
    public List<Message> getMessages() {
        return messages;
    }

    public void addMessage(Message message) {
    
        this.messages.add(message);
    }
}
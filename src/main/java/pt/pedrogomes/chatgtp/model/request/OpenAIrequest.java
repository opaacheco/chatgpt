package pt.pedrogomes.chatgtp.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OpenAIrequest {
	private String model;
	private String prompt;
	@JsonProperty ("max_tokens")
	private Integer maxTokens;
	private Float temperatura;
	private Float topP;
	private Float frequencyPenalty;
	private Float presencePenalty;
	private String[] stop;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPrompt() {
		return prompt;
	}
	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}
	public Integer getMaxTokens() {
		return maxTokens;
	}
	public void setMaxTokens(Integer maxTokens) {
		this.maxTokens = maxTokens;
	}
	public Float getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(Float temperatura) {
		this.temperatura = temperatura;
	}
	public Float getTopP() {
		return topP;
	}
	public void setTopP(Float topP) {
		this.topP = topP;
	}
	public Float getFrequencyPenalty() {
		return frequencyPenalty;
	}
	public void setFrequencyPenalty(Float frequencyPenalty) {
		this.frequencyPenalty = frequencyPenalty;
	}
	public Float getPresencePenalty() {
		return presencePenalty;
	}
	public void setPresencePenalty(Float presencePenalty) {
		this.presencePenalty = presencePenalty;
	}
	public String[] getStop() {
		return stop;
	}
	public void setStop(String[] stop) {
		this.stop = stop;
	}
	
}

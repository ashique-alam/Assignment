package com.ashique.lifecycleannot;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Question {
	private String questionId;
	private String question;
	private List<String> answer;
	
	
	public String getQuestionId() {
		return questionId;
	}
	public String getQuestion() {
		return question;
	}
	public List<String> getAnswer() {
		return answer;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}

	public void printQuestionAnswer() {
		System.out.println(getQuestionId()+" "+getQuestion());
		for(String s:answer) {
			System.out.println(s);
		}
			
	}
	
	
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", answer=" + answer + "]";
	}
	
	@PostConstruct
	public void initializeQuestion() {
		System.out.println("This is Question initializing.");
	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println("This is Destroy of Question");
	}
	
	
}

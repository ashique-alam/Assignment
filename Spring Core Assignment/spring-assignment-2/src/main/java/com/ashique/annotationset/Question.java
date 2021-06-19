package com.ashique.annotationset;

import java.util.List;
import java.util.Set;

public class Question {
	private String questionId;
	private String question;
	private Set<String> answer;
	
	
	public String getQuestionId() {
		return questionId;
	}
	public String getQuestion() {
		return question;
	}
	
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public void setQuestion(String question) {
		this.question = question;
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
	public Set<String> getAnswer() {
		return answer;
	}
	public void setAnswer(Set<String> answer) {
		this.answer = answer;
	}
	
	
	
	
	
	
}

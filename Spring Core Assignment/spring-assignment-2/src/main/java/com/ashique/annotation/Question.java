package com.ashique.annotation;

import java.util.List;

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
	
	
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", answer=" + answer + "]";
	}

	
	
}

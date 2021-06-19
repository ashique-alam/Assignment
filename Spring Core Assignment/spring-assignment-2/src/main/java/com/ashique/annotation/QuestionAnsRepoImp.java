package com.ashique.annotation;

import java.util.ArrayList;
import java.util.List;

public class QuestionAnsRepoImp implements QuestionAnsRepo{

	public Question findAll() {
		Question question=new Question();
		
		question.setQuestionId("100");
		question.setQuestion("This is my first question");
		
		List<String> answer=new ArrayList<String>();
		answer.add("This is my first answer");
		answer.add("This is my second answer");
		
		question.setAnswer(answer);
		return question;
	}

}

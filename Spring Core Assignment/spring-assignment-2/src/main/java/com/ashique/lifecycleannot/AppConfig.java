package com.ashique.lifecycleannot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Question getQuestion() {
		Question question=new Question();
		question.setQuestion("This is my question ?");
		question.setQuestionId("101");
		
		List<String> ans=new ArrayList<String>();
		ans.add("This is my first ans");
		ans.add("This is my second ans");
		
		question.setAnswer(ans);
		
		return question;
	}
}

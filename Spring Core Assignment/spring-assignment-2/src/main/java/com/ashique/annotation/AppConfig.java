package com.ashique.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

	@Bean(name="questionService")
	public QuestionService getCustomerService() {
		QuestionServiceImpl service=new QuestionServiceImpl();
		service.setQuestionAnsRepo(getQuestionAnsRepository());
		return service;
	}
	
	@Bean(name="questionRepository")
	public QuestionAnsRepo getQuestionAnsRepository() {
		return new QuestionAnsRepoImp();
	}
}

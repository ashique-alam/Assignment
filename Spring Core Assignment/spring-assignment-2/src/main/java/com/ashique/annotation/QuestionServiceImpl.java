package com.ashique.annotation;


public class QuestionServiceImpl implements QuestionService {
	private QuestionAnsRepo questionAnsRepo;

	public void setQuestionAnsRepo(QuestionAnsRepo questionAnsRepo) {
		this.questionAnsRepo = questionAnsRepo;
	}

	public Question findAll() {
		return questionAnsRepo.findAll();
	}

	
}

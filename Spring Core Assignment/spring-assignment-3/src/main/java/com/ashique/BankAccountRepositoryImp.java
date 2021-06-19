package com.ashique;

import java.util.ArrayList;
import java.util.List;

public class BankAccountRepositoryImp implements BankAccountRepository{
	
	List<BankAccount> account;
	

	public BankAccountRepositoryImp() {
		this.account = new ArrayList<BankAccount>();
	}

	public double getBalance(long accountId) {
		
		return 0;
	}

	public double updateBalance(long accountId, double newBalance) {
		return 0;
	}

}

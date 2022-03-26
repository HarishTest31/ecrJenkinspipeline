package com.account;

public class account {
	private String name;
	private String accountNo;
	private int initialBalance;
	public account(String name, String accountNo, int initialBalance) {
		super();
		this.name = name;
		this.accountNo = accountNo;
		this.initialBalance = initialBalance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getInitialBalance() {
		return initialBalance;
	}
	public void setInitialBalance(int initialBalance) {
		this.initialBalance = initialBalance;
	}


}
package com.account;

import com.google.gson.Gson;

public class transactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
account a = new account("Harish", "62047684657",0);
System.out.println(a.getName());
System.out.println(a.getAccountNo());
System.out.println(a.getInitialBalance());
Gson g1 = new Gson();
String trans = g1.toJson(a);
System.out.println(trans);
	}

}
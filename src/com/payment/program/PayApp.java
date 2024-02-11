package com.payment.program;

public class PayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating the child class objects including banking
		UPI upi=new UPI();
		Wallet wt=new Wallet();
		Card cd=new Card();
		Banking bk=new Banking();
		bk.BankPayments(upi);
		bk.BankPayments(wt);
		bk.BankPayments(cd);

	}

}

package application;


import entities.Account_01;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program_23 {

	public static void main(String[] args) {
		
		Account_01 acc1 = new Account_01(1001, "Alex", 1000.0);
		acc1.withdraw(200.00);
		System.out.println(acc1.getBalance());
		
		Account_01 acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account_01 acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());

	}

}

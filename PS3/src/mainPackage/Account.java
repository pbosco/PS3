package mainPackage;

import java.util.Date;

public class Account {
	
	// list of private variables
	
	private int ID;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	//no argument constructor
	public Account(){
		this.ID = 0;
		this.balance= 0;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
	}
	//create the default account
	public Account(int ID, double balance){
		this.ID = ID;
		this.balance = balance;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
	}
	//get methods
	public int getID(){
		return ID;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	public Date getDateCreated(){
		return dateCreated;
		
	}
	
	public double getMonthlyInterestRate(){
		return annualInterestRate / 12;
	}
	
	//set methods
	
	public void setID(int ID){
		this.ID = ID;
	}
	
	public void setBalance(double balance){
		this.balance = ID;
	}
	
	public void setAnnualInterestRate(double InterestRate){
		this.annualInterestRate = InterestRate;
	}
	
	//withdraw and deposit methods
	
	public void withdraw(double amount) throws InsufficientFundsException{
		if(balance < amount){
			throw new InsufficientFundsException();
		}
		else{
			balance = balance - amount;
		}
		
	}
	
	public void deposit(double amount){
		balance = balance + amount;
	}
	
	

}

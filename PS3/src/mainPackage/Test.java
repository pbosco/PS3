package mainPackage;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		//fail("Not yet implemented");
		
		Account PeytonBosco = new Account(1122 , 20000);
		PeytonBosco.setAnnualInterestRate(4.5);
		
		try{
			PeytonBosco.withdraw(2500);
		} catch (InsufficientFundsException e){			
		}
		
		PeytonBosco.deposit(3000);
		System.out.println("Your balance is $" + PeytonBosco.getBalance());
		
		System.out.println("Your monthly interest is " + PeytonBosco.getMonthlyInterestRate());
		
		System.out.println("This acccount was created on " + PeytonBosco.getDateCreated());
	}

}

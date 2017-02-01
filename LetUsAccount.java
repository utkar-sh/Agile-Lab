import java.util.Scanner;

class LetUsAccount{
	public static void main(String args[]){
		Account obj2 = new Account();
		obj2.getInfo();
		obj2.withdrawFunds();
	}
	
}

class Account{
	double balance;
	Scanner accInfo = new Scanner(System.in);
	
	void getInfo(){
		System.out.println("Enter your balance: ");
		balance = accInfo.nextDouble();
	}
	
	void withdrawFunds(){
		double deductAmt;
		System.out.println("Enter debit amount: ");
		deductAmt = accInfo.nextDouble();
		System.out.println("The Balance in the account is: " + balance);
		if(balance > deductAmt){
			balance -= deductAmt;
			System.out.println("Your new balance is: " + balance);
		}
		
		else{
			System.out.println("Insufficient funds, cannot withdraw.");
		}
	}
}
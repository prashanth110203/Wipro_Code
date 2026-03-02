package prashanth;
//USE CASE (2)
class Bank_account{
	private int deposit;
	private int withdrawal;
	
	public void setDeposit(int deposit) {
		this.deposit= deposit;
 
	}
	public void setWithdrawal(int withdrawal) {
		this.withdrawal= withdrawal;
 
	}
	public int getDeposit() {
		return deposit;
	}
	public int getWithdrawal() {
		return withdrawal;
	}
}
 
public class Practice1 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank_account a = new Bank_account();
		a.setDeposit(20000);
		a.setWithdrawal(10000);
		System.out.println("Deposited amount: "+a.getDeposit());
		System.out.println("Withdrawal Amount: "+a.getWithdrawal());
 
	}
 
}
package account;

public class AccountTeste01 {
	
	public static void displayAccount(Account accountToDisplay) {
		
		System.out.printf("%s %n%.2f", accountToDisplay.getNome(), accountToDisplay.getBalance());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account teste01 = new Account("testando",0.0);
		
		teste01.setNome("jos�");
		teste01.setBalance(1000.0);
		
		displayAccount(teste01);	
		
	}

}

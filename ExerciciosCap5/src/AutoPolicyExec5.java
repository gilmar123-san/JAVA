public class AutoPolicyExec5 {
	private int accountNumber; // número da conta da apólice
	private String makeAndModel; // carro ao qual a apólice é aplicada
	private String state; // abreviatura do estado com duas letras

// construtor
	public AutoPolicyExec5(int accountNumber, String makeAndModel, String state) {
		this.accountNumber = accountNumber;
		this.makeAndModel = makeAndModel;
		setState(state);
	}

// define o accountNumber
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

// retorna o accountNumber
	public int getAccountNumber() {
		return accountNumber;
	}

// configura o makeAndModel
	public void setMakeAndModel(String makeAndModel) {
		this.makeAndModel = makeAndModel;
	}

// retorna o makeAndModel
	public String getMakeAndModel() {
		return makeAndModel;
	}

// define o estado
	public void setState(String state) {
		if (state.equals("CT") || //
				state.equals("MA") || //
				state.equals("ME") || //
				state.equals("NH") || //
				state.equals("NJ") || //
				state.equals("NY") || //
				state.equals("PA") || //
				state.equals("VT")) {
			this.state = state;
		} else {
			this.state = "empty";
			System.out.println("Erro! Estado inválido");
		}
	}

// retorna o estado
	public String getState() {
		return state;
	}

// método predicado é retornado se o estado tem seguros “sem culpa”
	public boolean isNoFaultState() {
		boolean noFaultState;
// determina se o estado tem seguros de automóvel “sem culpa” 
		switch (getState()) // obtém a abreviatura do estado do objeto AutoPolicy
		{
		case "MA":
		case "NJ":
		case "NY":
		case "PA":
			noFaultState = true;
			break;
		default:
			noFaultState = false;
			break;
		}

		return noFaultState;
	}
} // fim da classe AutoPolicy
/**
 * @author Gilmar
 */

import java.security.SecureRandom;

public class Server {

	private static final SecureRandom randomNumbers = new SecureRandom();

	private enum status {
		CONTINUE, WOM, LOSE
	};

	private static final int TWO = 2;
	private static final int THREE = 3;
	private static final int SEVEN = 7;
	private static final int ELEVEN = 11;
	private static final int TWELVE = 12;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		status statusGame;
		int retornoDados = getDados();
		int meusPontos = 0;

		switch (retornoDados) {
		case TWO:
		case THREE:
		case TWELVE:
			statusGame = status.LOSE;
			break;
		case SEVEN:
		case ELEVEN:
			statusGame = status.WOM;
			break;
		default:
			statusGame = status.CONTINUE;
			meusPontos = retornoDados;
			System.out.printf("Pontos: %d%n",meusPontos);
		}
		
		while(statusGame == status.CONTINUE){
			retornoDados = getDados();
			if(retornoDados == meusPontos) {
				statusGame = status.WOM;				
			}else if(meusPontos == SEVEN){
				statusGame = status.LOSE;
			}
		}
		
		if(statusGame == status.WOM) {
			System.out.println("Você venceu!****");
		}else {
			System.out.println("Você perdeu!");
		}

	}

	public static int getDados() {
		int radomDados1 = 1 + randomNumbers.nextInt(6);
		int radomDados2 = 1 + randomNumbers.nextInt(6);
		System.out.printf("Dados lançados %d + %d = %d.%n",radomDados1, radomDados2, radomDados1+radomDados2);
		return radomDados1 + radomDados2;
	}

}

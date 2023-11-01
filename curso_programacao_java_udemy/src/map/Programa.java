package map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o caminho do arquivo com os candidatos:");
		String path = sc.nextLine();
		System.out.println("Lido: " + path);
		try (BufferedReader bf = new BufferedReader(new FileReader(path))) {

			Map<Candidato, Integer> votos = new TreeMap<>();
			String linha = bf.readLine();
			Integer auxVotos = 0;
			
			while (linha != null) {
				String[] capturado = linha.split(",");

				Candidato candidato = new Candidato(new Pessoa(capturado[0]), Integer.parseInt(capturado[1].trim()));				
				
				if(votos.containsKey(candidato)) {
					auxVotos = votos.get(candidato);
				}
				
				votos.put(candidato, Integer.parseInt(capturado[1].trim())+auxVotos);
				linha = bf.readLine();
				auxVotos = 0;
			}
			
			System.out.println("\nCandidatos | Votos\n");
			for (Candidato candidato : votos.keySet()) {								
				System.out.printf("%s: - Votos: %d %n", candidato.getCandidato().getNomeCompleto(), votos.get(candidato));
			}	
			
			System.out.printf("%nO vencedor é: %s com %d votos.", vencedor(votos).getCandidato().getNomeCompleto(), votos.get(vencedor(votos)));

		} catch (Exception e) {
			System.out.println("Error: " + e);
		}

	}
	
	public static Candidato vencedor(Map<Candidato, Integer> votos) {
		
		Candidato candidatoVencedor = null;
		
		for (Candidato candidato : votos.keySet()) {
			
			if(candidatoVencedor == null) {
				candidatoVencedor = candidato;
			}else if(votos.get(candidato) > votos.get(candidatoVencedor)) {				
				candidatoVencedor = candidato;
			}
			
		}
		
		return candidatoVencedor;		
	}

}
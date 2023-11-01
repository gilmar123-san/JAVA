package lendoArquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaLendoArquivo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o caminho do arquivo: ");
		String path = sc.nextLine();

		List<String> list = lerArquivo(path);
		gerarArquivo(list, path);

		sc.close();
	}

	public static List<String> lerArquivo(String path) {
		List<String> list = new ArrayList<>();

		try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
			String line = bf.readLine();

			while (line != null) {
				String[] textoSeparado = line.split(",");
				String nome = textoSeparado[0];
				Double preco = Double.parseDouble(textoSeparado[1]);
				Integer quantidade = Integer.parseInt(textoSeparado[2]);
				ProdutoLendoArquivos pla = new ProdutoLendoArquivos(nome, preco, quantidade);
				list.add(pla.toString());
				line = bf.readLine();
			}
			System.out.println(list);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		return list;
	}

	public static void gerarArquivo(List<String> list, String path) {
		File file = new File(path);
		String caminho = file.getParent();
		boolean sucess = new File(caminho + "\\out").mkdir();
		if (sucess) {
			caminho += "\\saida.csv";
		} else {
			caminho += "\\out\\saida.csv";
		}
		try (BufferedWriter bf = new BufferedWriter(new FileWriter(caminho))) {

			for (String item : list) {
				bf.write(item);
				bf.newLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e);
		}
	}
}

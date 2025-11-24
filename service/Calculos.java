package service;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import view.Leitor;

public class Calculos {
	List<Integer> listaConjunto;
	Leitor leitor = new Leitor();

	public Calculos() {
		listaConjunto = new ArrayList<>();
	}

	public void registrarConjunto() {
		
		int repeticoes = leitor.quantidadeRepeticoes();
		int [] listaConjunto2 = new int[repeticoes];
		
		for (int i = 0; i < repeticoes; i++) {
			System.out.print((i + 1) + "º número: ");
			int numero = leitor.registrarNumero();
			listaConjunto2[i] = numero;			
			Arrays.sort(listaConjunto2);
		}
		for (int num : listaConjunto2) {
			System.out.print(num + " ");

		}
	}

	public void gerenciarSistema(int opcao, Leitor leitor) {

		switch (opcao) {
		case 1:
			
			break;
		}
	}

}

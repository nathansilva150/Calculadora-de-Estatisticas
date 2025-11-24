package main;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao = 1;
		int conjunto = 0;
		
		do {
		System.out.println("\n========< Calculadora Estatística >=========");
		System.out.println("| 1 - Registrar um novo conjunto           |");
		System.out.println("| 2 - Calcular estatísticas                |");
		System.out.println("| 0 - Encerrar programa                    |");
		System.out.println("============================================");
		System.out.print("Digite uma opcção: ");
		opcao = leia.nextInt();
		
		switch(opcao) {
		case 1:
			List<Double> listaRAM = new ArrayList<>();
			System.out.print("\nDigite quantos números deseja registrar: ");
			int repeticoes = leia.nextInt();
			conjunto++;
			
			for (int i = 0; i < repeticoes; i++) {
				System.out.print("Digite o " + (i + 1) + "º número: ");
				double numero = leia.nextDouble();
				listaRAM.add(numero);
			}
			
			break;
		}
		
		} while (opcao != 0);
		
	}

}

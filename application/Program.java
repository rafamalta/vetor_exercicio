package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Hotel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Hotel[] quartos = new Hotel[10];

		System.out.print("Quantos estudantes vao irao se hospedar? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();

			quartos[quarto] = new Hotel(nome, email);

		}

		for (int i = 0; i < quartos.length; i++) {

			if (quartos[i] != null) {

				System.out.println(i + ": " + quartos[i]);

				sc.close();
			}
		}
	}
}

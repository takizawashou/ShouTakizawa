package executionanimal;

import java.util.Scanner;

import processanimal.AnimalUtil;
import processanimal.Processanimal;

public class Executionanimal {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("コンソールに文字を入力してください");

		String input = scanner.nextLine();

		// 入力処理
		String[] animals = input.split(",");

		for (String a : animals) {
			Processanimal animal = AnimalUtil.createAnimal(a);
			AnimalUtil.printAnimal(animal);
			System.out.println();
		}

		scanner.close();

	}

}

package adventure;

import java.util.Scanner;

import status.Status;

public class Adventure {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("名前を入力してください：");
		String name = scanner.nextLine();

		// プレイヤーステータス作成（コンストラクタで name を渡す）
		Status player = new Status(name);

		// 表示
		System.out.println("\nこんにちは 「" + player.getName() + "」 さん");
		System.out.println("ステータス");
		System.out.println("HP：" + player.getHp());
		System.out.println("MP：" + player.getMp());
		System.out.println("攻撃力：" + player.getAttack());
		System.out.println("素早さ：" + player.getSpeed());
		System.out.println("防御力：" + player.getDefense());

		System.out.println("\nさあ冒険に出かけよう！");

	}
}

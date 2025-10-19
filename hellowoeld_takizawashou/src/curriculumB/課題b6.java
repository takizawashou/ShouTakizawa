package curriculumB;

import java.util.Random;
import java.util.Scanner;


public class 課題b6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("商品名を「、」区切りで入力してください:");
        String input = sc.nextLine();

        String[] products = input.split("、");

        for (String product : products) {
            product = product.trim();

            int randomNum = rand.nextInt(12); 
            switch (product) {
                case "テレビ":
                case "ディスプレイ":
                    int remaining = 11 - randomNum;
                    System.out.println(product + "の残り台数は" + (remaining >= 0 ? remaining : 0) + "台です");
                    break;

                case "パソコン":
                case "冷蔵庫":
                case "扇風機":
                case "洗濯機":
                case "加湿器":
                    System.out.println(product + "の残り台数は" + (randomNum >= 0 ? randomNum : 0) + "台です");
                    break;

                default:
                    System.out.println(product + "は指定の商品ではありません");
                    break;
            }
        }

        sc.close();
    }
}


package processprefecture;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import prefecture.Prefecture;

public class Processprefecture {

    public static void main(String[] args) {

        Prefecture[] prefectures = {
            new Prefecture("北海道", "札幌市", 83424),
            new Prefecture("青森県", "青森市", 9646),
            new Prefecture("岩手県", "盛岡市", 15275),
            new Prefecture("宮城県", "仙台市", 7282),
            new Prefecture("秋田県", "秋田市", 11638),
            new Prefecture("山形県", "山形市", 9323),
            new Prefecture("福島県", "福島市", 13784),
            new Prefecture("茨城県", "水戸市", 6097),
            new Prefecture("栃木県", "宇都宮市", 6408),
            new Prefecture("群馬県", "前橋市", 6362),
            new Prefecture("埼玉県", "さいたま市", 3798)
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("番号をカンマ区切りで入力してください：");
        String input = scanner.nextLine();

        // 昇順・降順入力
        System.out.print("昇順なら asc、降順なら desc を入力してください：");
        String order = scanner.nextLine();

        String[] indexes = input.split(",");
        List<Prefecture> selectedList = new ArrayList<>();

        // 抽出
        for (String idx : indexes) {
            int i = Integer.parseInt(idx.trim());
            if (i >= 0 && i < prefectures.length) {
                selectedList.add(prefectures[i]);
            }
        }

        if (order.equalsIgnoreCase("asc")) {
            selectedList.sort(Comparator.comparingDouble(Prefecture::getArea));
        } else {
            selectedList.sort(Comparator.comparingDouble(Prefecture::getArea).reversed());
        }

        // 出力
        for (Prefecture p : selectedList) {
            p.print();
        }

        scanner.close();
    }
}


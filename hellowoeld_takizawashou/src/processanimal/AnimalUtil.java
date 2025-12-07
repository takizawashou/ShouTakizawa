package processanimal;

public class AnimalUtil {

	
	 public static String getScientificName(String name) {
	        switch (name) {
	            case "ライオン":
	                return "パンテラ レオ";
	            case "ゾウ":
	                return "ロキソドンタ・サイクロティス";
	            case "パンダ":
	                return "アイルロポダ・メラノレウカ";
	            case "チンパンジー":
	                return "パン・トゥログロディテス";
	            case "シマウマ":
	                return "チャップマンシマウマ";
	            case "インコ":
	                return "不明";
	            default:
	                return "不明";
	        }
	    }

	    public static Processanimal createAnimal(String data) {
	        String[] parts = data.split(":");
	        String name = parts[0];
	        double length = Double.parseDouble(parts[1]);
	        int speed = Integer.parseInt(parts[2]);
	        String scientific = getScientificName(name);

	        return new Processanimal(name, length, speed, scientific);
	    }

	    // 出力処理
	    public static void printAnimal(Processanimal a) {
	        System.out.println("動物名：" + a.getName());
	        System.out.println("体長：" + a.getLength() + "m");
	        System.out.println("速度：" + a.getSpeed() + "km/h");
	        System.out.println("学名：" + a.getScientificName());
	    }
}

package selfintroduction;

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60.0);

		System.out.println("名前は" + person1.getName() + "です");
		System.out.println("年は" + person1.getAge() + "です");
		System.out.println("BMIは" + person1.bmi() + "です");

		System.out.println("合計" + Person.getCount() + "人です");
	}
}

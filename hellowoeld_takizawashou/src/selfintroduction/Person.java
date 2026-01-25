package selfintroduction;

public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;
	private static int count = 0;

	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++;
	}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double bmi() {
		double bmi = this.weight / (this.height * this.height);
		return Math.round(bmi * 100) / 100.0;
	}

	public static int getCount() {
		return count;
	}
}
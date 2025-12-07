package processanimal;

public class Processanimal {
	
	private String name;
    private double length;
    private int speed;
    private String scientificName;

    public Processanimal(String name, double length, int speed, String scientificName) {
        this.name = name;
        this.length = length;
        this.speed = speed;
        this.scientificName = scientificName;
    }

    public String getName() { return name; }
    public double getLength() { return length; }
    public int getSpeed() { return speed; }
    public String getScientificName() { return scientificName; }

}

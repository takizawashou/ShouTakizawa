package curriculumB;

public class 課題b5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 20; j++) {
                System.out.print(String.format("%03d×%03d=%03d\t", i, j, i * j));
            }
            System.out.println(); 
        }
    }
}

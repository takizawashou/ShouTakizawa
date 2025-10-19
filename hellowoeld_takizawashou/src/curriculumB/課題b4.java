package curriculumB;

public class 課題b4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(String.format("%02d×%02d=%02d\t", i, j, i * j));
            }
            System.out.println(); 
        }
    }
}




package curriculumB;

import java.util.Scanner;

public class 課題b7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        while (true) {
            System.out.print("生徒の人数を入力してください（2以上）: ");
            N = sc.nextInt();
            if (N >= 2) break;
            System.out.println("2人以上を入力してください。");
        }

        String[] subjects = {"英語", "数学", "理科", "社会"};
        int[][] scores = new int[N][subjects.length];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < subjects.length; j++) {
                System.out.print((i + 1) + "人目の「" + subjects[j] + "」の点数を入力してください: ");
                scores[i][j] = sc.nextInt();
            }
        }

        double[] studentAvg = new double[N];
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < subjects.length; j++) {
                sum += scores[i][j];
            }
            studentAvg[i] = sum / (double) subjects.length;
        }

        double[] subjectAvg = new double[subjects.length];
        for (int j = 0; j < subjects.length; j++) {
            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum += scores[i][j];
            }
            subjectAvg[j] = sum / (double) N;
        }

        double totalSum = 0;
        for (int i = 0; i < N; i++) {
            totalSum += studentAvg[i];
        }
        double overallAvg = totalSum / N;

        System.out.println();
        for (int i = 0; i < N; i++) {
            System.out.printf("%d人目の平均点は%.2f点です。\n", (i + 1), studentAvg[i]);
        }
        System.out.println();

        for (int j = 0; j < subjects.length; j++) {
            System.out.printf("%sの平均点は%.2f点です。\n", subjects[j], subjectAvg[j]);
        }
        System.out.printf("全体の平均点は%.2f点です。\n", overallAvg);

        sc.close();
    }
}



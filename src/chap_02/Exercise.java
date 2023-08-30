package chap_02;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;

        while (run)
        {
            System.out.println("------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택 :");

            int selectNo = scanner.nextInt();

            if (selectNo == 1){
                System.out.print("학생의 수 입력 : ");
                int index = scanner.nextInt();
                scores = new int[index];
            }
            else if (selectNo == 2)
            {
                for (int i =0; i < scores.length; i++) {
                    System.out.print((i + 1) + "번째 학생의 점수 입력 : ");
                    scores[i] = scanner.nextInt();
                }
            }
            else if (selectNo == 3)
            {
                for (int i =0; i < scores.length; i++)
                    System.out.println((i+1) + "번째 학생의 점수 : " + scores[i]);
            }
            else if (selectNo == 4)
            {
                int hap = 0;
                double avg = 0.0;
                for (int i = 0 ; i < scores.length; i++)
                {
                    hap += scores[i];
                }
                avg = (double) hap / scores.length;
                System.out.println("학생들의 성적의 합계 : " + hap);
                System.out.println("학생들의 성적의 평균 : " + avg);
            }
            else
            {
                System.out.println("프로그램을 종료합니다.");
                run = false;
            }
        }
    }
}

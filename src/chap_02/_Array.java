package chap_02;


public class _Array {
    public static void main(String[] args) {
        int[] intArray;
        double[] doubleArray;
        String[] StringArray;

        String names[] = {"안홍제","이인표","이정택"};

        // 배열 기본 예제
        int[] score = {90,87,45};
        int hap = 0;
        double avg = 0.0;

        for (int i = 0; i < score.length; i++)
        {
            System.out.println((i+1) + "번째 학생의 성적 : " + score[i]);
            hap += score[i];
        }
        avg = hap / score.length;

        System.out.println("성적의 합계 : " + hap);
        System.out.println("성적의 평균 : " + avg);


        // 배열 기본 예제 2
        int[] scores;
        scores = new int[] {83,90,87};
        int sum1 = 0;

        for (int i = 0 ; i < scores.length; i++)
        {
            sum1 += scores[i];
        }
        System.out.println("총합 : " + sum1);

        // 배열의 복사
        int[] oldIntArray = {1,2,3};
        int[] newIntArray = new int[5];

        for (int i = 0; i < 3; i++)
            newIntArray[i] = oldIntArray[i];

        for(int i = 0; i < newIntArray.length; i++)
            System.out.print(newIntArray[i] + " , ");

        System.out.println(' ');

        // 향상된 for문
        int[] grades = { 95, 71, 84, 93, 87 };

        int sum = 0;

        for (int grade : grades) {
            sum = sum + grade;
        }
        System.out.println("점수 총합 : " + sum);

        double avg1 = (double) sum / 5;
        System.out.println("점수 평균 : " + avg1);






    }
}

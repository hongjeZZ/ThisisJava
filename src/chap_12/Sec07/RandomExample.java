package chap_12.Sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {

        // 선택번호 뽑기
        int[] selectNum = new int[6];
        Random random = new Random(3); // 시드 넘버는 이 수를 이용해서 난수를 생성한다는 의미
        System.out.print("선택번호 :");
        for (int i = 0; i < 6 ; i++){
            selectNum[i] = random.nextInt(45) + 1; // 1 ~ 45 까지의 난수 저장
            System.out.print(selectNum[i] + "  ");
        }
        System.out.println();

        // 당첨번호 뽑기
        int[] winningNum = new int[6];
        random = new Random(3);
        System.out.print("당첨번호 :");
        for (int i = 0; i < 6; i++)
        {
            winningNum[i] = random.nextInt(45) + 1;
            System.out.print(winningNum[i]+ "  ");
        }
        System.out.println();

        // 당첨 여부 (배열 비교)
        Arrays.sort(winningNum);
        Arrays.sort(selectNum);             // 비교 전 배열의 정렬
        boolean res = Arrays.equals(selectNum,winningNum);
        System.out.print("당첨여부 : ");
        if (res)
            System.out.println("당첨입니다. !!!!!!!!!!!!");
        else
            System.out.println("꽝입니다.");

        // 시드 값이 같으면 당첨이고, 다르다면 당첨이 나올 확률은 매우 적다.
    }
}

package chap_11.Sec03;
// 실행 예외 2가지
// 예외 별로 catch 문 작성

public class ExceptionHandlingExample {
    public static void main(String[] args) {

        String[] array = {"100","1oo"};

        for (int i = 0; i <= array.length; i++){    // 일부로 범위를 다르게 하여 ArrayIndexOutOfBoundsException 예외 발생
            try {
                System.out.println(array[i]);
                int value = Integer.parseInt(array[i]); // "1oo"는 정수가 아니라서 NumberFormatException 예외 발생
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("항목수가 부족합니다. 다시 확인해주세요.");
            } catch (NumberFormatException e) {
                System.out.println("숫자로 변환할 수 없는 항목이 있습니다. 다시 확인해 주세요.");
            }
        }
    }
}

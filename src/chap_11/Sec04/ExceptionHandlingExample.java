package chap_11.Sec04;

public class ExceptionHandlingExample {
    public static void main(String[] args) {

        String[] array = {"10","1oo",null,"2000"};

        for (int i = 0; i <= 4; i++) {
            try {
                System.out.println(array[i].length());      // 예외로 인해 try 문의 다음 코드는 실행되지 않음.
                                                            // for문이 try문을 포함하기 때문에 반복할 시 다시 try 문 실행
                int value = Integer.parseInt(array[i]);
            } catch (NumberFormatException e) {
                System.out.println("숫자로 변환할 수 없는 항목이 있습니다. 다시 확인해 주세요.");
            } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {         // 예외처리를 합칠 때 '|' 파이프 기호 사용
                System.out.println("문자열이 없거나 항목 수가 부족합니다. 다시 확인해주세요.");
            } catch (Exception e){
                System.out.println("예상치 못한 예외가 발생하였습니다.");
            }
        }
    }
}

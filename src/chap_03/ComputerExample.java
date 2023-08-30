package chap_03;

public class ComputerExample {
    public static void main(String[] args) {

        // 외부객체에서 메소드 이용 시 참조선언
        Computer myCom = new Computer();

        int result = myCom.sum(1,2,3);
        System.out.println(result);

        int result2 = myCom.sum(1,2,3,4,5);
        System.out.println(result2);

        /// 배열 선언 및 메소드 실행
        int[] values;
        values = new int[] {1,2,3,4,5};
        int result3 = myCom.sum(values);
        System.out.println(result3);

        int result4 = myCom.sum(new int[] {1,2,3,4,5,});
        System.out.println(result4);
    }
}

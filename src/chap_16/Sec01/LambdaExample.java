package chap_16.Sec01;
// 인터페이스의 구현 객체를 람다식으로 표현하려면 단 하나의 추상 메소드를 가져야만 한다.
// 즉, 이러한 인터페이스를 함수형 인터페이스라고 한다.

public class LambdaExample {
    public static void main(String[] args) {

        // 람다식
        action((x,y)->{
            int result = x + y;
            System.out.println("result : " + result);
        });

        action(((x, y) -> {
            int result = x - y;
            System.out.println("result : " + result);
        }));

        // 인터페이스 익명 객체 구현
        action(new Calculable() {
            @Override
            public void calculate(int x, int y) {
                int result = x * y;
                System.out.println("result : " + result);
            }
        });
    }
    public static void action(Calculable calculable){
        // 데이터
        int x = 10;
        int y = 4;
        calculable.calculate(x,y);
    }
}

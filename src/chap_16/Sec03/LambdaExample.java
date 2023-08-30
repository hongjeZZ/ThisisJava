package chap_16.Sec03;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        // 정석적인 방법
        person.action((x,y) -> {
            double result = x + y;
            return  result;
        });


        // 생략 ( 하나의 값이 주어지면 자동적으로 return 값으로 판단한다.)
        person.action((x,y)-> x + y);

        // 메소드 이용
        person.action((x, y) -> sum(x,y));
    }

    public static double sum(double x, double y){
        return (x + y);
    }
}

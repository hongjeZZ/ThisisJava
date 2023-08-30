package chap_03.Sec02.exam01;

public class Computer {
    // 매개변수 개수 상관없이 메소드 선언
    int sum(int ... values){
        int sum = 0;
        for (int i = 0; i < values.length; i++)
        {
            sum += values[i];
        }
        return sum;
    }

    // 메소드 오버로딩 = 매개변수의 종류 및 수가 다르면 추가 가능하다.
    double sum(double ... values){
        double sum = 0.0;
        for (int i =0; i < values.length; i++){
            sum += values[i];
        }
        return sum;
    }
}

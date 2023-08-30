package chap_03;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 생성자 선언
    // 생성자 오버로딩
    /*
    Car(){
        System.out.println("1");
    }
    Car(String model){
        this.model = model;
        System.out.println("2");
    }
    Car(String model, String color){
        this.model = model;
        this.color = color;
        System.out.println("3");
    }
    Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        System.out.println("4");
    }*/

    // 다른 생성자 호출 (중복 코드를 없앰)
    // 위의 방법처럼 하나 씩 호출하면 나중에 코드가 길어졌을 때 매우 복잡해짐
    Car(String model){
        this(model,"은색",250);
    }
    Car(String model, String color){
        this(model,color,250);
    }
    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}

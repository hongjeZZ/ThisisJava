package chap_13.Sec02.exam1;

public class GenericExample {
    public static void main(String[] args) {
        Product<Tv,String> product1 = new Product<>();

        product1.setKind(new Tv());
        product1.setModel("Samsung");

        Tv tv = product1.getKind();
        String str = product1.getModel();

        //________________________________________________________________________//

        Product<Car,String> product2 = new Product<>();

        product2.setKind(new Car());
        product2.setModel("현대자동차");

        Car car = product2.getKind();
        String str2 = product2.getModel();
    }
}

package chap_13.Sec02.exam2;

public class HomeAgency implements Rentable<Home>{
    @Override
    public Home rent() {
        return new Home();      // 리턴 타입이 무조건 Home 이여야 한다.
    }
}

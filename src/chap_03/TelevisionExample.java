package chap_03;

public class TelevisionExample {
    public static void main(String[] args) {
        // 다른 객체에서 클래스를 읽는 순간 코드가 실행됨 (1,2 출력 및 info 초기화)
        Television myTe = new Television();

        // 정적 필드도 객체로 생성 시 도트를 통해 읽기 및 쓰기 가능
        System.out.println(myTe.model);
        System.out.println(myTe.info);

        // 기존 정적 필드 사용
        System.out.println(Television.company);
    }
}

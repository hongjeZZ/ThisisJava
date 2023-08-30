package chap_12.Sec03.exam01;
// 객체 동등 비교 equals 메소드

public class Member {
    public String id;

    public Member(String id){
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member target){  // 매개변수가 Member 클래스면 target 변수로 타입변환을 시킨다.
                                            // Member target = (Member) obj ; 와 같은 코드
            if (id.equals(target.id))
                return true;
        }
        return false;
    }
}


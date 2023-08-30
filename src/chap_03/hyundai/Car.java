package chap_03.hyundai;

import chap_03.hankook.SnowTire;
import chap_03.hankook.Tire; // 자동 인포트
import chap_03.kumho.AllSeasonTire;

public class Car {
    chap_03.hankook.Tire tire1 = new chap_03.hankook.Tire();
    chap_03.kumho.Tire tire2 = new chap_03.kumho.Tire();  // 이럴 경우에는 인포트할 필요없음
    SnowTire tire3 = new SnowTire();
    AllSeasonTire tire4 = new AllSeasonTire();

}

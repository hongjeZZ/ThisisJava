package chap_12.Sec04.exam04;

import java.util.Properties;
import java.util.Set;
public class GetPropertyExample {
    // 키 값을 이용하여 시스템 프로퍼티 읽기
    public static void main(String[] args) {
        String osName = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");

        System.out.println(osName);
        System.out.println(userHome);
        System.out.println(userHome);

        // 전체 키와 값을 출력
        System.out.println("_____________________________");
        System.out.println(" key :  value");
        System.out.println("_____________________________");
        Properties props = System.getProperties();
        Set keys = props.keySet();

        for(Object objKey : keys) {
            String key = (String) objKey;
            String value = System.getProperty(key);
            System.out.printf("%-40s: %s\n",key,value);
        }
    }
}

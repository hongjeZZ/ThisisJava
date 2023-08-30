package chap_12.Sec05.exam03;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String data1 = "홍길동&이수홍/김자바,안홍제 김종욱";
        String[] arr = data1.split("&|,|/| ");          // | 기호를 통해 나눔

        for (String token : arr){
            System.out.println(token);
        }


        String data = "홍길동/이수홍/김자바";
        StringTokenizer st = new StringTokenizer(data,"/");     // StringTokenizer 은 하나의 기호만 가능

        System.out.println(st.countTokens());
        while(st.hasMoreTokens())
        {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}

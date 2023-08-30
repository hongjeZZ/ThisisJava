package chap_12.Sec05.exam01;

// 네트워크로 String 을 전달할 때 byte 배열로 보내야 한다.

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class BytesToStringExample {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String data = "자바";

        // String -> byte 배열 (UTF-8 인코딩) + 기본이 UTF-8 이라서 그냥 빈칸으로 하면 됨
        byte[] arr1 = data.getBytes();
        System.out.println("arr1 : " + Arrays.toString(arr1));

        // byte 배열 -> String (디코딩)
        String str1 = new String(arr1);
        System.out.println(str1);

        // String -> byte 배열 (EUC:KR 인코딩)
        byte[] arr2 = data.getBytes("EUC-KR");
        System.out.println("arr2 : " + Arrays.toString(arr2));

        // byte 배열 -> String
        String str2 = new String(arr2,"EUC-KR");
        System.out.println(str2);

    }
}

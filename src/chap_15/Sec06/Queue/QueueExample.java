package chap_15.Sec06.Queue;

import java.util.LinkedList;
import java.util.Queue;

// Queue = FIFO ; 선입선출
// Queue 인터페이스를 구현한 객체에는 LinkedList 가 있다.
// 따라서, Queue<> queue = new LinkedList<>(); 코드가 가능하다.

public class QueueExample {
    public static void main(String[] args) {

        Queue<Message> messageQueue = new LinkedList<>();

        messageQueue.offer(new Message("sendMail","안홍제"));
        messageQueue.offer(new Message("sendSns","김민교"));
        messageQueue.offer(new Message("sendKakaotalk","이인표"));

        while(!messageQueue.isEmpty()){
            Message message = messageQueue.poll();
            switch (message.command){
                case "sendMail":
                    System.out.println(message.to + "님에게 메일을 보냈습니다.");
                    break;
                case "sendSns":
                    System.out.println(message.to + "님에게 SNS 를 보냈습니다.");
                    break;
                case "sendKakaotalk":
                    System.out.println(message.to + "님에게 카카오톡을 보냈습니다.");
                    break;
            }
        }
    }
}

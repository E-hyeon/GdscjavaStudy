package springstart.sender;

public class SmsSender implements Sender {

    @Override
    public void sendMessage(String s) {
        System.out.print("SMS를 발송합니다: " + s);
        System.out.println();
    }
}

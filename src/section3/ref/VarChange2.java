package src.section3.ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; //변수값을 복사하는게 아니라 참조값을 복사
        System.out.println("dataA 참조값" + dataA.value);
        System.out.println("dataB 참조값" + dataB.value);

        //dataA변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA 참조값" + dataA.value);
        System.out.println("dataB 참조값" + dataB.value);

        //dataB변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA 참조값" + dataA.value);
        System.out.println("dataB 참조값" + dataB.value);
    }
}

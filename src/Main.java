public class Main {
    public static void main(String[] args) {
        Landline l1 = new Landline("8310584667");
        Landline l2 = new Landline("8453656945");

        l1.callNumber("8453656945");
        l2.receiveCall("8453656945");
        System.out.println(l2.answerCall());
    }
}
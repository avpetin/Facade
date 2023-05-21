public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println("сумма 0b00000010 + 0b00000011 = " + bins.sum("10", "11"));
        System.out.println("произведение 0b00000010 * 0b00000011 = " + bins.mult("10", "11"));
    }
}

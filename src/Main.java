public class Main {
    public static void main(String[] args) {
        Box<Integer> boxs = new Box<>(25);
        System.out.println(boxs);
        Box.method(boxs);
    }
}
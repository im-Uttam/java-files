public class IfElse {

    public static void compare(int x, int y) {
        if (x > y) {
            System.out.println("x is greater than y");
        } else if (x == y) {
            System.out.println("x is equal to y");
        } else {
            System.out.println("y is greater than x");
        }
    }

    public static void main(String[] args) {
        compare(19, 20);
        compare(50, 10);
    }
}
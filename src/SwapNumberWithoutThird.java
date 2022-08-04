public class SwapNumberWithoutThird {

    public static void swapNumbers(int a, int b) {
        b = b + a;
        a = b - a;
        b = b - a;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swapNumbers(a, b);
        System.out.printf("a is %d, b is %d %n", a, b); // a is 10, b is 20
    }

}

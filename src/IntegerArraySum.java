public class IntegerArraySum {

    public static void main(String[] args) {

        int[] array = { 10, 20, 30 };

        int sum = 0;

        for (int i : array)
            sum += i;

        System.out.print("sum of the given array { ");
        System.out.print(array[0]);
        System.out.print(", ");
        System.out.print(array[1]);
        System.out.print(", ");
        System.out.print(array[2]);
        System.out.print(", ");
        System.out.print("} is ");
        System.out.println(sum);

    }
}
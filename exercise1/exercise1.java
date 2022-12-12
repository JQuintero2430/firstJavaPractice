public class exercise1{
    public static void main(String args[]) {
        int numbers[] = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * (65 - 18 + 1) + 18);
            System.out.println(numbers[i]);
        }

    }
} 
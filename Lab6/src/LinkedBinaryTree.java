
 
public class LinkedBinaryTree{

    public static void main(String[] strings) {

        for (int number = 1; number <= 30000; number++) {
            int total = 0;
            int divisor = number - 1;

            while (divisor > 0) {

                if (number % divisor == 0) {
                    total += divisor;
                }
                divisor--;
            }

            if (number == total) {
                System.out.println(number);
            }

        }
    }
}
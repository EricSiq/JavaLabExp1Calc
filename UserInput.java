import java.util.Scanner;

class UserInput {
    Scanner scanner = new Scanner(System.in);

    // Method to get input for two integers from the user
    int[] getTwoIntegers() {
        int[] numbers = new int[2];
        System.out.println("Enter the first integer: ");
        numbers[0] = scanner.nextInt();
        System.out.println("Enter the second integer: ");
        numbers[1] = scanner.nextInt();
        return numbers;
    }

    // Method to get input for a single integer from the user
    int getSingleInteger() {
        System.out.println("Enter an integer: ");
        return scanner.nextInt();
    }

   
}

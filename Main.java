class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        UserInput userInput = new UserInput();
        int choice;
        do {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Fibonacci Sequence");
            System.out.println("6. Mean of Array");
            System.out.println("7. Variance of Array");
            System.out.println("8. Exit");
            
            choice = userInput.getSingleInteger(); // user's choice
            
            
    }
}

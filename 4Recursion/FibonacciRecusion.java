public class Fibonacci {

    /**
     * Calculates the nth Fibonacci number using recursion.
     *
     * @param n the index of the Fibonacci number to calculate
     * @return the nth Fibonacci number
     */
    public int fib(int n) {
        // Base case: For n <= 1, the Fibonacci number is simply n
        if (n <= 1) {
            return n;
        }

        // Recursive case: Calculate the nth Fibonacci number by summing the
        // (n-1)th and (n-2)th Fibonacci numbers
        return fib(n - 1) + fib(n - 2);
    }

    /**
     * Prints the first n Fibonacci numbers to the console.
     *
     * @param n the number of Fibonacci numbers to print
     */
    public void start() {
        int n = 40; // Number of Fibonacci numbers to print

        // Loop to iterate through the first n Fibonacci numbers
        for (int i = 0; i < n; i++) {
            // Calculate and print the ith Fibonacci number
            System.out.print(fib(i) + " ");
        }
    }
}
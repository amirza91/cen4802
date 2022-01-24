public class Main {
    /**
     * @author Altamush Mirza
     * @param args
     * @return returns the 10th term in the recursive method
     *
     * The Main method executes the recursive method and shows the 10th term
     */
    public static void main(String[] args) {
        int fibRec =0;
        fibRec = fibonacciRecursive(10 + 1);
        System.out.println("The 10th term of the the Fibonacci sequence is " + fibRec);


    }

    /**
     *
     * @param n
     * @return the integer for the recursive method
     *
     * This method is the method to do the Fibonacci recursive method. It takes a number, if less than or equal to 1
     * returns that number. if not, takes the int and subtracts 2 and takes the int and subtracts 1. Then adds both
     * integers.
     */
    private static int fibonacciRecursive(int n){   // creating the method to run the function for recursive
        // base case
        if (n<=1){
            return n;
        }

        // recursive case
        return fibonacciRecursive(n-2) + fibonacciRecursive(n-1);


    }
}

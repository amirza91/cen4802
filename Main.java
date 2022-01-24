public class Main {
    public static void main(String[] args) {
        int fibRec =0;
        fibRec = fibonacciRecursive(10 + 1);
        System.out.println("The 10th term of the the Fibonacci sequence is " + fibRec);


    }
    private static int fibonacciRecursive(int n){   // creating the method to run the function for recursive
        // base case
        if (n<=1){
            return n;
        }

        // recursive case
        return fibonacciRecursive(n-2) + fibonacciRecursive(n-1);


    }
}

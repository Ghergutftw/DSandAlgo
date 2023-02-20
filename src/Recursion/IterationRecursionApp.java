package Recursion;

public class IterationRecursionApp {
    public void calculateIterative(int n) {
        while (n > 0) {
            int k = n * n;
            System.out.println(k);
            n = n - 1;
        }
    }
    public void calculateRecursive(int n) {
        if (n > 0) {
            int k = n * n;
            System.out.println(k);
            calculateIterative(n-1);
        }
    }

    public static void main(String[] args) {
        IterationRecursionApp r = new IterationRecursionApp();
        r.calculateIterative(4);
        r.calculateRecursive(4);
    }

}

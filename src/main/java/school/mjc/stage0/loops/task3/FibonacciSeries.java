package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int prev1 = 0;
        int prev2 = 1;
        int sum = 0;
        System.out.println(0);
        System.out.println(1);
        for(int i = 0; i<lastFibonacci - 2; i++){
            sum = prev1 + prev2;
            System.out.println(sum);
            prev1 = prev2;
            prev2 = sum;

        }
    }
}

package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int prev = 0;
        for(int i = 0; i<lengthOfLastNumber;i++){
            prev = prev*10 +1;
            sum += prev;
        }
        System.out.println(9*sum);
    }
}

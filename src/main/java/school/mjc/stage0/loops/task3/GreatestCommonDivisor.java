package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second){
        int min = Math.min(first, second);
        int max_div = 1;

        for(int i = 2; i<=min;i++){
            if(first%i == 0 && second%i ==0){
                max_div = i;
            }
        }

        System.out.println(max_div);
    }
}

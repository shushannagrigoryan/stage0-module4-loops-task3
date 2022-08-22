package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        t = Math.abs(t);
        String str = "";
        String str1 = t + str;
        int sum = 0;
        for(int i =0 ; i< str1.length(); i++){
            sum+= Integer.parseInt(String.valueOf(str1.charAt(i)));
        }

        System.out.println(sum);
    }
}

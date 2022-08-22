package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        System.out.println("t = "+ t);
        String str = "";
        String str1 = t + str;
        int sum = 0;
        for(char i = str1.charAt(0); i< str1.length(); i++){
            sum+= Integer.parseInt(String.valueOf(i));
        }

        System.out.println(sum);
    }
}


//   https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/submissions/
public class LeetCode_countSteps {
    public static int numberOfSteps(int num) {
        return helper(num, 0);
        
    }

    private static int helper(int num, int i) {
        if(num==0){
            return i;
        }
        if(num%2==0){
            num=num/2;
            i=i+1;
            return helper(num, i);
        }
        else{
            return helper(num-1, ++i);
        }
    }

    public static void main(String[] args) {
        int n=14;
        System.out.println(numberOfSteps(n));
    }
}

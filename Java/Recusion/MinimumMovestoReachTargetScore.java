//  https://leetcode.com/problems/minimum-moves-to-reach-target-score/submissions/

public class MinimumMovestoReachTargetScore{
    public static int minMoves(int target, int maxDoubles) {
        return helper(target, maxDoubles,0);
    }

    private  static int helper(int target, int maxDouble,int cont) {
        if(target == 1){
            return cont;

        }
        if(maxDouble!=0&&target/2>0&&target%2==0){
           
            return helper(target/2,maxDouble-1,cont+1);
        
        }
        return helper(target-1, maxDouble, cont+1);

    }

    public static void main(String[] args) {
        System.out.println(minMoves(10,4));
    }
}
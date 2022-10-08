public class MinimumMovestoReachTargetScore{
    public static int minMoves(int target, int maxDoubles) {
        return helper(target, maxDoubles, 1,0);
    }

    private  static int helper(int target, int maxDoubles, int i,int cont) {
        if(target == i ){
            return cont;

        }
        if(maxDoubles !=0 && i*i<=target){
            return helper(target,maxDoubles-1,i*i,cont+1);
        }
        return helper(target, maxDoubles, i+1, cont+1);

    }

    public static void main(String[] args) {
        System.out.println(minMoves(5,0));
    }
}
public class TiranglePattern {

    public static void main(String[] args) {
        triangle1(4, 0);
        triangle2(4,0);
    }

    /*
    ****
    ***
    **
    *
    */
    public static void triangle1(int r, int c) {
        if (r == 0) {
            return;

        }
        // coloum is less than row
        if (c < r) {
            System.out.print(" * ");
            triangle1(r, c + 1);
        } else {
            System.out.println();
            triangle1(r - 1, 0);
        }
    }
    public static void triangle2(int r ,int c){
        if(r==0){
            return;

        }
        // coloum is less than row 
        if(c<r){

            triangle2(r, c+1);
            System.out.print(" * ");
        }
        else{
            triangle2(r-1, 0);
            System.out.println();
        }
    }
}

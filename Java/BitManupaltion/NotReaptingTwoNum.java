public class NotReaptingTwoNum {
    public static void main(String[] args) {
        int arr[]={2,2,1,5,5,1,4,3,3,6,6,7};
        int xor = 0; 
        
        for(int i=0; i<arr.length;i++){

            xor=(xor^arr[i]);
        }
        xor =(xor & ~(xor-1));

        int xor0=0, xor1=0;
        for (int i = 0; i < arr.length; i++) {
            if((arr[i]&xor)>0){

            xor1=xor1^arr[i];
            }
            else{
                xor0=xor0^arr[i];
            }
        } 
        System.out.printf("The first Number is %d %nThe second number is %d ", xor0 ,xor1);
    }
}

public class Bru_FindTwoNum {
    public static void main(String[] args) {
        int arr []= {8,9,5,2,4,6,8,9,5,4};
        for (int i = 0; i < arr.length; i++) {
            int count = 0; 
            for (int element : arr) {
                if(arr[i]==element){
                         count++;
                }
            }
            if(count==1){
                System.out.println(arr[i]);
            }
        }
    }
}

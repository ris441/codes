public class SubsetXor {
    public static void main(String[] args) {
    int arr [] ={4};
    //Qus . is to find  the xor of all subset xor 
    // ans is xor of all subset is zero because in subset all element occurs even times thats cancel the each other 
    if(arr.length>1){
        System.out.println(0);
    }
    else{
    System.out.println(arr[0]);
    }
    }
}

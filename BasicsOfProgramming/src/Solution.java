public class Solution {
    public static void difference(int a1[], int a2[]){
        int arr[] = new int[a2.length];
        int diff = 0;
        int carry = 0;
        for (int i = a2.length-1, j = a1.length-1; i >=0 ; i--,j--) {
            diff = j < 0 ? 0 : a1[j];
            if(a2[i]+carry >= diff){
                arr[i] = a2[i] + carry - diff;
                carry = 0;
            }else{
                arr[i] = a2[i] + 10 + carry - diff;
                carry = -1;
            }
        }
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(flag && arr[i] == 0){
                continue;
            }
            System.out.println(arr[i]);
            flag = true;
        }
    }

    public static void main(String[] args) {
        int arr1[] = {5 , 2, 5};
        int arr2[] = {5, 1, 5 };
        difference(arr2, arr1);
        System.out.println("Program khatam gya");
    }

}
// 0 0 0 2 0 0 0 7 8 9

// arr  8 -----
//5 6 7 4 5 4 8
//boolean flag = true;
//
//for(int i = 0; i< arr.length; i++){
//    if(arr[i] == 8){
//        flag = false;
//        }
//    if(flag){
//        continue;
//        }
//    System.out,println(arr[i]);
//        }
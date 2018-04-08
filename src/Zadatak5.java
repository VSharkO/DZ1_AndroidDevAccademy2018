public class Zadatak5 {
    public static void main(String[] args) {
        //5. Write a method that returns the largest element in a array.
        int[] arr = {-10,12,13,-14,15,16,22,99,87,28,38,56,43};
        int max=getMax(arr);
        System.out.print(max);
    }
     static int getMax(int[] arr){
        int max=arr[0];
        for(int i : arr){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
}

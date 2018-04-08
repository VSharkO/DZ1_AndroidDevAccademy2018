public class Zadatak6 {
    public static void main(String[] args) {
        //Write a method that reverses a array.
        int[] arr = {-10,12,13,-14,15,16,22,99,87,28,38,56,43};
        int arrR[]=reverseArray(arr);
        for(int i=0;i<arr.length;i++)
        System.out.print(arrR[i]+" ");
    }
    static int[] reverseArray(int[] arr){
        int tmp[]=new int[arr.length], j=0;

        for (int i=arr.length-1;i>=0;i--) {
            tmp[j]=arr[i];
            j++;
        }
        return tmp;
    }
}

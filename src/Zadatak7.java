public class Zadatak7 {
    public static void main(String[] args) {
        //7. Write a method that returns the elements on odd positions in a array

        int[] arr = {-10,12,13,-14,15,16,22,99,87,28,38,56,43,-46,13};
        int arrR[]=getOddElements(arr);

        System.out.print("Odd elements of array: ");

        for(int i=0;i<arr.length/2;i++) {
            System.out.print(arrR[i] + " ");
        }
    }

    static int[] getOddElements(int arr[]){
        int tmpLenght = arr.length/2,j=0;
        int[] tmp = new int[tmpLenght];
        for (int i=1; j<tmpLenght; i+=2){
            tmp[j] = arr[i];
            j++;
        }
        return tmp;
    }
}

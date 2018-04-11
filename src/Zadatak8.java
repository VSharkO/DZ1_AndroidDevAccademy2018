import java.util.ArrayList;

public class Zadatak8 {
    public static void main(String[] args) {
        //78. Write a method that takes a int number and returns a array of its digits.
        int num=182;
        int arrR[]=getNumDiggits(num);
        System.out.print("Digits: ");
        for(int i=0;i<arrR.length;i++)
            System.out.print(arrR[i]+" ");
    }
    static int[] getNumDiggits(int num){
        int temp,rez[];
        ArrayList<Integer> Digits = new ArrayList<>();

        while(num%10>0){
            temp=num%10;
            num/=10;
            Digits.add(temp);
        }

        rez=new int[Digits.size()];
        int j=0;

        for(int i=rez.length-1;i>=0;i--){
            rez[j]=Digits.get(i);
            j++;
        }
        return rez;
    }

}



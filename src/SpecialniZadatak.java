import java.util.Scanner;

public class SpecialniZadatak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int dimensionRows=scanner.nextInt();

        System.out.println("Enter the number of columns");
        int dimensionColumns=scanner.nextInt();
        fillMatrix(dimensionRows,dimensionColumns);
    }

    public static void fillMatrix(int dimRows,int dimColumns) {

        int maxNum = dimRows*dimColumns, number=1, max=maxNum*maxNum*10,rez;
        int matrix[][] = new int[dimRows][dimColumns];

        int lastRow=dimRows-1,firstColumn=0;
        int lastColumn=dimColumns-1,firstRow=0;


        StringBuilder sb = new StringBuilder();

        int maxSpaces=getSpaces(max);

        while(number<=maxNum){
                //Zadnji redci
                for (int i = lastColumn; i >= firstColumn; i--) {
                    matrix[lastRow][i] = number;
                    number++;
                }
                //prvi stupci
                for (int i = lastRow-1; i >= firstRow+1; i--) {
                    matrix[i][firstColumn] = number;
                    number++;
                }


                // prvi redci
                for (int i = firstColumn; i <= lastColumn; i++) {
                    matrix[firstRow][i] = number;
                    number++;
                }
                //zadnji stupci
                for (int i = firstRow+1; i <= lastRow-1; i++) {
                    matrix[i][lastColumn] = number;
                    number++;
                }
                lastRow--;
                firstColumn++;
                lastColumn--;
                firstRow++;

        }
        //code from task3,for displaying matrix
        for (int i = 0; i < dimRows; i++) { //start from 1 because we cant multiply number with 0
            for (int j = 0; j < dimColumns; j++) {
                rez = matrix[i][j];
                sb.append(rez);
                appandSpaces(rez,maxSpaces,sb);
                if (j == dimColumns-1) {
                    sb.append("\n");
                }
            }
        }
        System.out.print(sb);

    }
    static int getSpaces(int max){
        int i=0;
        while(i<=max*10){
            max/=10;
            i++;
        }
        return i;
    }

    static void appandSpaces(int tempNum,int maxSpaces,StringBuilder sb){
        int tmpSpaces;
        tmpSpaces = maxSpaces-getSpaces(tempNum);

        while(tmpSpaces>0){
            sb.append(" ");
            tmpSpaces--;
        }
    }
}





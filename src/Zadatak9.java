import java.util.Random;

public class Zadatak9 {
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[30m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final int maxElement=9,minElement=1;

    public static void main(String[] args) {
        //Write a program that prints Matrix code lookalike in console.

        StringBuilder sb= new StringBuilder();
        sb.append(ANSI_BLACK_BACKGROUND);
        sb.append(ANSI_GREEN);

        Random rnd = new Random();

        int maxMatrixSize=500,minMatrixSize=400,maxNumOfSpaces=5,minNumOfSpaces=2;


        int randomNumRows = rnd.nextInt(maxMatrixSize-minMatrixSize)+minMatrixSize;
        int randomNumColumns = rnd.nextInt(maxMatrixSize-minMatrixSize)+minMatrixSize;

        int[] rndIndexSpaces = new int[randomNumColumns];
        int[] rndBreaks = new int[randomNumColumns];
        int[] rndContinue = new int[randomNumColumns];

        //filling array:-that holds spaces after specific index
        //              -that hold break/continue(of printing) for specific columns
        for(int k=0;k<randomNumColumns;k++){
            rndIndexSpaces[k]=rnd.nextInt(maxNumOfSpaces-minNumOfSpaces)+minNumOfSpaces;
            rndBreaks[k]=rnd.nextInt(maxMatrixSize);
            rndContinue[k]=rnd.nextInt(maxMatrixSize);
        }


        for (int i=0; i<randomNumRows;i++){
                for (int j=0;j<randomNumColumns;j++){

                    if (i<rndBreaks[j] || i>rndContinue[j]) {
                        sb.append(rnd.nextInt(maxElement-minElement)+minElement);
                    }else{
                        sb.append(" ");
                    }
                    //new row when j = last column,and change value of brake and continue for next row.
                    if (j==randomNumColumns-1){
                        sb.append("\n");
                        rndBreaks[j]=rnd.nextInt(maxMatrixSize);
                        rndContinue[j]=rnd.nextInt(maxMatrixSize);
                        continue;
                    }
                    //filling with spaces
                    for (int l=0;l<rndIndexSpaces[j];l++){
                        sb.append(" ");
                    }

                }

        }
        System.out.println(sb);
    }

}



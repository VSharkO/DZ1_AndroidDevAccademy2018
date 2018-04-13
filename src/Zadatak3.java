public class Zadatak3 {
    //3. Write a program that prints a multiplication table for numbers up to 12.

//this is solution for "all" numbers.

    public static void main(String[] args) {
        int maxNum = 50, rez, max=maxNum*maxNum*10; //max is variable that contains max number in current table,
                                                    // so we can calculate number of spaces required.

        StringBuilder sb = new StringBuilder();

        int maxSpaces=getSpaces(max);

        for (int i = 1; i <= maxNum; i++) { //start from 1 because we cant multiply number with 0
            for (int j = 1; j <= maxNum; j++) {
                rez = i * j;
                sb.append(rez);
                appandSpaces(rez,maxSpaces,sb);

                if (j == maxNum) {
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



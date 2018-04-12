
import java.util.Scanner;

//10. Write a program that automatically converts English text to Morse code and vice versa.

public class Zadatak10 {
    static char[] engAlphabet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz".toCharArray();

    static String[] MorseCode = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-"
            , ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };


    public static void main(String[] args) {


        int mode;

        StringBuilder sb = new StringBuilder();
        StringBuilder rezSb = new StringBuilder();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter \"1\" if you want to convert eng text to morse code, and \"2\" " +
                "if you want to convert morse code to Eng text(separate each morse code word with space): ");

        mode = Integer.parseInt(sc.nextLine());

        if (mode == 1) {
            String string = sc.nextLine();
            sb.append(string);
            rezSb = alphabetToMorse(sb);
        } else if (mode == 2) {

            String string = sc.nextLine();
            sb.append(string);
            rezSb = moorseToAlphabet(sb);

        }
        System.out.print(rezSb);

    }



    public static StringBuilder alphabetToMorse(StringBuilder sb){
        StringBuilder rezSb= new StringBuilder();
        char separator=' ';
        for (int i = 0; i < sb.length(); i++) {
            for (int j = 0; j < engAlphabet.length; j++) {
                if (engAlphabet[j] == sb.charAt(i)) {
                    rezSb.append(MorseCode[j / 2]);
                    rezSb.append(separator);
                }

            }
        }
        return rezSb;
    }

    public static StringBuilder moorseToAlphabet(StringBuilder sb) {
        int index = 0;
        char separator=' ';
        StringBuilder tempSb= new StringBuilder();
        StringBuilder rezSb= new StringBuilder();

        while (index<sb.length()) {
            while (index<sb.length() && sb.charAt(index)!=separator) {
                tempSb.append(sb.charAt(index));
                index++;
            }
            index++;
            for(int i=0;i<MorseCode.length;i++){
                if(tempSb.toString().equals(MorseCode[i])){
                    rezSb.append(engAlphabet[i*2]);
                }
            }
            tempSb.delete(0,tempSb.length());
        } return rezSb;
    }


}










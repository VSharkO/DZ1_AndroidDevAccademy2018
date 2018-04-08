import java.util.Calendar;

public class Zadatak4 {
    public static void main(String[] args) {
        //4. Write a program that prints the next 20 leap years.

        int year,nextLeapYears,lastLeapYear;

        year = Calendar.getInstance().get(Calendar.YEAR);
        nextLeapYears=20;
        lastLeapYear=year;

        System.out.print("Next "+nextLeapYears+" leap years: ");

        while(lastLeapYear%4!=0){
            lastLeapYear++;
        }

        for (int i=lastLeapYear; i<=year+(nextLeapYears*4); i+=4){
            if(i==lastLeapYear) {
                System.out.print(i);
                continue;
            }

            System.out.print(", " + i);
        }

        System.out.print(".");
    }
}

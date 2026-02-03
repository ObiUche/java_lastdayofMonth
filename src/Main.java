import java.util.Scanner;
import java.time.LocalDate;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] dateFormat = input.split(" ");
        int year = Integer.parseInt(dateFormat[0]);
        int dayOfYear = Integer.parseInt(dateFormat[1]);
        LocalDate start = LocalDate.of(year,1,1);
        LocalDate dayAfterMonth = start.plusDays(dayOfYear);
        LocalDate date = LocalDate.ofYearDay(year,dayOfYear);
        if(date.getMonth() == dayAfterMonth.getMonth()){
            System.out.println("false");
        }else{
            System.out.println("true");
        }



        // put your code here
    }
}
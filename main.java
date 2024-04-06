import java.util.Scanner;

public class main{
       public static void main(String[]args){
        
        System.out.println("Podaj ocenę z matematyki:");
        Scanner scan = new Scanner(System.in);
        int matma = scan.nextInt();

        System.out.println("Podaj ocenę z fizyki:");
        Scanner scan2 = new Scanner(System.in);
        int fizyka = scan2.nextInt();

        System.out.println("Podaj ocenę z chemii:");
        Scanner scan3 = new Scanner(System.in);
        int chemia = scan3.nextInt();
        
        

        int srednia = (fizyka + chemia + matma) / 3;
        System.out.println("Średnia arytmetyczna podanych ocen jest następująca: " + srednia);
    }
}

import java.util.Scanner;

public class main{
       public static void main(String[]args){

        int[] tablica = new int[10];
        
        System.out.println("Podaj ocenę z matematyki:");
        Scanner scan1 = new Scanner(System.in);
        int matma = scan1.nextInt();

        matma = tablica[0];


        System.out.println("Podaj ocenę z fizyki:");
        Scanner scan2 = new Scanner(System.in);
        int fizyka = scan2.nextInt();

        fizyka = tablica[1];

        System.out.println("Podaj ocenę z chemii:");
        Scanner scan3 = new Scanner(System.in);
        int chemia = scan3.nextInt();
        
        chemia = tablica[2];

        int srednia = (fizyka + chemia + matma) / 3;
        System.out.println("Średnia arytmetyczna podanych ocen jest następująca: " + srednia);
        
    }
}

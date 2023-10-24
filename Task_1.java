import java.util.Scanner;

public class Task_1 {
    public static void main(String args[]){
        try (Scanner scan = new Scanner(System.in)) {
            double numb = scan.nextDouble();
            if (numb > 7) System.out.println("Привет");
        } catch (Exception e) {
            System.out.println("Попробуйте еще раз...");
        }  
    }   
}
import java.util.Scanner;

public class Task_2 {
    public static void main(String args[]){
        try (Scanner scan = new Scanner(System.in)) {
            String name = scan.next();
            if(name.equals("Вячеслав")) {System.out.println("Привет, Вячеслав");}
            else {System.out.println("Нет такого имени");}
        }catch(Exception e){System.out.println("Попробуйте еще раз...");}
        
    }
}
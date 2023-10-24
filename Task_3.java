import java.util.Scanner;

public class Task_3 {
    public static void main(String args []){
        try (Scanner scan = new Scanner(System.in)) {
            String myArray= scan.nextLine();
            String str_myArray[] = myArray.split(" ");
            int int_myArray[] = new int[str_myArray.length];
            for (int i = 0; i < str_myArray.length; i++) {
                int_myArray[i] = Integer.parseInt(str_myArray[i]);
                if(int_myArray[i]%3 == 0){
                    System.out.print(int_myArray[i] + " ");
                }
            } 
        }catch(Exception e){System.out.println("Попробуйте еще раз...");}
    }
}

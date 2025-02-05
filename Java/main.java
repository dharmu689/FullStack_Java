import java.util.Scanner;

public class main { 
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        String name;

        System.out.print("Enter name: ");
        name = obj.nextLine();
        System.out.println("Name: " +name);
        
        obj.close(); // Close Scanner to prevent resource leak
    }
}

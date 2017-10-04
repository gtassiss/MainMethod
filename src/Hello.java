import java.util.Scanner;
public class Hello {
    public static void main(String args[]){

        String name ="";
        System.out.println("Please enter name:");
        Scanner keyboard = new Scanner(System.in);
        name = keyboard.next();
        System.out.println(helooName(name));


    }




    public static String helooName(String name)
    {
        return "Hello, "+name+"!";
    }
}

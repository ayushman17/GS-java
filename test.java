import java.util.Scanner;

class test{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your First name");
        String Firstname = input.next();

        System.out.println("Enter your Last name");
        String Lastname = input.next();

        System.out.println("Your name is "+Firstname+" "+Lastname);
        input.close();
    }
}
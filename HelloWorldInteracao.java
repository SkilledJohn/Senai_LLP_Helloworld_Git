import java.util.Scanner;

public class HelloWorldInteracao{

    public static void main(String [] args){
        String nome = "";
        Scanner Scan = new Scanner(System.in);

        System.out.print("Informe Nome: ");
        nome = Scan.nextLine();

        System.out.println("Hello World "+ nome);
    }
}
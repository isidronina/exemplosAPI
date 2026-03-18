
import java.util.Scanner;

public class validacao {
    public static void main(Scanner[]args){
        Scanner e=new Scanner(System.in);
        double nota;
        do {
            System.out.println("*****Digite uma nota*****");
            nota=e.nextDouble();

        }while (nota <0 || nota> 10);
        System.out.println("nota correta");
        e.close();
    }

}
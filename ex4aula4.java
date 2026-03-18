
import java.util.Scanner;
public class ex4aula4 {
    public static void main(String[]args){
        Scanner e=new Scanner(System.in);
        System.out.println("Menu Planos de trabalho");
        System.out.println("1-> A-10%");
        System.out.println("2-> B-15%");
        System.out.println("3-> C-20%");

        System.out.print("digite seu salário:"); double salario=e.nextDouble();
        double planoT1=salario*0.10;
        double planoT2=salario*0.15;
        double planoT3=salario*0.20;

        System.out.println("Digite um numero de 1-3 que corresponde seu plano de trabalho: ");
        int nplano=e.nextInt();

        switch (nplano) {
            case 1:

                System.out.println(" Seu novo salário é: "+(salario+planoT1) );

                break;
            case 2:
                System.out.println(" Seu novo salário é: "+(salario+planoT2) );
                break;
            case 3:
                System.out.println(" Seu novo salário é: "+(salario+planoT3) );
                break;

            default:
                System.out.println("O numero digitado não esta na lista");

        }
        e.close();
    }

}
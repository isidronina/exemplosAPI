
import java.util.Scanner;
public class ex5aula4 {
    public static void main(String[]args){
        Scanner e=new Scanner(System.in);


        System.out.println("Digite \n M-para ver a media dos numeros digitados \n S-para ver a diferença dos dois numeros \n P-para ver o produto entre os dois numeros \n D-divisão do primeiro pelo segundo");


        String escolha=e.next();

        switch (escolha) {
            case M:
                System.out.println(" Bom dia  o seu periodo de aula é o Matutino ");
                break;
            case S:
                System.out.println("Boa tarde esse periodo de aula e o Vespertino ");
                break;
            case P:
                System.out.println("Boa noite  esse periodo de aula é o Noturno");
                break;

            default:
                System.out.println("O numero digitado não esta na lista");

        }
        e.close();
    }

}
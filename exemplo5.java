import java.util.Scanner;

public class exemplo5 {
    public static void main(String[]args){
        Scanner e=new Scanner(System.in);
        int resp;
        String nome;
        int idade;
        resp= 1;
        while (resp==1){
            System.out.print("digite seu nome: ");nome = e.next();

            System.out.print("digite sua idade: ");idade=e.nextInt();


            if (idade>=18){
                System.out.println("Seu nome é : "+nome);
            }
            System.out.println("Deseja continuar? (1/0): "); resp=e.nextInt();

        }
        e.close();
    }
}


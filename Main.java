import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner e= new Scanner(System.in);
        int contador;
        double nota,media,acumuladorNotas;
        contador=0;
        acumuladorNotas=0;
        while (contador < 5){
            contador++;
            System.out.println("Digite uma nota "+contador+ " ");
            nota = e.nextDouble();
            acumuladorNotas = acumuladorNotas+ nota;

        }
        media=acumuladorNotas/contador;
        System.out.println("media: " +media);
        e.close();
    }
}
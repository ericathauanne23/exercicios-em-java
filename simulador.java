import java.util.Scanner;
import java.util.Random;
public class simulador {
    public static void main(String[]args){
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite um valor");
        Random numero = new Random();
        int valor  = 100;
    }
    public void menu(){
        System.out.println("\t Escolha uma opçao");
        System.out.println("1 - saldo");
        System.out.println("2 - depositar");
        System.out.println("3 - saque");
        System.out.println("4 - Sair\n");
}
    public void saldo(){
        int valor = 100;
        System.out.println("Seu saldo é"+valor);
    }
    public void depositar(){
        int deposito;
        int valor = 100;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Quanto deseja depositar?"+ valor);
    }
    public void saque(){
        int saque = 100;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Quanto deseja sacar?"+ saque);
}
public void sair(){
        System.out.println("Deseja realmente sair?");
}}
        

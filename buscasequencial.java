import java.util.Scanner;
import java.util.Random;
  public class buscasequencial{
  public static void main(String[]args){
   Scanner tcl = new Scanner(System.in);
   Random aleatorio = new Random();
	int vetor [] = new int[4];
	int vetor [0] = 5;
	int vetor [1] = 25;
	int vetor [2] = 125; 
	int vetor [3] = 625;
    System.out.println("Digite o valor a ser procurado");
	int valor = tcl.nextInt();
	boolean encontrado = false;
	 for(int i = 0;i < vetor.length; i++){
	 int(valor == vetor[i]){
	System.out.println("Valor encontrado na posicao"+"/t i+");
	encontrado = true;
	break;
   }
  }
	if(encontrado == false){
 	 System.out.println("Valor nao encontrado"); 
  }	
 }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
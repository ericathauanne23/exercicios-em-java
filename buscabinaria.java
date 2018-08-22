import java.util.Scanner;
import java.util.Random;
  public class buscabinaria {
	public static void main(String[] args) {
         Scanner tcl = new Scanner(System.in);
         Random aleatorio = new Random();
	 int vetor[]= new int [100];
	 for(int i = 0; i < vetor.length; i++) {
	    vetor[i] = vetor.nextInt(100); 
  }
   System.out.println("Vetor nao ordenado");
	for(int i=0; i < vetor.length; i++){
  	  System.out.print(vetor[i]+"");
  }

	int aux = 0;
	for(int i = 0; i < vetor.length; i++){
  	 for(int j = 0;j < vetor.length; i++){
   	  if(vetor[i] < vetor[j]){
   	   aux = vetor[i];
	   vetor[i] = vetor[j];   
	   vetor[j] = aux;	   


   }
  }
 }
  System.out.println("Vetor Ordenado");
	for(int i = 0;i < vetor.length; i++){
	 System.out.print(vetor[i]+"");
  }
 } 
}
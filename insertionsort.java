import java.util.Scanner;
import java.util.Random;
public class insertionsort{
public static void mian(String[] args){
        Scanner tcl = new Scanner(System.in);
        Random aleatorio = new Random();
	int vetor[] = new int [5];
	for(int i = 0;i < vetor.length; i++){
        vetor[i] = aleatorio.nextInt(10);
 }
	for(int i = 0;i < vetor.length;i++){
            int aux = vetor[i];
            
           for(int j = i-1 ;j >=0 && vetor[j] > aux; j--){
            vetor[j + 1] =vetor[j];
            vetor[j]= aux; 
        }
  }
        for(int i = 0;i< vetor.length;i++){
            System.out.print(vetor[i]);
        }
 }
}
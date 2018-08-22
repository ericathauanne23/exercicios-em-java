import java.util.Scanner;
public class BubbleSort{
 public static void main(String[] args){
     int num[] = {5,8,2,4,9,10};
     
     int temp;
     boolean fixed = false;
     while(boolean == false){
	fixed = true; 
   
     for(int i=0; i < num.length-1; i++){

        if(num[i] > num[i + 1]){

        temp = num[i + 1];

        num[i + 1] = num[i];

        num[i] = temp;

	fixed = false;
	
    }
   }
  }
  for(int i=0; i<num.length; i++){
	System.out.println(num[i]);
  }
 }
}
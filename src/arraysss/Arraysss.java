
package arraysss;

import java.util.Scanner;


public class Arraysss {

   
    public static void main(String[] args) {
      
        int numeros[] = new int[5];
        Scanner leer = new Scanner(System.in);
        int index = 0;
        for(int num:numeros){
            numeros[index] = leer.nexInt();
            index++;
        }
        
    }
    
}

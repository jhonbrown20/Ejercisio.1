
package Ejercisio1;

import java.util.Scanner;

public class Ejercisio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        System.out.println(" introduce el primer numero");
        n1=entrada.nextInt();
          System.out.println(" introduce el segundonumero");
        n2=entrada.nextInt();
          System.out.println(" introduce el tercer numero");
        n3=entrada.nextInt();
        
        if(n1>n2 && n2>n3){
            System.out.println("el mayor numero es "+n1);
        }
        else if(n1>n3 && n3>n2){
            System.out.println(" el mayor numero es "+n1);   
        }
        else if (n2>n1 && n1>n3){
            System.out.println(" el mayor numero es "+n2);
        }
        else if(n2>n3 && n3>n2){
            System.out.println(" el mayoe numero es "+n2);
        }
        else if(n3>n1 && n1>n2){
            System.out.println(" el mayor numero es "+n3);
        }
        else if(n3>n2 && n2>n1){
            System.out.println(" el mayor numero es "+n3);
        }
        
                
    }
    
}

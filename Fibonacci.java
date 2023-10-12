
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;
 
import java.util.Scanner;


/**
 *
 * @author yeomn
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int y = 0, a = 1, e, l; 
        System.out.println("Hola, ingrese un numero");
        l = teclado.nextInt();
         for (int i = 0; i < l; i++) {
             System.out.println(y);
             e = y + a;
             y = a;
             a = e;
             
                  
         }
    
        System.out.println("De nada, vuelva pronto");

    }
    
}
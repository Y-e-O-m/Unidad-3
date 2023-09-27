/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numero.par.o.impar;
import java.util.Scanner;
/**
 *
 * @author yeomn
 */
public class NumeroParOImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingresa un numero");
        int numero = leer.nextInt();
        if (numero % 2 == 0){
          System.out.println(numero + "es un numero par");
        }else{
              System.out.println(numero + "es un numero impar");
            }        
        }   
    }
    

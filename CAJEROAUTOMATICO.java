/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajeroautomatico;

import java.util.Scanner;

/**
 *
 * @author yeomn
 */
public class CAJEROAUTOMATICO {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo =1000, retirar,deposito = 0;
        Scanner s = new Scanner(System.in);
        while (true)
        {
        System.out.println("Bienvenido al cajero automatico\n");
        System.out.println("Por favor seleccione una opcion");
        System.out.println("1. Consulta saldo");
        System.out.println("2. Depositar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Salir");
        System.out.println("------------\n");        
        int n = s.nextInt();
        

    switch (n) {
        case 1:
            System.out.println("Saldo" + saldo);
            break;
            
        case 2:
              System.out.println("Digite la cantidad de dinero que desea depositar");
              deposito += s.nextInt();
              saldo = saldo + deposito;
              System.out.println("\nSu saldo actual es  " + saldo);
              break;


        case 3:
            System.out.println("\nDigite la cantidad que desea retirar");
            retirar = s.nextInt();
            if(saldo >= retirar) {
            saldo = saldo - retirar;
            
            System.out.println("Retiro exitoso, su saldo actual es  " + saldo); 
            }else {
                System.out.println("Fondos insuficienntes");
                
            }
        case 4:
            System.out.println("Gracias por utilizar el cajero automatico. Que tenga buen dia");
        
            break;
        default:
            System.out.println("Opcion no valida. Por favor seleccione una opcion valida");

    
    }
    }
    }
}
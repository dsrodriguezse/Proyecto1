/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author dsrodriguezse
 */
    import java.util.Scanner;

public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner var = new Scanner (System.in);
        
        int numero1,numero2,resultado;
        System.out.println("Para saber la multiplicacion de dos numeros");
        System.out.println("Ingrese el primer numero");
        numero1 = var.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2 = var.nextInt();
        resultado = numero1 * numero2;
        System.out.println("El resultado es: "+ resultado);
        resultado=resultado/2;
        System.out.println("La mitad de ese resultado es: "+ resultado);
        
        
    }
    
}

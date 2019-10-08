package boletin2_4;

import java.util.Scanner;

/**
 *
 * @author cfigueirasvalverde
 */
public class Boletin2_4 {

   
    public static void main(String[] args) {
       
         Scanner leer = new Scanner (System.in);
    int cantidadEntera;
    int billetes100 , billetes20,billetes5 ,monedas1 ;
    System.out.println("Introduzca la cantidad entera: ");
    cantidadEntera=leer.nextInt();
    
    billetes100= cantidadEntera/100;
    billetes20= cantidadEntera%100/20;
    billetes5= cantidadEntera%100/5;
    monedas1= cantidadEntera%100/1;
    System.out.println("Son "+billetes100+" billete(s) de 100: "+billetes20+" billete(s) de 20: "+billetes5+" billete(s) de 5: "+monedas1+ " :moneda(s) de 1");
    
    
    }
    
}
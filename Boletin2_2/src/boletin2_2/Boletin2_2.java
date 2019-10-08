package boletin2_2;

import java.util.Scanner;

/**
 *
 * @author cfigueirasvalverde
 */
public class Boletin2_2 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
       float temperaturaC = 0;
       System.out.println("Intrdouzca temperatura celsius: ");
       temperaturaC = leer.nextFloat();
       //formula kelvin
       float conversionKelvin = (float) (temperaturaC + 273.15f);
       System.out.println(+temperaturaC+" grados son "+conversionKelvin+" grados kelvin");
       //formula fahrenheit
       float conversionFahrenheit = (float) ((temperaturaC * 1.8) + 32);
       System.out.println(temperaturaC+" grados son "+conversionFahrenheit+" grados fahrenheit");
    }
    
}

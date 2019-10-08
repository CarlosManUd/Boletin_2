package boletin2_1;

import java.util.Scanner;

/**
 *
 * @author cfigueirasvalverde
 */
public class Boletin2_1 {

    
    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
        float prezotarifa=0, prezopagado=0, porcentaxepagado;
        System.out.println("teclea prezotarifa:");
        prezotarifa=ler.nextFloat();
        System.out.println("teclea prezopagado:");
        prezopagado=ler.nextFloat();
        porcentaxepagado=(prezopagado*100)/prezotarifa;
        System.out.println("o percentaxe e do:"+porcentaxepagado+"%");
    }
    
}

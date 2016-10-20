/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema19;
import java.util.*;
/**
 *
 * @author Enano
 */
public class PP2Problema19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Resolución
        printSinCosTan(getAngle());
    }
    public static float getAngle() //Se recibe el ángulo
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Ingrese el angúlo del cual desea calcular su seno, coseno y tangente: ");
        return in.nextFloat();
    }
    public static void printSinCosTan(float angle)  //Se procesa e imprime
    {
        System.out.println("El coseno del ángulo "+angle+" es: "+Math.cos(angle));  //Se utiliza Math.cos para sacar el coseno.
        System.out.println("El seno del ángulo "+angle+" es: "+Math.sin(angle)); //Se utiliza Math.sin para sacar el seno.
        System.out.println("La taangente del ángulo "+angle+" es: "+Math.tan(angle)); //Se utiliza Math.tan para sacar la tangente
    }
}

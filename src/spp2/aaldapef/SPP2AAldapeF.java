/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.aaldapef;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class SPP2AAldapeF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long [] numeros = new long [10];
        int telefono;
        Scanner kb= new Scanner(System.in);
        
        for(int m=0; m<numeros.length;m++){
            System.out.println("Introduce el numero telefonico " + m);
            numeros[m]= kb.nextLong(); }
            System.out.println("Introduce el numero que quieres mostrar");
            telefono= kb.nextInt();
        if(telefono>9){
            System.out.println("Este número telefonico no esta disponible, gracias :)");
        }
        else{
            System.out.println("El telefono es "+ numeros[telefono]);
        }
    
    
    }
}

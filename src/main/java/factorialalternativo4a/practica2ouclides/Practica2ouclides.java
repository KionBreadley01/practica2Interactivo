/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package factorialalternativo4a.practica2ouclides;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ROBERTO
 */
public class Practica2ouclides {

    public static void main(String[] args) throws IOException {
        int a =0 , b = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
        
        System.out.println("ingrese el primer numero: ");
        a = Integer.parseInt(reader.readLine());
        System.out.println("ingrese el segundo numero:");
                    b = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
        }
            
        System.out.println("El MCD es: " + MCD(a, b));
    }

    public static int MCD(int a, int b) {
        int aux;
        while (b != 0) {
            aux = b;
            b = a % aux;
            a = aux;
        }
        return a;
    }
}



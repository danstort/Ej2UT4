/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejut4;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class EjUT4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int nota = 0;
        nota = teclado.nextInt();
        if (nota >= 5) {

            System.out.println("APROBADO");
        } else {
            System.out.println("SUSPENSO");
        }

        System.out.println("========");
        
        nota = teclado.nextInt();
        if (nota >= 5) {

            System.out.println("APROBADO");
        } else {
            System.out.println("SUSPENSO");
        }

        System.out.println("========");
    }

}

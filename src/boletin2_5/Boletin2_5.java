/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_5;

import java.util.Scanner;

/**
 *
 * @author Brei
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float millas;
        int millasMarinas=1852;
        System.out.println("indroduce una distancia en millas");
        Scanner millasIntroducidas = new Scanner(System.in);
        millas = millasIntroducidas.nextInt();
        System.out.println("Los metros totales son "+millas*millasMarinas);
    }
    
}

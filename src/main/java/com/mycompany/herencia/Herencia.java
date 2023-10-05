/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herencia;

/**
 *
 * @author HP
 */
public class Herencia {

    public static void main(String[] args) {
        Consultor consultorUno = new Consultor(10 , "Gerente" , 160.0 , 10 , "123456", "franco", "galbiati", "peron 5686", "123456");
        
        consultorUno.getNum_legajo();
        System.out.println(consultorUno.getApellido());
        
    }
}

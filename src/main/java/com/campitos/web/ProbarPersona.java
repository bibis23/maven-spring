/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.campitos.web;

/**
 *
 * @author T107
 */
public class ProbarPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p=new CuentaChistes();
        System.out.println(p.ejecutarGracia());
    }
    
}

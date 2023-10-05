/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author HP
 */
public class Empleado extends Persona{
    private int numero_legajo;
    private String nombreEmpresa;
    
    public Empleado(){
    }

    public Empleado(int numero_legajo, String nombreEmpresa, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.numero_legajo = numero_legajo;
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getNumero_legajo() {
        return numero_legajo;
    }

    public void setNumero_legajo(int numero_legajo) {
        this.numero_legajo = numero_legajo;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    
    
    
}

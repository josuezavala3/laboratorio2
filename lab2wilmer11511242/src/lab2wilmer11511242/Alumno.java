/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2wilmer11511242;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Alumno {
    private String Apodo;
    private int numerodecuenta;
    private int edad;
    private  ArrayList mochila;

    public Alumno() {
    }

    public Alumno(String Apodo, int numerodecuenta, int edad, ArrayList mochila) {
        this.Apodo = Apodo;
        this.numerodecuenta = numerodecuenta;
        this.edad = edad;
        this.mochila = mochila;
    }

    public String getApodo() {
        return Apodo;
    }

    public void setApodo(String Apodo) {
        this.Apodo = Apodo;
    }

    public int getNumerodecuenta() {
        return numerodecuenta;
    }

    public void setNumerodecuenta(int numerodecuenta) {
        this.numerodecuenta = numerodecuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList getMochila() {
        return mochila;
    }

    public void setMochila(ArrayList mochila) {
        this.mochila = mochila;
    }
    
}

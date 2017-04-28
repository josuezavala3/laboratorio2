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
    private int resistencia;
    private String gradoacdemico;
    private String tipoarma;
    private  String mochila;

    public Alumno() {
    }

    public Alumno(String Apodo, int numerodecuenta, int edad, int resistencia, String gradoacdemico, String tipoarma, String mochila) {
        this.Apodo = Apodo;
        this.numerodecuenta = numerodecuenta;
        this.edad = edad;
        this.resistencia = resistencia;
        this.gradoacdemico = gradoacdemico;
        this.tipoarma = tipoarma;
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

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public String getGradoacdemico() {
        return gradoacdemico;
    }

    public void setGradoacdemico(String gradoacdemico) {
        this.gradoacdemico = gradoacdemico;
    }

    public String getTipoarma() {
        return tipoarma;
    }

    public void setTipoarma(String tipoarma) {
        this.tipoarma = tipoarma;
    }

    public String getMochila() {
        return mochila;
    }

    public void setMochila(String mochila) {
        this.mochila = mochila;
    }

    @Override
    public String toString() {
        return "Alumno{" + "Apodo=" + Apodo + ", numerodecuenta=" + numerodecuenta + ", edad=" + edad + ", resistencia=" + resistencia + ", gradoacdemico=" + gradoacdemico + ", tipoarma=" + tipoarma + ", mochila=" + mochila + '}';
    }

}
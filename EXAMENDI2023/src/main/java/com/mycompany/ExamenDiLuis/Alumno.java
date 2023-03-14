/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ExamenDiLuis;

/**
 *
 * @author LuisGutiérrezChamizo
 */
public class Alumno {
    private String nombre;
    private String apellidos;
    private double AD;
    private double SGE;
    private double DI;
    private double PMDM;
    private double PSP;
    private double EIE;
    private double HLC;

    public Alumno(String nombre, String apellidos, double AD, double SGE, double DI, double PMDM, double PSP, double EIE, double HLC) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.AD = AD;
        this.SGE = SGE;
        this.DI = DI;
        this.PMDM = PMDM;
        this.PSP = PSP;
        this.EIE = EIE;
        this.HLC = HLC;
    }

    // Métodos getter y setter para los campos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getAD() {
        return AD;
    }

    public void setAD(double AD) {
        this.AD = AD;
    }

    public double getSGE() {
        return SGE;
    }

    public void setSGE(double SGE) {
        this.SGE = SGE;
    }

    public double getDI() {
        return DI;
    }

    public void setDI(double DI) {
        this.DI = DI;
    }

    public double getPMDM() {
        return PMDM;
    }

    public void setPMDM(double PMDM) {
        this.PMDM = PMDM;
    }

    public double getPSP() {
        return PSP;
    }

    public void setPSP(double PSP) {
        this.PSP = PSP;
    }

    public double getEIE() {
        return EIE;
    }

    public void setEIE(double EIE) {
        this.EIE = EIE;
    }

    public double getHLC() {
        return HLC;
    }

    public void setHLC(double HLC) {
        this.HLC = HLC;
    }
}
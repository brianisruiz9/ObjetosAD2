/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 *
 * @author bruiz9
 */
public class Fraccionario {
    private int numerador;
    private int denominador;
    
    public Fraccionario (int numerador,int denominador){
        this.numerador=numerador;
        this.denominador=denominador;
        
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    public Fraccionario Sumar(Fraccionario f2){
        int num,den;
        Fraccionario f;
        
        num=this.numerador * f2.denominador + this.denominador * f2.numerador;
        den=this.denominador * f2.denominador;
        f = new Fraccionario(num,den);
        return f;
    }
    
}

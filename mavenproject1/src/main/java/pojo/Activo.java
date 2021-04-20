/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author JADPA02
 */
public class Activo {
    private float valor;
    private float valorResidual;
    private CLASIFICACION clasificacion;
    
    public enum CLASIFICACION{
        VEHICULO,MAQUINARIA,MOBILIARIO,COMPUTO;
    }

    public Activo(float valor, float valorResidual, CLASIFICACION clasificacion) {
        this.valor = valor;
        this.valorResidual = valorResidual;
        this.clasificacion = clasificacion;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getValorResidual() {
        return valorResidual;
    }

    public void setValorResidual(float valorResidual) {
        this.valorResidual = valorResidual;
    }

    public CLASIFICACION getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(CLASIFICACION clasificacion) {
        this.clasificacion = clasificacion;
    }
    
    
}

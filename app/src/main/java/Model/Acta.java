package Model;

import java.io.Serializable;

/**
 * Created by Jorge on 15/06/2017.
 */

public class Acta implements Serializable{

    private String memoria;
    private String puntos;
    private String conclusion;
    private String siguiente;
    private String compromisos;
    private String propuestas;
    private String evaluacion;


    public Acta(String memoria, String puntos, String conclusion,
                String siguiente, String compromisos, String propuestas, String evaluacion){

        this.memoria = memoria;
        this.puntos = puntos;
        this.conclusion = conclusion;
        this.siguiente = siguiente;
        this.compromisos = compromisos;
        this.propuestas = propuestas;
        this.evaluacion = evaluacion;

    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getPuntos() {
        return puntos;
    }

    public void setPuntos(String puntos) {
        this.puntos = puntos;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(String siguiente) {
        this.siguiente = siguiente;
    }

    public String getCompromisos() {
        return compromisos;
    }

    public void setCompromisos(String compromisos) {
        this.compromisos = compromisos;
    }

    public String getPropuestas() {
        return propuestas;
    }

    public void setPropuestas(String propuestas) {
        this.propuestas = propuestas;
    }

    public String getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(String evaluacion) {
        this.evaluacion = evaluacion;
    }



    public String toString() {
        return  memoria+"-"+ puntos +"-"+ conclusion+"-"+
                siguiente+"-"+ compromisos+"-"+
                propuestas+"-"+evaluacion+"-";
    }
}

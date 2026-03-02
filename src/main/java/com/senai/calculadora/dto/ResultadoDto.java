package com.senai.calculadora.dto;

public class ResultadoDto {

    private Double numero;
    private Double getNumero;
    private Double resultado;

    //Constructor
    public ResultadoDto() {
    }

    //Get and Set
    public Double getNumero() {
        return numero;
    }

    public void setNumero(Double numero) {
        this.numero = numero;
    }

    public Double getGetNumero() {
        return getNumero;
    }

    public void setGetNumero(Double getNumero) {
        this.getNumero = getNumero;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }
}

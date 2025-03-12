package com;

public class VerificarAprovacao {

    int nota;
    String resultado;

    public VerificarAprovacao(int nota){
        this.nota = nota;
    }

    public String verificarNota(int nota){
        if (nota >= 6){
            resultado = "Aprovado.";
        }
        else{
            resultado = "Reprovado.";
        }
        return resultado;
    }
}

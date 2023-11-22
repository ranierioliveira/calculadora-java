package br.com.infnet;



public class OperacoesBasicas {


    public double adicao(double primeiroTermo, double segundoTermo){

        return primeiroTermo + segundoTermo;
    }
    public double subtracao(double primeiroTermo, double segundoTermo){
        return primeiroTermo - segundoTermo;
    }

    public double multiplicacao(double primeiroFator, double segundoFator){
        return primeiroFator * segundoFator;
    }

    public double divisao(double dividendo, double divisor){
        if(divisor == 0){
            throw new ValorInvalidoException("O divisor não pode ser 0!");
        }
        return dividendo / divisor;

    }
}

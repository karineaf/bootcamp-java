package br.com.globallabs.java.bootcamp.desenvolvimento.avancado.paradgma.funcional;

public class Recusividade {
    public static void main(String[] args) {

        System.out.println(fatorial(5));

    }

    public static int fatorial(int valor){
        if(valor==1)
            return valor;
        else
            return valor * fatorial(valor-1);
    }
}

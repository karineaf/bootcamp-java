package br.com.globallabs.java.bootcamp.desenvolvimento.avancado.interfaces.funcionais;

//é uma funcao que recebe ou retorna outra funcao
public class FuncaoAltaOrdem {

    public static void main(String[] args) {
        Calculo soma = Integer::sum;
        Calculo subtracao = (a,b) -> a-b;
        Calculo multiplicacao = (a,b) -> a*b;
        Calculo divisao = (a,b) -> a/b;
        System.out.println(executarOperacao(soma,1,3));
        System.out.println(executarOperacao(subtracao,6,3));
        System.out.println(executarOperacao(multiplicacao,1,3));
        System.out.println(executarOperacao(divisao,6,3));
    }

    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calcular(a, b);
    }

}

@FunctionalInterface
interface Calculo{
    int calcular(int a, int b);

}





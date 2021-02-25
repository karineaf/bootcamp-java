package br.com.globallabs.java.bootcamp.desenvolvimento.avancado.paradgma.funcional;


public class Lambda {
    public static void main(String[] args) {
        //para criar uma lambda, é necessario entender o que é interface funcional
        Funcao funcaoGerarSaida = valor -> valor;

        //exemplo antes do java 8
        Funcao colocarPrefixoSenhor = new Funcao() {
            @Override
            public String gerar(String valor) {
                return "Sr. " + valor;
            }
        };
        System.out.println(colocarPrefixoSenhor.gerar("João"));

        //exemplo com java 8
//      Interface Funcional nomeVariavel      = parametro -> lógica
        Funcao              colocarPrefixoSr = valor     -> "Sr. " + valor;
        System.out.println(colocarPrefixoSr.gerar("Jonas"));

    }
}


//interface funcional: possui apenas 1 método abstrato
@FunctionalInterface //protege na declaração da interface, falando que não é possivel ter +1 método abstrato
interface Funcao{
    String gerar(String valor);


// é utilizado quando precisar ter mais de um metodo, para não dar erro, ele não pode ficar abstrato
    default Integer gerarNumero(String valor) {
        return null;
    }
}


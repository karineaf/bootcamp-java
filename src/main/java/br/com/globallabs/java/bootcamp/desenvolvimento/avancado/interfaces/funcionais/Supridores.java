package br.com.globallabs.java.bootcamp.desenvolvimento.avancado.interfaces.funcionais;

import java.util.function.Supplier;

//para lidar com streams no java - comportamento que retorna a instancia do objeto
//
public class Supridores {
    public static void main(String[] args) {
        Supplier<Pessoa> suppliers = () -> new Pessoa();
        Supplier<Pessoa> suppliers2 = Pessoa::new;

        System.out.println(suppliers.get());
        System.out.println(suppliers2.get());
    }
}

class Pessoa{
    private final String nome;
    private final Integer idade;

    public Pessoa(){
        nome = "Karine";
        idade = 22;

    }

    @Override
    public String toString() {
        return String.format("nome: %s, idade: %d", nome, idade);
    }
}



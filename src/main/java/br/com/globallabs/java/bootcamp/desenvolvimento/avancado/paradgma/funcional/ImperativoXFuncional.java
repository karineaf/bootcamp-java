package br.com.globallabs.java.bootcamp.desenvolvimento.avancado.paradgma.funcional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;

import java.util.function.Function;

public class ImperativoXFuncional {
    public static void main(String[] args) {
        // imperativo
        System.out.println(buscarUsuario(15));

        // funcional
        Function<Integer, Object> buscarUser = idUsuario ->
          //busca o usuario
          new Object();
        System.out.println();

    }


    public static Object buscarUsuario(int idUsuario){
        //retorna o usuario
        return new Object();
    }
}

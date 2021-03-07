package br.com.globallabs.java.bootcamp.desenvolvimento.avancado.processamento.assincrono;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class Future {

    // é como o run, só que nesse é possível adicionar a uma fila de execuções
    private static final ExecutorService pessoasParaExecutarAtividade = Executors.newFixedThreadPool(3);

    public static void main(String[] args) throws InterruptedException {
        Casa casa = new Casa(new Quarto());

        // future é mais novo que callable e runnable / utilizando o submit é possível usar o future(recomendado pelo java para quando houver concorrencia)
        // Utilizado CopyOnWriteArrayList ao inves de Collectors.toList(), pois esse é ThreadSafe - seguro para usar com Thread
        List<? extends java.util.concurrent.Future<String>> futuros  = casa.ObterAfazeresDaCasa().stream()
                .map(atividade -> pessoasParaExecutarAtividade.submit(() -> {
                        try{
                            return atividade.realizar();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                        return null;
                        })
                )
               .collect(Collectors.toCollection(CopyOnWriteArrayList::new));


        while (true){
            int numeroAtividadesNaoFinalizadas=0;
            for (java.util.concurrent.Future<?> futuro : futuros) {
                if (futuro.isDone()){
                    try {
                        System.out.println("A atividade " + futuro.get() + " foi terminada");
                        futuros.remove(futuro);
                    } catch (InterruptedException | ExecutionException e) {
                        e.printStackTrace();
                    }
                } else
                    numeroAtividadesNaoFinalizadas++;
            }

            if (futuros.stream().allMatch(java.util.concurrent.Future::isDone)){
                break;
            }

            System.out.println("Numero de atividades não finalizadas: " + numeroAtividadesNaoFinalizadas);
            java.lang.Thread.sleep(700);
        }
        pessoasParaExecutarAtividade.shutdown();
    }
}

class Casa{
    private List<Comodo> comodos;

    Casa(Comodo... comodos){
        this.comodos = Arrays.asList(comodos);
    }

    List<Atividade> ObterAfazeresDaCasa(){
        return  this.comodos.stream().map(Comodo::ObterAfazeresDoComodo)
                .reduce(new ArrayList<>(), (pivo, atividades) -> {pivo.addAll(atividades); return pivo;});
    }

}

abstract class Comodo{
    abstract List<Atividade> ObterAfazeresDoComodo();
}

interface Atividade{
    String realizar() throws InterruptedException;
}

class Quarto extends Comodo{

    @Override
    List<Atividade> ObterAfazeresDoComodo() {
        return Arrays.asList(
                this::arrumarCama,
                this::varrerQuarto,
                this::arrumarGuardaRoupa
        );
    }

    private String arrumarGuardaRoupa() throws InterruptedException {
        java.lang.Thread.sleep(5000);
        String arrumarGuardaRoupa = "arrumar o guarda roupa";
        System.out.println("arrumar o guarda roupa");
        return arrumarGuardaRoupa;
    }
    private String varrerQuarto() throws InterruptedException {
        java.lang.Thread.sleep(7000);
        String varrerQuarto= "varrer o quarto";
        System.out.println("varrer o quarto");
        return varrerQuarto;
    }
    private String arrumarCama() throws InterruptedException {
        java.lang.Thread.sleep(10000);
        String arrumarCama = "arrumar a cama";
        System.out.println("arrumar a cama");
        return arrumarCama;
    }
}
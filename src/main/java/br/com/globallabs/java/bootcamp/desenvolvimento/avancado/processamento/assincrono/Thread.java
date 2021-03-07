package br.com.globallabs.java.bootcamp.desenvolvimento.avancado.processamento.assincrono;

/* Threads - dividir o processamento para executar várias tarefas paralelas
 * Processamento síncrono - processamentos que ocorrem em sequência
 * Processamento assíncrono - procesamentos realizado simultaneamente */

public class Thread {
    public static void main(String[] args) {
        GerarPDF gerarPDF = new GerarPDF();
        BarraDeCarregamento barraDeCarregamento = new BarraDeCarregamento(gerarPDF);

        gerarPDF.start();
        barraDeCarregamento.start();

    }
}

class GerarPDF extends java.lang.Thread{
    @Override
    public void run() {
        try{
            java.lang.Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("PDF gerado");
    }
}

class BarraDeCarregamento extends java.lang.Thread {

    private java.lang.Thread iniciaGeradorPDF;

    public BarraDeCarregamento(GerarPDF gerarPDF){
        this.iniciaGeradorPDF = gerarPDF;
    }

    @Override
    public void run() {
        while (true){
            try{
                java.lang.Thread.sleep(500);

                if (!iniciaGeradorPDF.isAlive())
                    break;

                System.out.println("Loading... ");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

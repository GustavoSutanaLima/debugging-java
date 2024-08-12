package br.com.dio.debbuging;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio do programa no método main.");
        a();
        System.out.println("Fim do programa no método main.");
    }

    static void a() { //detalhe.: Nessa linha, na declaração do método não foi utilizada a palavra chave
                      //public, quando isso acontece o Java entente que o public é o padrão;
        System.out.println("Entrou no método a.");
        b();
        System.out.println("Finalizou o método a.");
    }

    static void b() {
        System.out.println("Entrou no método b.");
        for(int i = 0; i <= 4; i++) System.out.println(i); //for executado em uma única linha
        c();
        System.out.println("Finalizou o método b.");
    }

    static void c(){
        System.out.println("Entrou no método c.");
        Thread.dumpStack(); //Imprime na tela o Stack Trace.: as threads que o código percorre durante a sua
                            //executação: IMPORTANTÍSSIMO: A LEITURA DA STACK TRACE É FEITA **DE BAIXO PARA CIMA**
                            //E SUA UTILIZAÇÃO É DE SUMA IMPORTANCIA NO DEBBUGING DO CÓDIGO;
                            //TAMBÉM É UTILIZADA NO TRATAMENTO DE EXCEÇÕES;
        System.out.println("Finalizou o método c.");
    }

}

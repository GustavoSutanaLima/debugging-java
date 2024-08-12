package br.com.dio.debbuging;

import java.util.Scanner;
        /*
         * DICA.: Durante a DEPURAÇÃO (OU DEBUGGING) a opção Step into (setinha pra baixo) entra no método no qual 
         * o programa está parado;
         */
public class CalculadoraDeMedias {
    public static void main(String[] args) {
        //inicia o objeto Scanner (captura de informações pelo terminal)
        Scanner scan = new Scanner(System.in); 
        
        //cria uma array de Strings.
        //No nomento da criação desse array usa-se colchetes depois do tipo;
        //Os elementos do array são separados por vírgula "," e ficam entre chaves;
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        //Outra maneira de declarar este mesmo array é assim.:
        //String alunos[] = {"Camila", "Lucas", "Bruna", "Pedro"};
 
        double media = calculaMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma: %.1f", media);
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {

        double soma = 0;
        for(String aluno : alunos) { //laço for-each muito usado com arrays (para-cada elementos do array )
                                     //nesse caso, a variável aluno assume acada um dos valores do arra;
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }

        return soma / alunos.length;
    }

}

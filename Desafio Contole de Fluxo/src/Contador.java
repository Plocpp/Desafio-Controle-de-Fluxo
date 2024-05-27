import java.util.Scanner;

// Classe que implementa a lógica de contagem
public class Contador {

    // Método principal
    public static void main(String[] args) {
        // Criando um objeto Scanner para receber entrada do usuário
        Scanner terminal = new Scanner(System.in);

        // Solicitando e lendo o primeiro parâmetro
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        // Solicitando e lendo o segundo parâmetro
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
        
        /*int parametroUm = 5; 
        int parametroDois = 2;
        com Valor no parametroUm maior que no paramentroDois, ocorreu a excessão com sucesso, todos os valores
        colocados com o maiores colocados no parametroUm validaram a excessão  */

        // Utilizando um bloco try-catch para capturar exceções
        try {
            // Chamando o método contar com os parâmetros fornecidos
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Caso seja lançada a exceção, imprime a mensagem de erro
            System.out.println(e.getMessage());
        } finally {
            // Fechando o Scanner após o uso para evitar vazamentos de recursos
            terminal.close();
        }
    }

    // Método para realizar a contagem
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validando se o segundo parâmetro é maior que o primeiro
        if (parametroUm >= parametroDois) {
            // Se não for, lança uma exceção informando o erro
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Calculando a quantidade de números a serem impressos
        int contagem = parametroDois - parametroUm;

        // Realizando a contagem e imprimindo os números
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

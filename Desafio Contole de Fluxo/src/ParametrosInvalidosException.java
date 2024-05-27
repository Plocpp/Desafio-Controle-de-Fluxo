// Classe que define uma exceção personalizada para parâmetros inválidos
public class ParametrosInvalidosException extends Exception {

    // Construtor que recebe uma mensagem de erro
    public ParametrosInvalidosException(String message) {
        // Chamando o construtor da classe Exception com a mensagem recebida
        super(message);
    }
}

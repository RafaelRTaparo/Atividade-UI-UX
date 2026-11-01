package calculadora;

/**
 * <p><strong>Projeto Calculadora</strong></p>
 *
 * <p>Esta classe fornece operações matemáticas básicas como soma, subtração,
 * multiplicação e divisão. </p>
 * <p>Esse projeto é utilizado para demonstrar:</p>
 * <ul>
 *     <li>Técnicas de revisão estática (caixa branca)</li>
 *     <li>Técnicas de revisão (caixa branca)</li>
 *     <li>Aplicação de refatoração em código Java</li>
 *     <li>Documentação com JavaDoc</li>
 * </ul>
 *
 * <p>Após a refatoração, os métodos desta classe são <strong>métodos puros</strong>,
 * sem efeitos colaterais, permitindo maior legibilidade e facilitando testes unitários.</p>
 *
 * @author Rafael Reis Táparo
 * @version 1.0
 */
public class Calculadora {
	
    private int r = 0;
    

    public int calcular(int a, int b, String op) {

    	/**
    	 * Verifica se o operador informado é válido e executa
    	 * a operação matemática escolhida.
    	 * @throws IllegalArgumentException se o operador for nulo ou inválido exibe a mensagem "Operação inválida"
    	 */
        if (op == null) {
            throw new IllegalArgumentException("Operação inválida");
        }
        
   	     /**
         * Soma dois números inteiros.
         *
         * @param a primeiro operando
         * @param b segundo operando
         * @r o resultado da soma de {@code a} e {@code b}
         */
        if (op.equals("+")) {
            r = a + b;
        } 
        
        /**
         * Subitrai dois números inteiros.
         *
         * @param a primeiro operando
         * @param b segundo operando
         * @r o resultado da subtração de {@code a} e {@code b}
         */
        else if (op.equals("-")) {
            r = a - b;
        } 
        
        /**
         * Multiplica dois números inteiros.
         *
         * @param a primeiro operando
         * @param b segundo operando
         * @r o resultado da multiplicação de {@code a} e {@code b}
         */
        else if (op.equals("*")) {
            r = a * b;
        } 
        
        /**
         * Divide dois números inteiros.
         *
         * @param a primeiro operando
         * @param b segundo operando
         * @r o resultado da divisão de {@code a} e {@code b}
         * @IllegalArgumentException indica que a divisão por 0 é inválida
         */
        else if (op.equals("/")) {

            if (b == 0) {
                throw new IllegalArgumentException(
                    "Erro: divisão por zero"
                );
            }

            r = a / b;

        } else {
            throw new IllegalArgumentException("Operação inválida");
        }

        return r;
    }
}

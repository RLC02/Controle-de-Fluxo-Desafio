import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        for (int contador = parametroUm; contador <= parametroDois; contador++) {
            System.out.println("Imprimindo número: " + contador);
        }
    }
}
        class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException() {
            super("O segundo parâmetro deve ser maior que o primeiro.");
        }

}

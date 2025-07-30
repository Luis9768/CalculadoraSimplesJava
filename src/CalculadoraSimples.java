import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o primeiro número: ");
            double num1 = input.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = input.nextDouble();

            System.out.print("Digite o operador (+ - / *): ");
            char operacao = input.next().charAt(0);

            double resultado;

            switch (operacao) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("ERRO: Divisão por zero.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Operador inválido.");
                    continue;
            }

            System.out.println("Resultado: " + resultado);

            System.out.print("Deseja continuar? (s/n): ");
            String resposta = input.next(); // Corrigido aqui!

            if (resposta.equalsIgnoreCase("n")) {
                System.out.println("Encerrando a Calculadora...");
                break;
            }

            System.out.println(); // linha em branco para separar os cálculos
        }

        input.close(); // Corrigido aqui!
    }
}


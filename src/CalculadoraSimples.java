import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[]args){
       Scanner input = new Scanner(System.in);

       System.out.print("Digite o primeiro numero: ");
        double num1 = input.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double num2 = input.nextDouble();
        System.out.print("Digite o operador (+ - / *): ");
        char operação = input.next().charAt(0);
        double resultado;
        if (operação == '+'){
            System.out.print("A soma é: ");
            System.out.print(num1+num2);}
        else if (operação == '-'){
            System.out.print("A subtração é: ");
            System.out.print(num1-num2);}
        else if (operação == '*'){
            System.out.print("A multiplicação é: ");
            System.out.print(num1*num2);}
        else if (operação == '/'){
            if(num2 != 0){
                resultado = num1/num2;}
            else{
                System.out.print("Divisão por 0.");
                return;}
        }
        else{
            System.out.print("Operação invalida.");
            return;}
        return;



        }
    }



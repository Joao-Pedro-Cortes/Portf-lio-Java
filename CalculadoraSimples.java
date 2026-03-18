
import java.util.Scanner;

public class CalculadoraSimples{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro numero: ");
            int num1 = scanner.nextInt();

            System.out.println("Digite o segundo numero: ");
            int num2 = scanner.nextInt();
            
            System.out.println("Qual operacao matemática voce gostaria de fazer? - + * /");
            char operador = scanner.next().charAt(0);
            
            if (operador == '-'){
                int resultado = num1 - num2;
                System.out.println("O resultado da subtração é: " + resultado);
            }
            else if (operador == '+'){
                int resultado = num1 + num2;
                System.out.println("O resultado da adição é: " + resultado);
            }
            else if (operador == '*'){
                int resultado = num1 * num2;
                System.out.println("O resultado da multiplicação é: " + resultado);
            }
            else if (operador == '/'){
                if (num2 == 0) {
                    throw new ArithmeticException("Não é permitido dividir por zero!");
                }
                int resultado = num1 / num2;
                System.out.println("O resultado da divisão é: " + resultado);
            }
            else {
                System.out.println("Operador inválido!");
            }
            
        } catch (ArithmeticException e) {
            System.out.println("❌ Erro matemático: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ Erro: Digite valores válidos!");
        }

    }
}
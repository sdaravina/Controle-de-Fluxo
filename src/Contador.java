import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
            int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
            int parametroDois = scanner.nextInt(); 

            try {
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException exception) {
                System.out.println(exception.getMessage());
            }
    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("o 2º parametro deve ser maior que o primeiro");
        }

            int contagem = parametroDois - parametroUm; 
        for(int resultado = 1; resultado < contagem; resultado++);    

    }
}

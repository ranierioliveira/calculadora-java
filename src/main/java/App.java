import br.com.infnet.OpcoesMenu;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        OpcoesMenu opcaosMenu = new OpcoesMenu();
        String operacaoMatematica;
        do {
            opcaosMenu.mostrarMenu();
            operacaoMatematica = sc.nextLine();
            opcaosMenu.validacaoDoInput(operacaoMatematica);

            if (operacaoMatematica.equals("0")) {
                System.out.println("Obrigado por usar esta calculadora.");
                break;
            }

            double primeiroValor = OpcoesMenu.recebePrimeiroValor();
            double segundoValor = OpcoesMenu.recebeSegundoValor();

            double resultado = opcaosMenu.calculo(primeiroValor, segundoValor, operacaoMatematica);
            System.out.println(resultado);

        } while (!operacaoMatematica.equals("0"));
    }

}

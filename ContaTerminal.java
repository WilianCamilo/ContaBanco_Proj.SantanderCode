import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main (String[] args){
       
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Olá, como posso te chamarr? ");
            String NOME = scanner.next();

            System.out.println("Qual sua Agencia de preferencia? ");
            String AGENCIA = scanner.next();

            System.out.println("Digite o numero de sua conta: ");
            String conta = scanner.next();

            System.out.println("Qual vai ser seu deposito (Saldo) inicial? ");
            String saldo = scanner.next();

            System.out.println("Olá, " + NOME + "! Obrigado por criar sua conta junto ao nosso banco, sua agencia é " + AGENCIA + ", e conta de numero " + conta + ", ja seu saldo atual é R$: " + saldo + " . Lembrando que ele já esta disponivel para saques!");
        }

    }
}
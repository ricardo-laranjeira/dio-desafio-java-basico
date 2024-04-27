import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numeroConta;
        String numeroAgencia, nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem vindo ao nosso banco!!!");

        System.out.print("Digite o numero da Conta: ");
        numeroConta = scanner.nextInt();

        System.out.print("Digite o numero da Agencia: ");
        numeroAgencia = scanner.next();

        System.out.print("Digite o nome do Cliente: ");
        nomeCliente = scanner.next();

        System.out.print("Digite o saldo: ");
        saldo = scanner.nextDouble();

        System.out.print("Olá" + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + numeroAgencia +", conta "
                + numeroConta + " e seu saldo é de "
                + saldo + " já está disponível para saque");
    }
}
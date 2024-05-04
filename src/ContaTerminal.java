import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Número da conta: ");
        Integer numeroConta = Integer.valueOf(scanner.next());
        System.out.print("Agência: ");
        String numeroAgencia = scanner.next();
        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.next();
        System.out.print("Saldo: ");
        Double saldo = Double.parseDouble(scanner.next());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                numeroAgencia + " conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque." );

    }
}
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela classe Scanner os valores digitados no terminal
        //Exibir a mensagem final

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
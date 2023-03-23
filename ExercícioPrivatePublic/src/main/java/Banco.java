import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Conta conta = new Conta();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome ");
        cliente.getNome(sc.nextLine());
        System.out.println("CPF ");
        cliente.getCpf(sc.nextInt());

        System.out.println("Saldo da sua conta: ");
        conta.setSaldo(sc.nextDouble());
        Conta.mQtd();

        System.out.println("""
                Escolha um tipo de operação:\s
                n°1 = Sacar
                n°2 = Depositar
                n°3 = Fazer extrato da conta
                """);
        sc.nextLine();
        int op = sc.nextInt();
        if(op == 1){
            System.out.println("Qual o valor que deseja sacar");
            conta.sacar(sc.nextDouble());
        }
        else if (op == 2){
            System.out.println("Qual o valor que deseja depositar");
            conta.depositar(sc.nextDouble());
        }
        else if (op == 3){
            System.out.println("Extrato da sua conta");
            conta.extrato();
        }
    }
}

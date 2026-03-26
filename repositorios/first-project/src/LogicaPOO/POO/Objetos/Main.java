package LogicaPOO.POO.Objetos;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância da ContaBancaria
        ContaBancaria conta = new ContaBancaria("Renato Oliveira", 1698103, 1000);
        // Realizando um depósito
        conta.depositar(500.0);

        // Realizando um saque
        conta.sacar(300.0);

        // Print saldo final
        System.out.println("Saldo final: R$" + conta.getSaldo());
    }
}

package LogicaPOO.POO.Objetos;

public class ContaBancaria {

    // Atributos privados
    private String titular;
    private int numeroConta;
    private double saldo;

    //Construtor da classe
    public ContaBancaria(String titular, int numeroConta, double saldoInicial){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    // Metodo para consultar o saldo
    public double getSaldo(){
        return saldo;
    }

    // Metodo para depositar um valor
    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Depósito realizado: R$" + valor);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Metodo para sacar um valor, com verificação de saldo suficiente
    public void sacar(double valor){
        if (valor > 0){
            if (saldo >= valor){
                saldo -= valor;
                System.out.println("Saque realizado: R$" + valor);
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }

    // Getters para outros atributos
    public String getTitular(){
        return titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
};
package aula05;

import javax.swing.*;

public class Aula05 {
    public static void main(String[] args) {

        String NumConta = JOptionPane.showInputDialog("Qual o numero da conta?");
        String Dono = JOptionPane.showInputDialog("Qual seu nome");
        String abrirConta = JOptionPane.showInputDialog ("Tipo CC ou CP");
        String Saldo = JOptionPane.showInputDialog("Digite o saldo inicial da conta");
        String Status = JOptionPane.showInputDialog("Infome o Status da cinta - 0 Finalizada ou 1 Ativa");
        ContaBanco p1 = new ContaBanco();

        p1.setDono(Dono);
        p1.setNumConta(Integer.valueOf(NumConta));
        p1.setTipo(abrirConta);
        p1.setSaldo(Float.parseFloat(Saldo));
        p1.setStatus(Boolean.parseBoolean(Status));

        ContaBanco p2 = new ContaBanco();

        p2.setDono(Dono);
        p2.setNumConta(Integer.valueOf(NumConta));
        p2.setTipo(abrirConta);
        p2.setSaldo(Float.valueOf(Saldo));

        p1.depositar(100);
        p2.depositar(500);

        p2.sacar(100);
        p1.sacar(100);

        p1.pagarMensal();
        p2.pagarMensal();

        p1.estadoAtual();
        p2.estadoAtual();
    }
}

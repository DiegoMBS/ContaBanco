package aula05;

public class Aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(12345);
        p1.setDono("gertrudis Tester");
        p1.abrirConta("CC");


        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(54321);
        p2.setDono("Creuza Brazuka");
        p2.abrirConta("CP");

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

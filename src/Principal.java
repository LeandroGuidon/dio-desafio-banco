
public class Principal {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.setNome("Leandro");
		
		
		Conta cc = new ContaCorrente(c1);
		cc.depositar(100);
		cc.sacar(50);

		
		Conta cp = new ContaPoupanca(c1);
		cp.depositar(150);
		cp.sacar(20);

		cc.transferir(40, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}


public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	
	private static int SEQUENCIAL = 1;
	
	private int agencia;
	private int numero;
	private double saldo;
	private Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		
	}
	
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	

	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.getCliente().getNome()));
		System.out.println(String.format("Agencia: %d", this.getAgencia()));
		System.out.println(String.format("Numero: %d", this.getNumero()));
		System.out.println(String.format("Saldo: %.2f", this.getSaldo()));
	}
	
}

package refactoring.cuenta;

public abstract class CuentaBancaria {
	protected HistorialMovimientos historialDeMovimientos;
	protected Notificador notificador;
	protected int saldo;
	
	public CuentaBancaria(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super();
		this.historialDeMovimientos = historialDeMovimientos;
		this.notificador = notificador;
		this.saldo = saldo;
	}

	public int getSaldo() {
		return saldo;
	}
	
	public void extraer(Integer monto) {
		if(this.condicionExtraccion(monto)) {
			this.saldo = saldo - monto;
			this.historialDeMovimientos.registrarMovimiento("Extraccion", monto);
			this.notificador.notificarNuevoSaldoACliente(this);
		}
	}
	
	protected abstract boolean condicionExtraccion(Integer monto);
}

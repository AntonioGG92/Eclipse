package ejercicio1;

public class Cuenta {
	private String nombreCliente;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;

	public Cuenta() {

	}

	public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo) {
		this.nombreCliente = nombreCliente;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
	}

	public Cuenta(Cuenta miCuenta) {
		this.nombreCliente = miCuenta.nombreCliente;
		this.numeroCuenta = miCuenta.numeroCuenta;
		this.tipoInteres = miCuenta.tipoInteres;
		this.saldo = miCuenta.saldo;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean ingreso(double cantidad) {
		if (this.saldo > 0) {
			this.saldo += cantidad;
			return true;
		} else {
			return false;
		}
	}

	public boolean reintegro(double cantidad) {
		if (this.saldo >= cantidad && cantidad > 0) {
			this.saldo -= cantidad;
			return true;
		} else {
			return false;

		}
	}
	
	public boolean transferencia (Cuenta cuentaDestino, double importe) {
		if(this.saldo >= importe && importe>0) {
			this.saldo= this.saldo-importe;
			cuentaDestino.saldo+=importe;
			return true;
		}else {
			return false;
		}
	}
}

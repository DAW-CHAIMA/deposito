package Cuentas;
/**
 *Clase que representa a una cuenta 
 ** @author Chaima
 **/
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInterés() {
		return tipoInterés;
	}
	
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
	 *Devuelve estado de la cuenta 
	 ** @return  saldo de la cuenta 
	 **/
	public double estado()
    {
        return saldo;
    }
	/**Ingresa una cantidad en la cuenta 
	 * @parm Cantidad a ingresar
	 *  @trows Exception si cantidad es negativa 
	 * */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
    /**Retira una cantidad en la cuenta 
	 * @parm Cantidad a retirar
	 *  @trows Exception si cantidad es negativa o cero
	 * */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}

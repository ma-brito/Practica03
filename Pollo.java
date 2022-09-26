public class Pollo extends Ingrediente{
	/**
	 * Clase para agregar Pepperoni.
	 * se extiende a la clase ingrediente
	 */
	
	public Pollo(WaySub centro){
		super(centro);
	}

	/**
	 * @return ticket agregando el pollo
	 */

	public String getTicket(){
		return centro.getTicket() + "\n+Pollo";
	}

/**
	 * @return precio agregando lo que vale el pollo
	 */

	public double getPrecio(){
		return centro.getPrecio() + 1.50;
	}

}
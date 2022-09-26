public class Pepperoni extends Ingrediente{

	/**
	 * Clase para agregar Pepperoni.
	 * se extiende a la clase ingrediente
	 */

    public Pepperoni(WaySub centro){
		super(centro);
	}
/**
	 * @return ticket agregando el pepperoni
	 */

	public String getTicket(){
		return centro.getTicket() + "\n+Pepperoni";
	}

	/**
	 * @return precio agregando lo que vale el pepperoni
	 */

	public double getPrecio(){
		return centro.getPrecio() + 0.75;
	}

}

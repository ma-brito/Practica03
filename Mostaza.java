public class Mostaza extends Ingrediente{

	/**
	 * Clase para agregar la Mostaza.
	 * se extiende a la clase ingrediente
	 */

    public Mostaza(WaySub centro){
		super(centro);
	}

	/**
	 * @return ticket agregando la Mayonesa
	 */
	
	public String getTicket(){
		return centro.getTicket() + "\n+Mostaza";
	}


/**
	 * @return precio agregando cuanto vale la mostaza
	 */

	public double getPrecio(){
		return centro.getPrecio() + 0.20;
	}

}

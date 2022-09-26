public class Mayonesa extends Ingrediente{

	/**
	 * Clase para agregar la Mayonesa.
	 * se extiende a la clase ingrediente
	 */

	public Mayonesa(WaySub centro){
		super(centro);
	}

	/**
	 * @return ticket agregando la Mayonesa
	 */

	public String getTicket(){
		return centro.getTicket() + "\n+Mayonesa";
	}
/**
	 * @return precio agregando cuanto vale la mayonesa
	 */

	public double getPrecio(){
		return centro.getPrecio() + 0.20;
	}

}
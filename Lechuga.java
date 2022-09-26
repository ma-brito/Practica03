public class Lechuga extends Ingrediente{

	/**
	 * Clase para agregar la Lechuga.
	 * se extiende a la clase ingrediente
	 */

    public Lechuga(WaySub centro){
		super(centro);
	}
/**
	 * @return ticket agregando la lechuga
	 */

	public String getTicket(){
		return centro.getTicket() + "\n+Lechuga";
	}
    
	/**
	 * @return precio agregando lo que vale la lechuga
	 */

	public double getPrecio(){
		return centro.getPrecio() + 2.50;
	}

}

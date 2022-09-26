public class Jamon extends Ingrediente {

	 /**
	 * Clase para agregar el jamon.
	 * se extiende a la clase ingrediente
	 */

    public Jamon(WaySub centro){
		super(centro);
	}

	 /**
	 * @return ticket agregando el jamon
	 */

	public String getTicket(){
		return centro.getTicket() + "\n+Jamon";
	}

	 /**
	 * @return precio agregando lo que vale el jamon
	 */

	public double getPrecio(){
		return centro.getPrecio() + 4;
	}

}

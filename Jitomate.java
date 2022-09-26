public class Jitomate extends Ingrediente{
	 
	/**
	 * Clase para agregar el jitomate.
	 * se extiende a la clase ingrediente
	 */

    public Jitomate(WaySub centro){
		super(centro);
	}

 /**
	 * @return ticket agregando el jitomate
	 */

	public String getTicket(){
		return centro.getTicket() + "\n+Jitomate";
	}

	 /**
	 * @return precio agregando lo que vale el jitomate
	 */

	public double getPrecio(){
		return centro.getPrecio() + 0.50;
	}

}

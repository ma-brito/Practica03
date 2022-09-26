public class Cebolla extends Ingrediente{

	 /**
	 * Clase para agregar la cebolla.
	 * se extiende a la clase ingrediente
	 */

    public Cebolla(WaySub centro){
		super(centro);
	}
   
	 /**
	 * @return ticket agregando la cebolla
	 */

	public String getTicket(){
		return centro.getTicket() + "\n+Cebolla";
	}
     
	 /**
	 * @return precio agregando lo que vale la cebolla
	 */

	public double getPrecio(){
		return centro.getPrecio() + 1.5;
	}

}

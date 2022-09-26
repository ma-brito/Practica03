public class Catsup extends Ingrediente{

	 /**
	 * Clase para agregar la catsup.
	 */

    public Catsup(WaySub centro){
		super(centro);
	}
 /**
	 * @return el ticket agregando la catsup
	 */

	public String getTicket(){
		return centro.getTicket() + "\n+Catsup";
	}
 /**
	 * @return el precio agregando lo que vale la Catsup
	 */

	public double getPrecio(){
		return centro.getPrecio() + 0.20;
	}

}

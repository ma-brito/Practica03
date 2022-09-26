public class PanUno extends Ingrediente{

	 /**
	 *Constructor del Pan Uno
	 *se extiende a la clase ingrediente
	 */

	public PanUno(WaySub centro){
		super(centro);
	}
/**
	 * @return Ticket agregando el pan de Ajonjoli
	 */

	public String getTicket(){
		return centro.getTicket() + "\n+Pan de ajonjolí";
	}
	 /**
	 * @return precio agregando lo que vale el pan de Ajonjoli
	 */
	
	public double getPrecio(){
		return centro.getPrecio() + 0.5;
	}

}
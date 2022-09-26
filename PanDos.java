public class PanDos extends Ingrediente{

	/**
	 *Constructor del Pan Dos
	 *se extiende a la clase ingrediente
	 */

	public PanDos(WaySub centro){
		super(centro);
	}

    /**
	 * @return Ticket agregando el pan premium
	 */

	public String getTicket(){
		return centro.getTicket() + "\n+Pan Premium";
	}

	/**
	 * @return precio y cuanto vale el pan premium
	 */

	public double getPrecio(){
		return centro.getPrecio() + 1;
	}

}
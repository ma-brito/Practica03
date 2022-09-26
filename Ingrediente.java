public abstract class Ingrediente implements WaySub{
	protected WaySub centro;

	 /**
	 *Contructor de la Clase ingrediente implementada a Waysub.
	 */

	public Ingrediente(WaySub centro){
		this.centro = centro;
	}

	/**
	 * devuelve el ticket de compra
	 * @return el ticket de compra
	 */
	public String getTicket(){
		return centro.getTicket();
	}
	
	/**
	 * devuelve el precio de la compra
	 * @return el precio de la compra
	 */
	public double getPrecio(){
		return centro.getPrecio();
	}
}
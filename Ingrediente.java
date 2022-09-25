public abstract class Ingrediente implements WaySub{
	protected WaySub centro;

	public Ingrediente(WaySub centro){
		this.centro = centro;
	}

	public String getTicket(){
		return centro.getTicket();
	}
	
	public double getPrecio(){
		return centro.getPrecio();
	}
}
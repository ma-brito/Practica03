public class PanDos extends Ingrediente{

	public PanDos(WaySub centro){
		super(centro);
	}

	public String getTicket(){
		return centro.getTicket() + "\n+Pan Premium";
	}

	public double getPrecio(){
		return centro.getPrecio() + 1;
	}

}
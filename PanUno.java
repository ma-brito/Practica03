public class PanUno extends Ingrediente{

	public PanUno(WaySub centro){
		super(centro);
	}

	public String getTicket(){
		return centro.getTicket() + "\n+Pan de ajonjolí";
	}
	
	public double getPrecio(){
		return centro.getPrecio() + 0.5;
	}

}
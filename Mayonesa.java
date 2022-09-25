public class Mayonesa extends Ingrediente{

	public Mayonesa(WaySub centro){
		super(centro);
	}

	public String getTicket(){
		return centro.getTicket() + "\n+Mayonesa";
	}

	public double getPrecio(){
		return centro.getPrecio() + 0.20;
	}

}
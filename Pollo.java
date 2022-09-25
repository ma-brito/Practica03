public class Pollo extends Ingrediente{

	public Pollo(WaySub centro){
		super(centro);
	}

	public String getTicket(){
		return centro.getTicket() + "\n+Pollo";
	}


	public double getPrecio(){
		return centro.getPrecio() + 1.50;
	}

}
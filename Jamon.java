public class Jamon extends Ingrediente {
    public Jamon(WaySub centro){
		super(centro);
	}

	public String getTicket(){
		return centro.getTicket() + "\n+Jamon";
	}

	public double getPrecio(){
		return centro.getPrecio() + 0.25;
	}

}

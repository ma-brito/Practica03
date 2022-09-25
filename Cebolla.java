public class Cebolla extends Ingrediente{
    public Cebolla(WaySub centro){
		super(centro);
	}

	public String getTicket(){
		return centro.getTicket() + "\n+Cebolla";
	}

	public double getPrecio(){
		return centro.getPrecio() + 0.20;
	}

}

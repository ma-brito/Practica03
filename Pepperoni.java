public class Pepperoni extends Ingrediente{
    public Pepperoni(WaySub centro){
		super(centro);
	}

	public String getTicket(){
		return centro.getTicket() + "\n+Pepperoni";
	}

	public double getPrecio(){
		return centro.getPrecio() + 0.75;
	}

}

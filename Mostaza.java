public class Mostaza extends Ingrediente{
    public Mostaza(WaySub centro){
		super(centro);
	}

	public String getTicket(){
		return centro.getTicket() + "\n+Mostaza";
	}

	public double getPrecio(){
		return centro.getPrecio() + 0.20;
	}

}

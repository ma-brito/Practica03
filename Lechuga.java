public class Lechuga extends Ingrediente{
    public Lechuga(WaySub centro){
		super(centro);
	}

	public String getTicket(){
		return centro.getTicket() + "\n+Lechuga";
	}

	public double getPrecio(){
		return centro.getPrecio() + 0.25;
	}

}

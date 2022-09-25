public class Catsup extends Ingrediente{
    public Catsup(WaySub centro){
		super(centro);
	}

	public String getTicket(){
		return centro.getTicket() + "\n+Catsup";
	}

	public double getPrecio(){
		return centro.getPrecio() + 0.20;
	}

}

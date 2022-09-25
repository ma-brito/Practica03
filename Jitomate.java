public class Jitomate extends Ingrediente{
    public Jitomate(WaySub centro){
		super(centro);
	}

	public String getTicket(){
		return centro.getTicket() + "\n+Jitomate";
	}

	public double getPrecio(){
		return centro.getPrecio() + 0.50;
	}

}

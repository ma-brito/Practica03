public class AdapterPizza implements WaySub{
	private Pizza pizza;
	public AdapterPizza(Pizza pizza){
		this.pizza = pizza;
	}

	@Override
	public String getTicket(){
		String cadena = "***Ticket de compra***\n+" + pizza.getQueso() + "\n+" + pizza.getMasa() + "\n+" + pizza.getCarne() ;
		return cadena;
	}

	@Override
	public double getPrecio(){
		return pizza.getPrecio();
	}
}
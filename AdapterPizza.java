public class AdapterPizza implements WaySub{


	/**
	 * @param pizza se coloca una pizza en el constructror 
	 * se implementa a la clase WaySub
	 * usa los metodos de getTcket y getPrecio
	 */

	private Pizza pizza;
	public AdapterPizza(Pizza pizza){
		this.pizza = pizza;
	}

	/**
	 * @return el ticket de compra 
	 */ 

	@Override
	public String getTicket(){
		String cadena = "***Ticket de compra***\n+" + pizza.getQueso() + "\n+" + pizza.getMasa() + "\n+" + pizza.getCarne() ;
		return cadena;
	}

	/**
	 * @return el precio de la pizza
	 */ 

	@Override
	public double getPrecio(){
		return pizza.getPrecio();
	}
}
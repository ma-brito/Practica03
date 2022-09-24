public class Pollo extends Ingrediente{

	public Pollo(WaySub centro){
		super(centro);
	}

	public String getTicket(){
		return centro.getTicket() + "\n+Pollo";
	}

	public int getPanUno(){
		return centro.getPanUno();
	}

	public int getPanDos(){
		return centro.getPanDos();
	}

	public int getPanTres(){
		return centro.getPanTres();
	}

	public int getPollo(){
		return centro.getPollo() + 1;
	}

	public int getPepperoni(){
		return centro.getPepperoni();
	}

	public int getJamon(){
		return centro.getJamon();
	}

	public int getLechuga(){
		return centro.getLechuga();
	}

	public int getJitomate(){
		return centro.getJitomate();
	}

	public int getCebolla(){
		return centro.getCebolla();
	}

	public int getMostaza(){
		return centro.getMostaza();
	}

	public int getCatsup(){
		return centro.getCatsup();
	}

	public int getMayonesa(){
		return centro.getMayonesa();
	}

	public double getPrecio(){
		return centro.getPrecio() + 1.50;
	}

}
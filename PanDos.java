public class PanDos extends Ingrediente{

	public PanDos(WaySub centro){
		super(centro);
	}

	public String getTicket(){
		return centro.getTicket() + "\n+Pan Premium";
	}

	public int getPanUno(){
		return centro.getPanUno();
	}

	public int getPanDos(){
		return centro.getPanDos() + 1;
	}

	public int getPanTres(){
		return centro.getPanTres();
	}

	public int getPollo(){
		return centro.getPollo();
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
		return centro.getPrecio() + 1;
	}

}
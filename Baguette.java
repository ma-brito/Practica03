public class Baguette implements WaySub{

	private String ticket;
	private int panUno;
	private int panDos;
	private int panTres;
	private int pollo;
	private int pepperoni;
	private int jamon;
	private int lechuga;
	private int jitomate;
	private int cebolla;
	private int mostaza;
	private int catsup;
	private int mayonesa;
	private double precio;

	public Baguette(){
		ticket = "***Ticket de compra***";
		panUno = 0;
		panDos = 0;
		panTres = 0;
		pollo = 0;
		pepperoni = 0;
		jamon = 0;
		lechuga = 0;
		jitomate = 0;
		cebolla = 0;
		mostaza = 0;
		catsup = 0;
		mayonesa = 0;
		precio = 0;
	}


	public String getTicket(){
		return ticket;
	}

	public int getPanUno(){
		return panUno;
	}

	public int getPanDos(){
		return panDos;
	}

	public int getPanTres(){
		return panTres;
	}

	public int getPollo(){
		return pollo;
	}

	public int getPepperoni(){
		return pepperoni;
	}

	public int getJamon(){
		return jamon;
	}

	public int getLechuga(){
		return lechuga;
	}

	public int getJitomate(){
		return jitomate;
	}

	public int getCebolla(){
		return cebolla;
	}

	public int getMostaza(){
		return mostaza;
	}

	public int getCatsup(){
		return catsup;
	}

	public int getMayonesa(){
		return mayonesa;
	}

	public double getPrecio(){
		return precio;
	}


}
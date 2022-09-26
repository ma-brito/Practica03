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

	/**
	* Contructor de la clase Baguette
	* @param ticket 
	* @param panUno 
	* @param panDos 
	* @param panTres 
	* @param pollo 
	* @param pepperoni
	* @param jamon 
    * @param lechuga 
	* @param jitomate 
	* @param cebolla 
	* @param mostaza 
	* @param catsup
	* @param mayonesa 
	* @param precio 
	 */ 

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

    /**
	 * @return el ticket
	 */

	public String getTicket(){
		return ticket;
	}
    /**
	 * @return el PanUno
	 */

	public int getPanUno(){
		return panUno;
	}
    /**
	 * @return el PanDos
	 */

	public int getPanDos(){
		return panDos;
	}

     /**
	 * @return el PanTres
	 */

	public int getPanTres(){
		return panTres;
	}
     /**
	 * @return el Pollo
	 */

	public int getPollo(){
		return pollo;
	}
    
	 /**
	 * @return el Pepperoni
	 */

	public int getPepperoni(){
		return pepperoni;
	}

     /**
	 * @return el Jamon
	 */

	public int getJamon(){
		return jamon;
	}
     /**
	 * @return la Lechuga
	 */

	public int getLechuga(){
		return lechuga;
	}
     /**
	 * @return el Jitomate
	 */

	public int getJitomate(){
		return jitomate;
	}
 /**
	 * @return Cebolla
	 */
	public int getCebolla(){
		return cebolla;
	}
 /**
	 * @return la Mostaza
	 */

	public int getMostaza(){
		return mostaza;
	}
    
	 /**
	 * @return la Catsup
	 */

	public int getCatsup(){
		return catsup;
	}

	   /**
	 * @return la mayonesa
	 */

	public int getMayonesa(){
		return mayonesa;
	}


	 /**
	 * @return el precio
	 */

	public double getPrecio(){
		return precio;
	}


}
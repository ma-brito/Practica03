public class Pizza{
    private String nombre;
    private String masa;
    private String queso;
    private String carne;
    private double precio;
    
    /**
	 * Constructor de la clase pizza
	 *@param nombre
	 *@param masa
	 *@param queso
	 *@param carne
	 *@param precio
	 */

    public Pizza(String nombre, String masa, String queso, String carne, double precio){
        this.nombre = nombre;
        this.masa = masa;
        this.queso = queso;
        this.carne = carne;
        this.precio = precio;

    /**
	 * @return el Nombre
	 */

    }
    public String getNombre(){
        return nombre;
    }
     
    /**
	 * @param Nombre de la pizzza
	 */

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    /**
	 * @return la Masa 
	 */

    public String getMasa(){
        return masa;
    }
     
    /**
	 * @param La masa
	 */

    public void setMasa(String masa){
        this.masa = masa;
    }

/**
	 * @return el queso
	 */

    public String getQueso(){
        return queso;
    }

    /**
	 * @param el queso 
	 */

    public void setQueso(String queso){
        this.queso = queso;
    }

/**
	 * @return la carne
	 */

    public String getCarne(){
        return carne;
    }

    /**
	 * @param la carne
	 */

    public void setCarne(String carne){
        this.carne = carne;
    }

    /**
	 * @return el precio
	 */

    public double getPrecio(){
        return precio;
    }

    /**
	 * @param el precio que va a costar
	 */

    public void setPrecio(double precio){
        this.precio = precio;
    }
}
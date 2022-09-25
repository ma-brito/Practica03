public class Pizza{
    private String nombre;
    private String masa;
    private String queso;
    private String carne;
    private double precio;
    
    public Pizza(String nombre, String masa, String queso, String carne, double precio){
        this.nombre = nombre;
        this.masa = masa;
        this.queso = queso;
        this.carne = carne;
        this.precio = precio;
    }
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getMasa(){
        return masa;
    }

    public void setMasa(String masa){
        this.masa = masa;
    }


    public String getQueso(){
        return queso;
    }

    public void setQueso(String queso){
        this.queso = queso;
    }


    public String getCarne(){
        return carne;
    }

    public void setCarne(String carne){
        this.carne = carne;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }
}
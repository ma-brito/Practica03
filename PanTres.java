public class PanTres extends Ingrediente{

        public PanTres(WaySub centro){
            super(centro);
        }
    
        public String getTicket(){
            return centro.getTicket() + "\n+Pan de ajonjoli";
        }
    
        public double getPrecio(){
            return centro.getPrecio() + 0.5;
        }
    
}

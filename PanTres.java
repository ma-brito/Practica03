public class PanTres extends Ingrediente{

    /**
	 *Constructor del Pan Tres
	 *se extiende a la clase ingrediente
	 */

        public PanTres(WaySub centro){
            super(centro);
        }
    /**
	 * @return Ticket agregando el pan de Ajonjoli
	 */

        public String getTicket(){
            return centro.getTicket() + "\n+Pan de ajonjoli";
        }
    /**
	 * @return precio agregando lo que vale el pan de Ajonjoli
	 */
        public double getPrecio(){
            return centro.getPrecio() + 0.5;
        }
    
}

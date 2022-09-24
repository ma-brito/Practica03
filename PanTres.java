public class PanTres extends Ingrediente{

        public PanTres(WaySub centro){
            super(centro);
        }
    
        public String getTicket(){
            return centro.getTicket() + "\nPan de ajonjoli";
        }
    
        public int getPanUno(){
            return centro.getPanUno();
        }
    
        public int getPanDos(){
            return centro.getPanDos();
        }
    
        public int getPanTres(){
            return centro.getPanTres() + 1;
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
            return centro.getPrecio() + 0.5;
        }
    
}

import java.lang.Math;
import java.util.Scanner;

public class Menu{
	
	public static void main(String[] args){

	
		int opcionComida;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido a baguette Subs, ¿Que desea ordenar?");
		System.out.println("Que vas a ordenar, una pizza o un baguette?");
		System.out.println(
			"1.- Baguette.\n"+
				"2.- Pizza.\n");

				while (true){
					try {
						String opcionUsuario = sc.nextLine();
						opcionComida = Integer.parseInt(opcionUsuario);
						break;
					}catch (NumberFormatException ex){
						System.out.println("Por favor elige la opcion VALIDA ");
						System.out.println("Que vas a ordenar, una pizza o un baguette?");
						System.out.println(
							"1.- Baguette.\n"+
							"2.- Pizza.\n");
					}
				}
		
				switch(opcionComida){

					case 1:
					WaySub baguette = new Baguette();
					String ticket;
					double precio;
					int opcionPan;
						baguette =  new PanUno(baguette);
		System.out.println("Que pan deseas?");
		System.out.println(
				"1.- Ajonjoli.\n" +
				"2.- Premium.\n" + 
				"3.- Blanco.\n");

				while (true){
					try {
						String opcionUsuario = sc.nextLine();
						opcionPan = Integer.parseInt(opcionUsuario);
						break;
					}catch (NumberFormatException ex){
						System.out.println("Por favor elige la opcion VALIDA ");
						System.out.println("Que pan deseas?");
						System.out.println(
								"1.- Ajonjoli.\n" +
								"2.- Premium.\n" + 
								"3.- Blanco.\n");
					}
				}
		
				switch(opcionPan){

					case 1:
						baguette =  new PanUno(baguette);

						break;
					case 2:
						baguette =  new PanDos(baguette);
						break;

					case 3:
						baguette =  new PanTres(baguette);
						break;

				}
		
		boolean terminar = false;
		do{
			int opcion;
			System.out.println("Que ingredientes deseas agregar a tu baguette?\n"+
				"1-Pollo.\n" + "2.Pepperoni. \n"  + "3.Jamon\n" + "4.Lechuga" + "5.Jitomate\n" + "6.Cebolla\n" + "7.Mostaza\n" + "8.Catsup\n" + "9.mayonesa\n" + "10.Terminar baguette\n");

				while (true){
					try {
						String opcionUsuario = sc.nextLine();
						opcion = Integer.parseInt(opcionUsuario);
						break;
					}catch (NumberFormatException ex){
						System.out.println("Por favor, elige una opcion valida de ingrediente\n"+ "Que ingredientes deseas agregar a tu baguette?\n"+
						"1-Pollo.\n" + "2.Pepperoni. \n"  + "3.Jamon\n" + "4.Lechuga" + "5.Jitomate\n" + "6.Cebolla\n" + "7.Mostaza\n" + "8.Catsup\n" + "9.mayonesa" ); 
					}
				}

				switch(opcion){

				case 1:
					baguette = new Pollo(baguette);
					break;

				case 2:
					baguette = new Pepperoni(baguette);
					break;

				case 3:
					baguette = new Jamon(baguette);
					break;
				
				case 4:
					baguette = new Lechuga(baguette);
					break;

				case 5:
					baguette = new Jitomate(baguette);
					break;

				case 6:
					baguette = new Cebolla(baguette);
					break;

				case 7:
					baguette = new Mostaza(baguette);
					break;

				case 8:
					baguette = new Catsup(baguette);
					break;

				case 9:
					baguette = new Mayonesa(baguette);
					break;

				case 10:
					if(opcionPan == 1){
						baguette = new PanUno(baguette);
					}
					else if(opcionPan == 2){
						baguette = new PanDos(baguette);
					}
					else if(opcionPan == 3){
						baguette = new PanTres(baguette);
					}
				terminar = true;
					break;
				
				default:
					System.out.println("Opcion no valida");
					break;
			}

			ticket = baguette.getTicket();
			precio = baguette.getPrecio();
		}while(!terminar);

		System.out.println("A continuacion, tu ticket de compra:\n" +ticket + "\nPrecio total: " + precio);
		case 2:
		Pizza pizzaUno = new Pizza("Hawaiana", "masa delgada", "queso cheddar", "jamón" , 170.00);
		Pizza pizzaDos = new Pizza("Pepperoni", "masa gruesa","queso manchego", "jamón" , 175.00);
		Pizza pizzaTres = new Pizza("Salchicha", "masa gruesa","queso cheddar", "salchicha" , 180.00);
		Pizza pizzaCuatro = new Pizza("Pizza con pollo", "masa delgada","queso machego", "pollo" , 160.00);
		Pizza pizzaCinco = new Pizza("Especialidad", "masa gruesa","queso manchego", "pollo" , 190.00);
		Pizza[] pizzas = {pizzaUno, pizzaDos, pizzaTres, pizzaCuatro, pizzaCinco};
		System.out.println("Que pizza deseas?\n");
		for(int i = 0; i < pizzas.length; i++){
			System.out.println((i+1) + ".- " + pizzas[i].getNombre() + " $" + pizzas[i].getPrecio());
		}
		int opcionPizza;
		while (true){
			try {
				String opcionUsuario = sc.nextLine();
				opcionPizza = Integer.parseInt(opcionUsuario);
				break;
			}catch (NumberFormatException ex){
				System.out.println("Por favor, elige una opcion valida de pizza\n");
				for(int i = 0; i < pizzas.length; i++){
					System.out.println((i+1) + ".- " + pizzas[i].getNombre() + " $" + pizzas[i].getPrecio());
				}
			}
		}
		Pizza pizza = pizzas[opcionPizza - 1];
		AdapterPizza adapterPizza = new AdapterPizza(pizza);
		System.out.println("A continuacion, tu ticket de compra:\n" +adapterPizza.getTicket() + "\nPrecio total: " + adapterPizza.getPrecio());
	}

	}
}
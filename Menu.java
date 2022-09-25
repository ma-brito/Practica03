import java.lang.Math;
import java.util.Scanner;

public class Menu{
	
	public static void main(String[] args){

	
		int opcionComida;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido a baguette Subs, ¿Que desea ordenar?");
		System.out.println("Que vas a ordenar, una pizza o un baguette?");
		System.out.println(
				"1.- Pizza.\n" +
				"2.- Baguette.\n");

				while (true){
					try {
						String opcionUsuario = sc.nextLine();
						opcionComida = Integer.parseInt(opcionUsuario);
						break;
					}catch (NumberFormatException ex){
						System.out.println("Por favor elige la opcion VALIDA ");
						System.out.println("Que vas a ordenar, una pizza o un baguette?");
						System.out.println(
							"1.- Pizza.\n" +
							"2.- Baguette.\n");
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

	}
}
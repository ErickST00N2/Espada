package mx.com.Espada.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import mx.com.Espada.datos.Datos;
import mx.com.Espada.datos.IDatos;
import mx.com.Espada.domain.Espada;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method

		System.out.println("Espadas en Minecraft");

		// Inicializamos los objetos
		Espada espada1 = new Espada("AZUL", "AGUA", 1000, 15);
		Espada espada2 = new Espada("CAFE", "MADERA", 1250, 15);
		Espada espada3 = new Espada("ROJO", "FUEGO", 2500, 20);
		Espada espada4 = new Espada("AMARILLO", "ORO", 3000, 20);
		Espada espada5 = new Espada("GRIS", "HERRO", 4000, 20);

		// Objeto auxiliar
		Espada espada = null;
		System.out.println();

		// Crear Lista de espadas
		List<Espada> espadas = new ArrayList<Espada>();

		// Añadimos a la lista las espadas
		espadas.add(espada1);
		espadas.add(espada2);
		espadas.add(espada3);
		espadas.add(espada4);
		espadas.add(espada5);

		// Imprimir los datos de las espadas
		System.out.println("Los datos de la lista son: \n " + espadas);
		System.out.println();

		// Buscar un elemento especifico en la lista
		espada = espadas.get(2);
		System.out.println("Esta es la espada: \n" + espada);
		System.out.println();

		// Editar un elemento en la lista
		espada = espadas.get(1);
		espada.setPoder(128);
		espada.setTamanio(30);
		espadas.set(1, espada);
		System.out.println("Los datos actualizados son: \n " + espadas);
		System.out.println();

		// Eliminar un elemento en la lista
		espada = espadas.get(0);
		espadas.remove(0);
		System.out.println("Elemento eliminado: \n" + espada);
		System.out.println(espadas);
		System.out.println();

		// eliminar todo
		//espadas.clear();

		// validar si esta vacia la lista
		if (espadas.isEmpty()) {
			System.out.println("La lista esta vacia");
		} else {
			System.out.println("la lista es: " + espadas);
		}

		// Contar el tamaño de nuestra lista
		System.out.println("El tamanio de nuestra lista es: " + espadas.size());

		System.out.println();
		///////////////////////////////////////////////////////////////////////////////////

		// Creamos las variables que utilizaremos
		// Scanner:
		Scanner scan = null;

		// Menu:
		int menuP = 0, menuS = 0, indice = 0;

		// Espada:
		String color, tipo;
		int poder, tamanio;
		String search;
		int search2;

		// Datos
		IDatos datosEspada = new Datos();

		do {
			// Menu
			System.out.println("------ MENU ------");
			System.out.println("1.- Agregar nuevo registro");
			System.out.println("2.- Mostrar la lista");
			System.out.println("3.- Editar");
			System.out.println("4.- Buscar un elemento");
			System.out.println("5.- Buscar un elemento por atributo");
			System.out.println("6.- Eliminar un elemento");
			System.out.println("7.- Eliminar un elemento por atributo");
			System.out.println("8.- Contar todos los elementos de la lista");
			System.out.println("9.- Salir del menu");
			System.out.println("ELIGEN UNA OPCION");
			scan = new Scanner(System.in);
			menuP = scan.nextInt();

			switch (menuP) {
			case 1:
				// Agregar un nuevo telefono

				System.out.println("1.- Agregar");

				System.out.println("Escribe el color de la espada: ");
				scan = new Scanner(System.in);
				color = scan.next();

				System.out.println("Escribe el tipo de la espada: ");
				scan = new Scanner(System.in);
				tipo = scan.nextLine();

				System.out.println("Escribe el poder del ESPADA: ");
				scan = new Scanner(System.in);
				poder = scan.nextInt();

				System.out.println("Escribe la tamanio del ESPADA : ");
				scan = new Scanner(System.in);
				tamanio = scan.nextInt();

				espada = new Espada(color, tipo, tamanio, poder);

				// Agregamos a la lista
				espadas.add(espada);
				System.out.println("El registro del telefono fue exitoso"); // Mensaje de exitoso

				break;

			case 2:
				// Imprimimos la lista

				System.out.println("2.- Mostrar la lista");
				System.out.println("La lista es: " + espadas);
				break;

			case 3:
				// Actualizar los valores de un elemento dentro de una lista
				System.out.println("3.- Editar elemento");

				// Pedimos la posicion del elemento de la lista que sera actualizada su
				// informacion
				System.out.println("Escribe el indice a editar \n" + "NOTA: EL INDICE MAXIMO QUE EXISTE POR AHORA ES: "
						+ (espadas.size() - 1));
				scan = new Scanner(System.in);
				indice = scan.nextInt();
				espada = espadas.get(indice);

				// Entramos a un menu secundario
				do {
					System.out.println("Que valor actualizaras?");
					System.out.println("1.- editar color de la espada");
					System.out.println("2.- editar tipo de espada");
					System.out.println("3.- editar poder de la espada");
					System.out.println("4.- editar tamanio de la espada");
					System.out.println("5.- Salir");
					scan = new Scanner(System.in);
					menuP = scan.nextInt();

					switch (menuP) {
					case 1:
						System.out.println("1.- editar color del telefono");
						System.out.println("Escribe la color del telefono: ");
						scan = new Scanner(System.in);
						color = scan.nextLine();
						espada.setColor(color);
						break;

					case 2:
						System.out.println("2.- editar tipo del telefono");
						System.out.println("Escribe el tipo del telefono: ");
						scan = new Scanner(System.in);
						tipo = scan.nextLine();
						espada.setTipo(tipo);
						break;

					case 3:
						System.out.println("3.- editar poder del telefono");
						System.out.println("Escribe el poder del telefono: ");
						scan = new Scanner(System.in);
						poder = scan.nextInt();
						espada.setPoder(poder);
						break;

					case 4:
						System.out.println("4.- editar tamanio del telefono");
						System.out.println("Escribe la tamanio del telefono : ");
						scan = new Scanner(System.in);
						tamanio = scan.nextInt();
						espada.setTamanio(tamanio);
						break;

					case 5:
						System.out.println("Hasta pronto!");
						break;
					}

				} while (menuS != 5);

				// Actualizamos el telefono en la posicion definida por el usuario
				espadas.set(indice, espada);
				System.out.println("Los datos actualizados son: \n " + espadas);

				menuS = 3;
				menuP = 3;

				break;

			case 4:
				System.out.println("4.- Buscar un elemento");

				// Pedimos la posicion del elemento de la lista
				System.out.println("Escribe el indice a buscar \n" + "NOTA: EL INDICE MAXIMO QUE EXISTE POR AHORA ES: "
						+ (espadas.size() - 1));
				scan = new Scanner(System.in);
				indice = scan.nextInt();
				espada = espadas.get(indice);

				// imprimir elemento encontrado
				System.out.println("El elemento encontrado es:  " + espada);

				break;

			case 5:
				System.out.println();
				System.out.println("5.- Buscar un elemento por atributo");
				System.out.println();
				do {
					System.out.println("Segundo Menu");
					System.out.println("1.-Busqueda por color de la espada");
					System.out.println("2.-Busqueda tipo de espada");
					System.out.println("3.-Busqueda poder de espada");
					System.out.println("4.-Busqueda tamanio de espada");
					System.out.println("5.-Salir");
					scan = new Scanner(System.in);
					menuP = scan.nextInt();

					switch (menuP) {
					case 1:
						System.out.println("1.-Busqueda por color de la espada");
						System.out.println("Dame el color");
						scan = new Scanner(System.in);
						search = scan.next();

						for (Espada espadaAux : espadas) {
							if (espadaAux.getColor().contains(search)) {
								System.out.println(espadaAux.toString());
							}
						}
						
						break;
					case 2:
						System.out.println("2.-Busqueda por tipo de la espada");
						System.out.println("Dame el tipo");
						scan = new Scanner(System.in);
						search = scan.next();
						for (Espada espadaAux : espadas) {
							if (espadaAux.getTipo().contains(search)) {
								System.out.println(espadaAux);
							}
						}
						break;
					case 3:
						System.out.println("3.-Busqueda por color de la espada");
						System.out.println("Dame el poder");
						scan = new Scanner(System.in);
						search2 = scan.nextInt();
						for (Espada espadaAux : espadas) {
							if (espadaAux.getPoder() == search2) {
								System.out.println(espadaAux);
							}
						}
						break;
					case 4:
						System.out.println("4.-Busqueda por tamanio de la espada");
						System.out.println("Dame el Tamanio");
						scan = new Scanner(System.in);
						search2 = scan.nextInt();
						for (Espada espadaAux : espadas) {
							if (espadaAux.getTamanio() == search2) {
								System.out.println(espadaAux);
							}
						}
						break;
					case 5:
						System.out.println("Hasta luego!");
						break;
					}

				} while (menuP != 5);

				

				break;

			case 6:
				System.out.println();
				System.out.println("6.- Eliminar un elemento");

				// Pedimos la posicion del elemento de la lista
				System.out.println("Escribe el indice a eliminar \n"
						+ "NOTA: EL INDICE MAXIMO QUE EXISTE POR AHORA ES: " + (espadas.size() - 1));
				scan = new Scanner(System.in);
				indice = scan.nextInt();
				espadas.remove(indice);

				// imprimir elemento encontrado
				System.out.println("El elemento fue eliminado exitosamente");

				break;

			case 7:
				System.out.println();
				System.out.println("5.- Eliminar un elemento por atributo");
				System.out.println();
				do {
					System.out.println("Segundo Menu");
					System.out.println("1.-Eliminar por color de la espada");
					System.out.println("2.-Eliminar tipo de espada");
					System.out.println("3.-Eliminar poder de espada");
					System.out.println("4.-Eliminar tamanio de espada");
					System.out.println("5.-Salir");
					scan = new Scanner(System.in);
					menuP = scan.nextInt();

					switch (menuP) {
					case 1:
						System.out.println("1.-Eliminar por color de la espada");
						System.out.println("Dame el color");
						scan = new Scanner(System.in);
						search = scan.next();
						for (Espada espadaAux : espadas) {
							if (espadaAux.getColor().contains(search)) {
								System.out.println(espadaAux);
								espadas.remove(espadaAux);

							}
						}
						break;
					case 2:
						System.out.println("2.-Eliminar por tipo de la espada");
						System.out.println("Dame el tipo");
						scan = new Scanner(System.in);
						search = scan.next();
						for (Espada espadaAux : espadas) {
							if (espadaAux.getTipo().contains(search)) {
								espadas.remove(espadaAux);							}
						}
						break;
					case 3:
						System.out.println("3.-Eliminar por color de la espada");
						System.out.println("Dame el poder");
						scan = new Scanner(System.in);
						search2 = scan.nextInt();
						for (Espada espadaAux : espadas) {
							if (espadaAux.getPoder() == search2) {
								espadas.remove(espadaAux);							}
						}
						break;
					case 4:
						System.out.println("4.-Eliminar por tamanio de la espada");
						System.out.println("Dame el Tamanio");
						scan = new Scanner(System.in);
						search2 = scan.nextInt();
						for (Espada espadaAux : espadas) {
							if (espadaAux.getTamanio() == search2) {
								espadas.remove(espadaAux);							}
						}
						break;
					case 5:
						System.out.println("Hasta luego!");

						break;
					}

				} while (menuP != 5);
				menuP = 7;

				break;

			case 8:
				System.out.println();
				System.out.println("8.- Contar todos los elementos de la lista");

				System.out.println("El tamaño de la lista es: " + espadas.size());
				break;
			case 9:
				System.out.println();
				System.out.println("Hasta Pronto!");
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: ");
			}
		} while (menuS != 9);

	}

}

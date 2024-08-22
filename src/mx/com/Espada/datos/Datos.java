package mx.com.Espada.datos;

import java.util.List;

import mx.com.Espada.domain.Espada;

public class Datos implements IDatos {

	public Datos() {

	}

	@Override
	public void crear(Espada espada, List<Espada> espadas, String color, String tipo, int poder, int tamanio) {
		// Pasamos los valores obtenidos a traves de nuestro objeto de telefono
		
		espada = new Espada(color, tipo, tamanio, poder);

		// Agregamos a la lista
		espadas.add(espada);
		System.out.println("El registro del telefono fue exitoso"); // Mensaje de exitoso

	}

	@Override
	public void listar(List<Espada> espadas) {
		// Imprimimos la lista

		System.out.println("2.- Mostrar la lista");
		System.out.println("La lista es: " + espadas);
	}

	@Override
	public void editar(int indice) {
		// TODO Auto-generated method stub
		

	}

	@Override
	public Espada buscar(int indice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Espada buscarPorElementoString(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Espada buscarPorElementoInt(int entero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarPorElementoString() {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarPorElementoInt() {
		// TODO Auto-generated method stub

	}

	@Override
	public int sizeList() {
		// TODO Auto-generated method stub
		return 0;
	}

}

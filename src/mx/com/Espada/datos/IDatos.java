/**
 * 
 */
package mx.com.Espada.datos;

import java.util.List;

import mx.com.Espada.domain.Espada;

/**
 * 
 */
public interface IDatos {

	public void crear(Espada espada, List<Espada> espadas, String color, String tipo, int poder, int tamanio);

	void listar(List<Espada> espadas);

	void editar(int indice);

	Espada buscar(int indice);

	Espada buscarPorElementoString(String string);

	Espada buscarPorElementoInt(int entero);

	void eliminar(int indice);

	void eliminarPorElementoString();

	void eliminarPorElementoInt();

	int sizeList();

}

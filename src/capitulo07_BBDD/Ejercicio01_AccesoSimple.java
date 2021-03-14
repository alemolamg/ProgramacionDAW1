package capitulo07_BBDD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import alemol.UtilsAlemol;

public class Ejercicio01_AccesoSimple {
	private static String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
	
	public static void main(String[] args) {
		try {
			Connection conn = ConnectionManagerV1.getConexion();
		   
			menu(conn);
			
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecuci�n SQL: " + ex.getMessage());
		}
		
		System.out.println("FIN DEL PROGRAMA");

	}
	
	
	public static void menu(Connection conn) throws SQLException {
		int elec = 0;
		do {
			mostrarMenu();
			
			System.out.println("Elige una opción: ");
			elec = UtilsAlemol.obtenerEnteroScanner();
			
			switch (elec) {
			case 1:
				listadoFabricantes(conn);				
				break;
				
			case 2:
				creaFabricante(conn);
				break;
				
			case 3:
				//eliminaFabricante(conn);
				break;

			case 4:
				//modificaFabricante(conn);
				break;
			
			
			default:
				elec = 0;
				break;
			}
			
		} while (elec != 0);
		
		
	}
	
	private static void listadoFabricantes(Connection conn) throws SQLException {
		String tabla = "fabricante";
		Statement s = (Statement) conn.createStatement(); 		
		ResultSet rs = s.executeQuery ("select * from " + tabla);
		
		// A trav�s del objeto ResultSetMetaData obtenemos informaci�n sobre las caracter�sticas de los campos que 
		// posee el conjunto de registros que hemos obtenido con la consulta. Gracias a eso podemos hacer una visualizaci�n
		// enriquecida del contenido del objeto ResultSet
		ResultSetMetaData rsmd= rs.getMetaData();			

		// Impresi�n en pantalla de los tipos de las columnas que forman el resultado del ResultSet
		System.out.println("\n-------------------------------------------------------------");
		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
			System.out.print(rsmd.getColumnTypeName(i) + "\t");
		}
		System.out.println("\n-------------------------------------------------------------");

		// Impresi�n e pantalla de las etiquetas de nombre de las columnas del objeto ResultSet
		System.out.println("\n-------------------------------------------------------------");
		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
			System.out.print(rsmd.getColumnLabel(i) + "\t");
		} 
		System.out.println("\n-------------------------------------------------------------");
		
		// Recorrido del ResultSet, diferenciando entre los tipos de datos que pueden tener las columnas
		while (rs.next()) {
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				if (rsmd.getColumnTypeName(i).equalsIgnoreCase("INT")) {
					System.out.print(rs.getInt(rsmd.getColumnLabel(i)) + "\t");
				}
				if (rsmd.getColumnTypeName(i).equalsIgnoreCase("VARCHAR")) {
					System.out.print(rs.getString(rsmd.getColumnLabel(i)) + "\t");
				}
				
			}
			System.out.println("\n");			
		}

		rs.close();
		s.close();
		
	}

	private static void creaFabricante(Connection conn) throws SQLException {
		int idNew = 0;
		System.out.println("Introduce el nombre del nuevo fabricante: ");
		String nombreF = UtilsAlemol.leerStringScanner();
		
		String consulta = "INSERT INTO fabricante VALUES"
				+ " (" + getIDMax(conn, "fabricante") + "," + getDNICIFAzar() + "," + nombreF +")";
		
		
	}

	
	
	private static String getIDMax(Connection conn, String tabla) throws SQLException {
		String busqueda = "SELECT MAX(id) FROM " + tabla;
		Statement s = (Statement) conn.createStatement();
		ResultSet rs = s.executeQuery(busqueda);
		return rs.getString(0);
	}


	/**
	 * 
	 * @return
	 */
	private static String getDNICIFAzar () {
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < 8; i++) {
			sb.append(UtilsAlemol.obtenerNumeroAzar(0, 9));
		}
		sb.append(abecedario.charAt(UtilsAlemol.obtenerNumeroAzar(0, abecedario.length()-1)));
		
		return sb.toString();
	}

	public static void mostrarMenu() {
		System.out.println("--- Menú del sistema ---");
		System.out.println("1. Mostrar todos los fabricantes"
				+ "2. Crear fabricante"
				+ "3. Eliminar fabricante"
				+ "4. Modificar fabricante");
	}

}

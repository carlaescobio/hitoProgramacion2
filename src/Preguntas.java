import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class Preguntas {
	public static final String SEPARADOR = "-";
	public static void main(String[] args){
			//Ficheros para leer
			File fichero = new File("preguntas.csv");
			Scanner s = null;
			File fichero2 = new File("respuestas.csv");
			Scanner s2 = null;
			try {
				// Leemos el contenido del fichero
				System.out.println("... Conteste a las siguientes preguntas ...");
				s = new Scanner(fichero);
				// Leemos linea a linea el fichero
				while (s.hasNextLine()) {
					String linea = s.nextLine();
					System.out.println(linea); 
					 Scanner lectorT = new Scanner(System.in);
						String letra = lectorT.nextLine();
				}

			} catch (Exception ex) {
				System.out.println("Mensaje: " + ex.getMessage());
			} finally {
				try {
					if (s != null)
						s.close();
				} catch (Exception ex2) {
					System.out.println("Mensaje 2: " + ex2.getMessage());
				}
			}
			try {
				// Leemos el contenido del fichero
				System.out.println("Las respuestas correctas eran :");
				s2 = new Scanner(fichero2);
				// Leemos linea a linea el fichero
				while (s2.hasNextLine()) {
					String linea = s2.nextLine();// Guardamos la linea en un String
					System.out.println(linea);
				}

			} catch (Exception ex2) {
				System.out.println("Mensaje: " + ex2.getMessage());
			} finally {
				try {
					if (s2 != null)
						s2.close();
				} catch (Exception ex2) {
					System.out.println("Mensaje 2: " + ex2.getMessage());
				}
			}
		}
	}

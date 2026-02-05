package Tarea_Login;

import java.io.File;
import java.util.Scanner;

public class Sesion {

	public Sesion(String usuario, String contraseña) {
		// TODO Auto-generated constructor stub
	}

	public boolean login(String usuario, String contraseña) {
		File file = new File("./assets/usuarios.txt");
		try {
			Scanner fileScanner = new Scanner(file);

			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				String[] data = line.split("#");

				// Comprobamos que la línea tenga todos los datos
				String fileUsername = data[0].trim();
				String filePassword = data[1].trim();

				if (fileUsername.equals(usuario) && filePassword.equals(contraseña)) {
					System.out.println("Sesión iniciada con éxito");
					fileScanner.close();
					return true;
				}

			}

			fileScanner.close();
			return false;
		} catch (Exception e) {
			System.out.println("Error al leer el archivo");
		}
		return false;
	}
}

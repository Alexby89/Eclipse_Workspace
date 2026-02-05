package regex;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Simulacro4 {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Introduce un dominio de correo: ");
		String dominio = teclado.nextLine().trim();

		if (dominio.length() > 0) {
			Usuario[] usuarios = obtenerUsuarios(dominio);

			enviarEmails(usuarios);

		} else {
			System.out.println("El dominio esta vacio");
		}
	}

	public static Usuario[] obtenerUsuarios(String dominio) {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();

		try {
			File fichero = new File("./assets/usuarios.txt");
			Scanner lector = new Scanner(fichero);
			while (lector.hasNextLine()) {
				String linea = lector.nextLine();
				String[] campos = linea.split("&");
				if (campos.length == 7 && campos[4].contains("@" + dominio)) {
					Usuario u = new Usuario(Integer.parseInt(campos[0]), campos[1], campos[2], campos[3], campos[4],
							campos[5], campos[6]);
					lista.add(u);
				}
			}
			lector.close();
		} catch (Exception e) {
			System.out.println("Un error ha ocurrido");
			e.printStackTrace();
		}

		Usuario[] usuarios = new Usuario[lista.size()];
		for (int i = 0; i < usuarios.length; i++) {
			usuarios[i] = lista.get(i);
		}
		return usuarios;
	}

	public static void enviarEmails(Usuario[] usuarios) {
		String plantilla = "";
		
		try {
			File fichero = new File("./assets/plantilla.html");
			Scanner lector = new Scanner(fichero);
			while (lector.hasNextLine()) {
				plantilla += lector.nextLine();
			}
			lector.close();
		} catch (Exception e) {
			System.out.println("Un error ha ocurrido");
			return;
		}
		
		for(int i = 0; i < usuarios.length; i++) {
			String email = plantilla.replaceAll("=nombre=", usuarios[i].getNombre())
									.replaceAll("=apellidos=", usuarios[i].getApellidos())
									.replaceAll("=dni=", usuarios[i].getDni())
									.replaceAll("=email=", usuarios[i].getCorreo())
									.replaceAll("=direccion=", usuarios[i].getDireccion())
									.replaceAll("=telefono=", usuarios[i].getTelefono());
			
			Date fecha = new Date();
			String[] partes = usuarios[i].getCorreo().split("@");
			try {
				FileWriter fichero = new FileWriter("./assets/" + partes[0] + fecha.getTime() + ".html");
				fichero.write(email);
				fichero.close();
			} catch(IOException e) {
				System.out.println("No se ha podido enviar el email");
			}
		}
	}
}

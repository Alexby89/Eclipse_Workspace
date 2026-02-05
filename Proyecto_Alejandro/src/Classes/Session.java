package Classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Session {

	private User user;
	private  boolean logged;
	private final String FILE_PATH = "./assets/files";
	private final String USERS_FILE = "./assets/files/users.txt";

	// CONSTRUCTOR
	public Session() {
		this.logged = false;
		this.user = null;
	}

	// LOGIN (para usuarios registrados)
	public void login() {
	    String username = Input.getString("Nombre de usuario: ");
	    //Comprobamos que la cadena no este vacia
	    if(username.length() == 0) {
	    	System.out.println("El nombre de usuario esta vacio");
	    	return;
	    //Comprobamos que, al iniciar sesion, el usuario existe	
	    }  else if(!userExists(username)) {
	    	System.out.println("El nombre de usuario es incorrecto");
	    	return;
	    }

	    String password = Input.getString("Contraseña: ");
	    //Comprobamos que la cadena no este vacia
	    if(password.length() == 0) {
	    	System.out.println("La contraseña esta vacia");
	    	return;
	    //Comprobamos la contraseña con la de su usuario, para ver si es correcta
	    } else if(!passwordEquals(password, username)) {
	    	System.out.println("La contraseña es incorrecta");
	    	return;
	    }

	    try {
	        File file = new File(USERS_FILE);
	        Scanner fileScanner = new Scanner(file);

	        while (fileScanner.hasNextLine()) {
	            String line = fileScanner.nextLine();
	            String[] data = line.split("#");

	            // Comprobamos que la línea tenga todos los datos
	            if (data.length >= 7) {
	                String fileUsername = data[0].trim();
	                String filePassword = data[1].trim();

	                if (fileUsername.equals(username) && filePassword.equals(password)) {
	                    this.user = new User(
	                        fileUsername,
	                        data[2].trim(),
	                        data[3].trim(),
	                        data[4].trim(),
	                        data[5].trim(),
	                        data[6].trim(),
	                        "user"
	                    );
	                    this.logged = true;
	                    System.out.println("Sesión iniciada con éxito");
	                    fileScanner.close();
	                    return;
	                }
	            }
	        }

	        fileScanner.close();
	    } catch (Exception e) {
	        System.out.println("Error al leer el archivo");
	    }
	}
	


	// REGISTRO (para registrar nuevos usuarios)
	public void signup() {
		String username = Input.getString("Nombre de usuario: ");
		if(username.length() == 0) {
	    	System.out.println("El nombre de usuario esta vacio");
	    	return;
	    } else if(userExists(username)) {
	    	System.out.println("Este nombre de usuario ya existe");
	    	return;
	    }

		String password = Input.getString("Contraseña: ");
	    if(password.length() == 0) {
	    	System.out.println("La contraseña esta vacia");
	    	return;
	    }
	    
	    String password2 = Input.getString("Repite la contraseña: ");
	    if(!password.equals(password2)) {
	    	System.out.println("Las contraseñas no coinciden");
	    	return;
	    }
		
	    String name = Input.getString("Nombre completo: ");
	    if(name.length() == 0) {
	    	System.out.println("El nombre completo esta vacio");
	    	return;
	    }

		String nif = Input.getString("NIF: ");
		if(nif.length() == 0) {
	    	System.out.println("El NIF esta vacio");
	    	return;
	    }
		
		String email = Input.getString("Correo: ");
		if(email.length() == 0) {
	    	System.out.println("El correo esta vacio");
	    	return;
	    }

		String address = Input.getString("Direccion completa: ");
		if(address.length() == 0) {
	    	System.out.println("La direccion completa esta vacia");
	    	return;
	    }
		
		String birthdate = Input.getString("Fecha de nacimiento: ");
		if(birthdate.length() == 0) {
	    	System.out.println("La fecha de nacimiento esta vacia");
	    	return;
	    }
		
		String NewLine ="\n" +  username + "#" + password + "#" + name + "#" + nif + "#" + email + "#" + address + "#" + birthdate + "#" + user;

		if (userExists(username)) {
			System.out.println("Usuario ya existente");
			return;
		}

		try {
			FileWriter writer = new FileWriter(USERS_FILE, true);
			writer.write(NewLine);
			writer.close();
			System.out.println("El usuario fue registrado correctamente");
		} catch (IOException e) {
			System.out.println("Error al escribir en el archivo");
		}
	}

	// Comprobar si hay alguna sesion iniciada
	public boolean isLogged() {
		return this.logged;
	}

	// Mostrar usuarios que estamos usando ahora mismo
	public void showUser() {
		if (logged && user != null) {
			System.out.println("\nUsuario conectado:");
			System.out.println("Username: " + user.getUsername());
			System.out.println("Nombre: " + user.getName());
			System.out.println("NIF: " + user.getNif());
			System.out.println("Email: " + user.getEmail());
			System.out.println("Direccion: " + user.getAddress());
			System.out.println("Fecha de nacimiento: " + user.getBirthdate());
			System.out.println("Role: " + user.getRole());
		} else {
			System.out.println("No hay ninguna sesión iniciada");
		}
	}

	// LOGOUT (cerrar sesion)
	public void logout() {
		this.logged = false;
		this.user = null;
		System.out.println("Sesión cerrada. Esperamos volver a verle pronto");
	}

	// Metodo privado para comprobar si el usuario existe
	private boolean userExists(String username) {
		try {
			File file = new File(USERS_FILE);
			Scanner fileScanner = new Scanner(file);

			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				String[] data = line.split("#");
				if (data[0].equals(username)) {
					fileScanner.close();
					return true;
				}
			}

			fileScanner.close();

		} catch (Exception e) {
			return false;
		}

		return false;
	}
	
	//Metodo privado para comprobar si la contraseña introducida al iniciar sesion es la misma que hay almacenada en el archivo de usuarios
	private boolean passwordEquals(String password, String username) {
		try {
			File file = new File(USERS_FILE);
			Scanner fileScanner = new Scanner(file);

			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				String[] data = line.split("#");
				
				if(data.length >= 2) {
					String fileUsername = data[0].trim();
					String filePassword = data[1].trim();
					
					if (fileUsername.equals(username)) {
						fileScanner.close();
						return filePassword.equals(password);
					}
				}
			}

			fileScanner.close();

		} catch (Exception e) {
			return false;
		}

		return false;
	}

	public String getFILE_PATH() {
		return FILE_PATH;
	}

}

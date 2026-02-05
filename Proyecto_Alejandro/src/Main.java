import Classes.Config;
import Classes.Input;
import Classes.Session;
import Classes.Maze;

public class Main {
	public static void main(String[] args) {
		Session session = new Session();
		Maze maze = new Maze(); //Creamos un nuevo objeto para la clase Maze
		System.out.print(Config.WELCOME);

		int option;

		do {
			//Se activa cuando se ha iniciado sesion
			if (session.isLogged()) {
				registeredMenu();
				option = Input.getInt();
				if (option == -1) {
					System.out.println("Opcion no valida");
					continue;
				}
				optionRegistered(option, session, maze); //añadimos el objeto maze
			//Se activa cuando no se ha iniciado sesion	
			} else {
				unregisteredMenu();
				option = Input.getInt();
				if (option == -1) {
					System.out.println("Opcion no valida");
					continue;
				}
				optionUnregistered(option, session);
			}

		} while (option != 0);
		System.out.print(Config.GOODBYE);
	}
	
	//Mostrar menu de usuario registrado
	private static void registeredMenu() {
		System.out.println(Config.LOGGED_MENU);
		System.out.print("\nSeleccione una opcion: ");
	}
	
	//Opciones para el menu de usuario registrado y añadimos los metodos de la clase maze en las opciones 1, 2 y 3
	private static void optionRegistered(int option, Session session, Maze maze) {
		switch (option) {
		case 1:
			maze.loadMaze(); 
			break;
		case 2:
			maze.showMaze();
			break;
		case 3:
			maze.setStartEnd();
			break;
		case 4:
			System.out.println("Opcion 'Resolver Laberinto' aun no implementada");
			break;
		case 5:
			session.showUser();
			break;
		case 6:
			session.logout();
			break;
		case 0:
			break;
		default:
			System.out.println("Opcion no valida");
		}
	}
	//Mostrar menu de usuarios no registrados
	private static void unregisteredMenu() {
		System.out.println(Config.UNLOGGED_MENU);
		System.out.print("\nSeleccione una opcion: ");
	}
	//Opciones para el menu de usuarios no registrados
	private static void optionUnregistered(int option, Session session) {
		switch (option) {
		case 1:
			session.login();
			break;
		case 2:
			session.signup();
			break;
		case 0:
			break;
		default: 
			System.out.println("Opcion no valida");
		}
	}
}
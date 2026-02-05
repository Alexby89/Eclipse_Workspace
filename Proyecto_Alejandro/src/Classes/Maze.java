package Classes;

import java.io.File;
import java.util.Scanner;

//Clase Maze con sus atributos
public class Maze {
	private char[][] map;
	private String filename;
	private boolean loaded = false;
	private int startI;
	private int startJ;
	private int endI;
	private int endJ;
	
	//Getters y Setters
	public char[][] getMap() {
		return map;
	}
	
	public void setMap(char[][] map) {
		this.map = map;
	}
	
	public String getFilename() {
		return filename;
	}
	
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	public boolean isLoaded() {
		return loaded;
	}
	
	public void setLoaded(boolean loaded) {
		this.loaded = loaded;
	}
	
	public int getStartI() {
		return startI;
	}
	
	public void setStartI(int startI) {
		this.startI = startI;
	}
	
	public int getStartJ() {
		return startJ;
	}
	
	public void setStartJ(int startJ) {
		this.startJ = startJ;
	}
	
	public int getEndI() {
		return endI;
	}
	
	public void setEndI(int endI) {
		this.endI = endI;
	}
	
	public int getEndJ() {
		return endJ;
	}
	
	public void setEndJ(int endJ) {
		this.endJ = endJ;
	}
	
	public void loadMaze() {
		filename = Input.getString("\nLABERINTOS:\n--------------\n1. laberinto1.txt\n2. laberinto2.txt\n3. laberinto3.txt\n4. laberinto4.txt\n\nIntroduce el nombre del fichero con el laberinto: ");
		File maze = new File( "./assets/mazes/" + filename);
		
		if(!maze.exists()) {
			System.out.println("El fichero no existe");
			return;
		}
		
		try {
	        Scanner reader = new Scanner(maze);
	        int rows = 0;
	        int cols = 0;

	        // Se cuentan las filas y las columnas
	        while (reader.hasNextLine()) {
	            String line = reader.nextLine();
	            cols = line.length();
	            rows++;
	        }

	        reader.close();
	        
	        if(rows == 0) {
	        	System.out.println("El laberinto esta vacio");
	        	return;
	        }
	        
	        //Se crea la matriz
	        map = new char[rows][cols];

	        // Se lee el laberinto
	        reader = new Scanner(maze);
	        int i = 0;

	        while (reader.hasNextLine()) {
	            String line = reader.nextLine();
	            for (int j = 0; j < cols; j++) {
	                map[i][j] = line.charAt(j);
	            }
	            i++;
	        }

	        reader.close();
	        loaded = true;
	        System.out.println("Laberinto cargado correctamente");
	    
	    //Laberinto limpio en caso de error
	    } catch (Exception e) {
	    	map = null;
	    	loaded = false;
	        System.out.println("Error al leer el fichero");
	    }
	}
	
	public void showMaze() {

	    if (!loaded) {
	        System.out.println("No hay ningún laberinto cargado");
	        return;
	    }

	    int rows = map.length;
	    int cols = map[0].length;

	    // Mostrar números de columnas (vertical)
	    System.out.print("   ");
	    for (int j = 0; j < cols; j++) {
	        System.out.print(j % 10 + " ");
	    }
	    System.out.println();

	    // Mostrar laberinto con números de fila
	    for (int i = 0; i < rows; i++) {

	        // Número de fila
	        System.out.printf("%2d ", i);

	        for (int j = 0; j < cols; j++) {

	            // Si hay inicio y fin, se muestran
	            if (i == startI && j == startJ) {
	                System.out.print("I ");
	            } else if (i == endI && j == endJ) {
	                System.out.print("F ");
	            } else {
	                System.out.print(map[i][j] + " ");
	            }
	        }
	        System.out.println();
	    }

	}
	
	public void setStartEnd() {

	    //Comprueba si hay algun laberinto cargado
		if (!loaded) {
	        System.out.println("No hay ningún laberinto cargado");
	        return;
	    }

	    int rows = map.length;
	    int cols = map[0].length;

	    //Pide las cordenadas para el inicio
	    System.out.println("\n--- Posición de INICIO ---");
	    startI = Input.getInt("Introduce la coordenada I: ");
	    startJ = Input.getInt("Introduce la coordenada J: ");

	    if (startI < 0 || startI >= rows || startJ < 0 || startJ >= cols) {
	        System.out.println("Coordenadas de inicio fuera del laberinto");
	        return;
	    }

	    //Pide las cordenadas para el fin
	    System.out.println("\n--- Posición de FIN ---");
	    endI = Input.getInt("Introduce la coordenada I: ");
	    endJ = Input.getInt("Introduce la coordenada J: ");

	    if (endI < 0 || endI >= rows || endJ < 0 || endJ >= cols) {
	        System.out.println("Coordenadas de fin fuera del laberinto");
	        return;
	    }

	    if (startI == endI && startJ == endJ) {
	        System.out.println("El inicio y el fin no pueden ser la misma casilla");
	        return;
	    }

	    System.out.println("\nInicio y fin establecidos correctamente");
	    return;
	}
}
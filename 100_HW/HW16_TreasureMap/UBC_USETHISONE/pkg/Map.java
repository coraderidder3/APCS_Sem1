package pkg;
import java.util.Scanner;
import java.util.Random;


public class Map {
	int [][] map;		// 2D Array as a visual representation of the map
	int treasureX;		// Hidden treasure location X coordinate
	int treasureY;		// Hidden treasure location Y coordinate
	int posX;			// Current X position of the player
	int posY;			// Current Y position of the player

	/*
		Initialize the 2D array map with row and column lengths.
		Initialize starting location as 0,0 including the starting map value of 2 for current location.
		Call generateTreasure to create a treasure location.
	*/
	public Map(int row, int column){
		map = new int[row][column];
		posX = 0;
		posY = 0;
	}

	/*
		Generate and X and Y coordinate of the treasure given the size of the map
	*/
	public void generateTreasure(){
		treasureX = (int)(Math.random()*map[0].length);
		treasureY = (int)(Math.random()*map.length);
	}

	/*
		The position of the player is changed depending on a command given.
		This method should also change map values to indicate where the player is.
		Add 2 if the player is in the current location. (should also update old positons)

		Integer paramter m for move represents the below commands:
		1 - up
		2 - down
		3 - left
		4 - right
		5 - left up
		6 - right up
		7 - left down
		8 - right down

		Returns true if the player location was moved correctly
		Returns false if the player choose an invalid location
	*/
	public boolean move(int m){
		if(m==1){ //up
			if(posY==0)
				return false;
			if(map[posY][posX]>1)
				map[posY][posX] = map[posY][posX]-2;
			posY++;
		}
		else if(m==2){ //down
			if(posY==map[0].length)
				return false;
			if(map[posY][posX]>1)
				map[posY][posX] = map[posY][posX]-2;
			posY--;
		}
		else if(m==3){ //left
			if(posX==0)
				return false;
			if(map[posY][posX]>1)
				map[posY][posX] = map[posY][posX]-2;
			posX--;
		}
		else if(m==4){ //right
			if(posX==map.length)
				return false;
			if(map[posY][posX]>1)
				map[posY][posX] = map[posY][posX]-2;
			posX++;
		}
		else if(m==5){ //leftup
			if(posY==0||posX==0)
				return false;
			if(map[posY][posX]>1)
				map[posY][posX] = map[posY][posX]-2;
			posX--;
			posY++;
		}
		else if(m==6){ //rightup
			if(posY==0||posX==map.length)
				return false;
			if(map[posY][posX]>1)
				map[posY][posX] = map[posY][posX]-2;
			posY++;
			posX++;
		}
		else if(m==7){ //leftdown
			if(posX==0||posY==map[0].length)
				return false;		
			if(map[posY][posX]>1)
				map[posY][posX] = map[posY][posX]-2;
			posX--;
			posY--;
		}
		else if(m==8){ //rightdown
			if(posX==map.length||posY==map[0].length)
				return false;
			if(map[posY][posX]>1)
				map[posY][posX] = map[posY][posX]-2;
			posX++;
			posY--;
		}
		else
			return false;
		return true;
	}	

	/*
		Given 2 integer parameters, check validity of location and move the current positon.
		This method should also change map values to indicate where the player is.
		Add 2 if the player is in the current location. (should also update old positons)

		Returns true if the player location was moved correctly
		Returns false if the player choose an invalid location
	*/
	public boolean move(int row, int col){
		posY=row;
		posX=col;

		return true;	// Dummy value to make work
	}

	/*
		This method checks for treasure!
		Check the current position of the player
		Adding 1 indicates that the spot has been searched for treasure.
			Only check unchecked spots.
		Returns true if treasure was found, false otherwise.
	*/
	public boolean dig(){
		if(map[posY][posX]==1)
			return false;
		if(posY==treasureY&&posX==treasureX)
			return true;
		map[posY][posX] = 1;
		return false;
	}

	/*
		This method prints the location of the treasure.
		Set the map value of the treasure to 7 (7 is the lucky number!)
		Print where the treasure was
		Call printMap()
	*/
	public void printTreasureLoc(){
		map[treasureY][treasureX] = 7;
		printMap();
		System.out.println("The treasure was at " + treasureX + ", " + treasureY + "!");
	}
	
	public void printMap(){
		System.out.println("------------------------------------");
		map[posY][posX] = map[posY][posX]+2;
		for(int r = 0; r < map.length; r++){
			for(int c = 0; c < map[0].length; c++){
				System.out.print(map[r][c]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("------------------------------------");
	}

}

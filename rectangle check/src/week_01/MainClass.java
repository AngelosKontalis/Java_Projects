package week_01;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
        boolean noSelection = true;
        
        while(noSelection == true) {
        	System.out.println("Do you want to check a rectangle? Y/N");
        	 
            char userChoice = userInput.next().charAt(0);
 
            if (userChoice=='y') {
            			
            	Scanner main_coordinates = new Scanner(System.in);
            	System.out.println("Enter x, y, width, height for the main Rectangle: ");
            	float px =main_coordinates.nextFloat();
            	float py =main_coordinates.nextFloat();
            	float width =main_coordinates.nextFloat();
            	float height =main_coordinates.nextFloat();
            	Rectangle objRect=new Rectangle(px,py,width,height);
            	System.out.println("Enter x, y for the coordinates you want to check: ");
            	Scanner new_coordinates = new Scanner(System.in);
            	float sx =new_coordinates.nextFloat();
            	float sy =new_coordinates.nextFloat();
            	if (objRect.contains(sx,sy)==true) {
            		System.out.println("IN");
			
            	}
            	else {
            		System.out.println("OUT");
            	}
            	noSelection = true;
            }
            if (userChoice == 'n') {
            	noSelection = false;
    
            }
            
            }
        System.out.println(Rectangle.number_of_rect);
        }
	
	}



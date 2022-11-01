package MainPackage;

import java.util.Scanner;
import basicElements.*;
import twoDimensionalShape.*;

public class MainClass {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
        boolean continueProgram = true;
        while(continueProgram == true) {
        	System.out.println("Do you want to calculate area? y/n");
       	 
            char userChoice = userInput.next().charAt(0);
 
            if (userChoice == 'y') {
            	Scanner userPointInput = new Scanner(System.in);
            	System.out.println("Give x and y for the point: ");
            	int x = userPointInput.nextInt();
            	int y = userPointInput.nextInt();
            	Point p=new Point(x,y);
            	Scanner userChoiceInput = new Scanner(System.in);
            	System.out.println("Choose a shape Rectangle(r) or Circle(c)? ");
            	char choice = userChoiceInput.next().charAt(0);
		
            	if (choice == 'r')	{	
            		Scanner userSizerInput = new Scanner(System.in);
            		System.out.println("Give width and height for the rectangle: ");
            		double width = userSizerInput.nextInt();
            		double height = userSizerInput.nextInt();
            		Rectangle objRect=new Rectangle(p,width,height);
            		System.out.println("Area of Rectangle:"+objRect.getArea());
            	}
            	if (choice == 'c') {
            		Scanner userSizecInput = new Scanner(System.in);
            		System.out.println("Give radius for the circle: ");
            		double radius = userSizecInput.nextInt();
            		Circle objCircle=new Circle(p,radius);
            		System.out.println("Area of Circle:"+objCircle.getArea());
            	}
            	continueProgram = true;
            }
            if (userChoice == 'n') {
            	continueProgram = false;            	
            }
        }
	}
}

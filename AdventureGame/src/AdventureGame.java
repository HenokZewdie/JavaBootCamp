import java.util.Scanner;

public class AdventureGame {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String roomName;
		System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");
		System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the \"kitchen\"?");
	
			roomName = input.nextLine();
			if (roomName =="kitchen"){
				System.out.println("There is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator. "
						+ "You may open the \"refrigerator\"or look in a \"cabinet\".");  
				
					roomName = input.nextLine();
					if (roomName == "refrigerator"){
						System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty. "
								+ "Would you like to eat some of the food? (\"yes\" or \"no\")");
						roomName = input.next();
						if(roomName == "no"){
							System.out.println("You die of starvation... eventually.");
						}else {System.out.println("SAY no!");}
					}
					else {System.out.println("Please choose refrigerator");}
			}
			
			else if(roomName =="Upstairs"){
				System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master \"bedroom\". "
						+ " There is also a \"bathroom\" off the hallway.  Where would you like to go?");
				
				roomName = input.nextLine();
				if(roomName == "bedroom"){
				System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  The bed is unmade. "
						+ " In the back of the room, the closet door is ajar.  Would you like to open the door? (\"yes\" or \"no\")");
			
				roomName = input.nextLine();
				if (roomName == "no"){
					System.out.println("Well, then I guess you'll never know what was in there.  "
							+ "Thanks for playing, I'm tired of making nested if statements.");
				}
				}
				else{System.out.println("Choose bedroom, something is in there");}
				
			}
			
			
				
			else{System.out.println("Wrong Input");}
	}

}

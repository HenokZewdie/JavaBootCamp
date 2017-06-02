import java.util.*;  

public class RoboResumeAssignment {

	public static void main(String[] args) throws Exception{

		String email,  name, educ = null, toExit = "exit";
		ArrayList<String> eduAchieve = new ArrayList<String>();
		ArrayList<String> experiance = new ArrayList<String>();
		ArrayList<String> skill = new ArrayList<String>();

		int countEduc = 0;
		int countExp = 0;
		int countSkill = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Name:   ");
		name = input.nextLine();
		System.out.println("Enter the email:   ");
		email = input.nextLine();
		System.out.println("Enter the Education and type \"exit\" to continue:   ");
		do{
			countExp +=1; //
			if (countExp !=10){ /*To restrict a max of 10 Educational Background*/

				educ = input.nextLine();
				eduAchieve.add(educ); /*store in the array list*/
			}
		}while (!(toExit.equalsIgnoreCase(educ)));

		System.out.println("Enter the Experiance and type \"exit\" to continue:   ");
		do{
			countEduc +=1;
			if (countEduc !=10){

				educ = input.nextLine();
				experiance.add(educ);
			}
		}while (!(toExit.equalsIgnoreCase(educ)));

		System.out.println("Enter the skills and type \"exit\" :   ");
		do{
			countSkill +=1;
			if (countSkill !=20){

				educ = input.nextLine();
				skill.add(educ);
			}
		}while (!(toExit.equalsIgnoreCase(educ)));

		System.out.println();
		System.out.println(name);
		System.out.println(email);
		System.out.println();

		System.out.println("Education");
		System.out.println();
		for (int i = 0; i < eduAchieve.size() - 1; i++) {
			System.out.println(eduAchieve.get(i));
		} 
		System.out.println();
		System.out.println("Experiance");
		System.out.println();
		for (int i = 0; i < experiance.size() - 1; i++) {/*-1 NOT to print the "exit"*/
			System.out.println(experiance.get(i));
		}
		System.out.println();
		System.out.println("Skill");
		System.out.println();
		for (int i = 0; i < skill.size() - 1; i++) {
			System.out.println(skill.get(i));
		}
		input.close();
	}
}

//import java.io.IOException;
//import java.util.Arrays;
import java.util.Scanner;

public class RoboResumeAssignment {

	public static void main(String[] args) throws Exception{
		
		String name, email;
		String eduAchieve[] = new String[10];
		String experiance[] = new String[10];
		String skill[] = new String[20];
		
		String answer = null;
		int count=0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Name:   ");
		name = input.nextLine();
		System.out.println("Enter the email:   ");
		email = input.nextLine();
				
		do{
			count +=1;
			if (count !=10){
			System.out.println("Enter the Education:   ");
			eduAchieve[count - 1] = input.nextLine();
			System.out.println("Do you want to continue:   ");
			answer = input.nextLine();
			}
		}while(answer.equalsIgnoreCase("Y"));
		
		do{
			count +=1;
			if (count !=10){
			System.out.println("Enter the Experiance:   ");
			experiance[count - 1] = input.nextLine();
			System.out.println("Do you want to continue:   ");
			answer = input.nextLine();
			}
		}while(answer.equalsIgnoreCase("Y"));
		
		do{
			count +=1;
			if (count !=10){
			System.out.println("Enter the Skills:   ");
			skill[count - 1] = input.nextLine();
			System.out.println("Do you want to continue:   ");
			answer = input.nextLine();
			}
		}while(answer.equalsIgnoreCase("Y"));
		
		System.out.println();
		System.out.println(name);
		System.out.println(email);
		System.out.println();
		
		System.out.println("Education");
		System.out.println();
	for(int i = 0; i< count; i++){
		System.out.println(eduAchieve[i]);
	}	
	
	}

}
/*Write a program that will allow a user to enter in:
- a name,
- an email address,
- anywhere from 1 to 10 educational achievements,
- anywhere from 0 to 10 work experiences,
- anywhere from 1 to 20 skills with rating*/
/*John J Jingleheimer-Schmidt
jjjschmidt@gmail.com

Education
BS in Psychology,
UMaryland, 2002

MS in Software Engineering,
Johns Hopkins U, 2005
Windows → Preferences → General → Text Editors → Show numberlines.
Experience
Software Developer II
Amtrak, June 2015 - Present
- Duty 1, Lorem ipsum
- Duty 2, Gaudeamos Igitur Iuvenes Dum Somos

Software Developer I
Amtrak, June 2014 - June 2015
- Duty 1, Lorem ipsum
- Duty 2, Gaudeamos Igitur Iuvenes Dum Somos

Business Analyst
DCPS, August 2005 - May 2014
- Duty 1, Lorem ipsum
- Duty 2, Gaudeamos Igitur Iuvenes Dum Somos

Skills
PHP, highly skilled
Ruby on Rails, proficient
Perl, familiar*/
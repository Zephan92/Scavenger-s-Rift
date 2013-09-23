import java.util.*;
public class Client
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		Menu menu;
		menu = new MainMenu();
		Save save = new Save();

		save.saveFile(save, 1);
		Save save1 = save.readFile(1);
		save1.setPlayerName("Player");
		save.saveFile(save1, 1);
		
		save.saveFile(save, 2);
		Save save2 = save.readFile(2);
		save2.setPlayerName("Player");
		save.saveFile(save2, 2);
		
		save.saveFile(save, 3);
		Save save3 = save.readFile(3);
		save3.setPlayerName("Player");
		save.saveFile(save3, 3);

		boolean done = false;
		boolean check = false;

		while (done != true)
		{
			System.out.print("Choose your character: ");
			String answer = scan.next();
			if (answer.equals(save1.getPlayerName()) || answer.equals("1"))
			{
				save = save1;
				save.setPlayerNumber(1);
				check = true;
			}
			else if (answer.equals(save2.getPlayerName()) || answer.equals("2"))
			{
				save = save2;
				save.setPlayerNumber(2);
				check = true;
			}
			else if (answer.equals(save3.getPlayerName()) || answer.equals("3"))
			{
				save = save3;
				save.setPlayerNumber(3);
				check = true;
			}
			if (check == true)
			{
				System.out.print("Is " + save.getPlayerName() + " the correct character? Yes or No: ");
				answer = scan.next();	
				answer = answer.toUpperCase();
				answer = answer.substring(0,1);
				if (answer.equals("Y"))
					done = true;
			}
			
		} 
		done = false;

		while (done != true)
		{
			System.out.print("Choose your character name: ");
			save.setPlayerName(scan.next());
			System.out.print("Is " + save.getPlayerName() + " the correct character? Yes or No: ");
			String answer = scan.next();	
			answer = answer.toUpperCase();
			answer = answer.substring(0,1);
			if (answer.equals("Y"))
				done = true;
		}
		save.saveFile(save, save.getPlayerNumber());
		System.out.println(save);
		menu.displayInterface(save.getPlayerNumber());
	}
}
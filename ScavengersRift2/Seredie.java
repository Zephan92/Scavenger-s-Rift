import java.util.Random;
import java.io.*;
public class Seredie
{
	private GeneralMethods gm = new GeneralMethods();//////////////////////////////////////////////////////// Access to the general methods
	private InGameMenu menu = new InGameMenu();////////////////////////////////////////////////////////////// Access to the in game menu
	private int introductionCount_Scavenge;
	int scavengeDistance;
	int backTrack;
	int pathsLeft;
	int backTracksLeft;
	int reward;
	int tubewood;
	String rewardDisplay;
	Random random = new Random();
	final int ARRAY_SIZE = 10;
	String [] path = new String [ARRAY_SIZE];
	private String menuAnswer;/////////////////////////////////////////////////////////////////////////////// Menu answer placeholder
	private boolean done;//////////////////////////////////////////////////////////////////////////////////// For use in loops
	private String seredieHeader;
	private String seredieOptions;
	private String serediePrompt;
	private String seredieDisplay;
	private String scavengePath;
	private String scavengePath1;
	public Seredie() throws IOException
	{
		seredieHeader = ////////////////////////////////////////////////////////////////////////////////////// Main header
		"\n\n\n      ____________________________________________________________________      " + 
			"     |     __________________________________________________________     |     " +
			"     |    |------------------||                  ||------------------|    |     " +
			"     |    |------------------|| SEREDIE'S PLAINE ||------------------|    |     " +
			"     |    |------------------||__________________||------------------|    |     " +
			"     \\____________________________________________________________________/     \n\n";

		seredieOptions = ///////////////////////////////////////////////////////////////////////////////////// 
			"                ________________________________________________                " +
			"               |    __________________      __________________  |               " +
			"               | 1.|                  |  2.|                  | |               " +
			"               |   |  PALMA VILLAGE   |    | TUBEWOOD FOREST  | |               " +
			"               |   |__________________|    |__________________| |               " +
			"               |    __________________      __________________  |               " +
			"               | 3.|                  |  4.|                  | |               " +
			"               |   | SHACKLE OUTCROP  |    | FLEXROCK QUARRY  | |               " +
			"               |   |__________________|    |__________________| |               " +
			"               |    __________________      __________________  |               " +
			"               | 5.|                  |  6.|                  | |               " +
			"               |   |    MINIGAME 1    |    |       BACK       | |               " +
			"               |   |__________________|    |__________________| |               " +
			"               |________________________________________________|               \n";
		serediePrompt = "Where would you like to explore? ";//////////////////////////////////////////////////////// Main prompt
		seredieDisplay = seredieHeader + seredieOptions + serediePrompt;///////////////////////////////////// Main menu/ title screen
		introductionCount_Scavenge = 0;
	}



	public void changeSeredieOptions_Explore()
	{
		seredieHeader = ////////////////////////////////////////////////////////////////////////////////////// Main header
		"\n\n\n      ____________________________________________________________________      " + 
			"     |     __________________________________________________________     |     " +
			"     |    |------------------||                  ||------------------|    |     " +
			"     |    |------------------|| SEREDIE'S PLAINE ||------------------|    |     " +
			"     |    |------------------||__________________||------------------|    |     " +
			"     \\____________________________________________________________________/     \n\n";
		seredieOptions = ///////////////////////////////////////////////////////////////////////////////////// 
			"                ________________________________________________                " +
			"               |    __________________      __________________  |               " +
			"               | 1.|                  |  2.|                  | |               " +
			"               |   |  PALMA VILLAGE   |    | TUBEWOOD FOREST  | |               " +
			"               |   |__________________|    |__________________| |               " +
			"               |    __________________      __________________  |               " +
			"               | 3.|                  |  4.|                  | |               " +
			"               |   | SHACKLE OUTCROP  |    | FLEXROCK QUARRY  | |               " +
			"               |   |__________________|    |__________________| |               " +
			"               |    __________________      __________________  |               " +
			"               | 5.|                  |  6.|                  | |               " +
			"               |   |    MINIGAME 1    |    |       BACK       | |               " +
			"               |   |__________________|    |__________________| |               " +
			"               |________________________________________________|               \n";
		serediePrompt = "Where would you like to explore? ";//////////////////////////////////////////////////////// Main prompt
	}



	public void changeSeredieOptions_TubewoodForest()
	{
		seredieHeader = ////////////////////////////////////////////////////////////////////////////////////// Main header
		"\n\n\n      ____________________________________________________________________      " + 
			"     |     __________________________________________________________     |     " +
			"     |    |------------------||                  ||------------------|    |     " +
			"     |    |------------------|| TUBEWOOD FOREST  ||------------------|    |     " +
			"     |    |------------------||__________________||------------------|    |     " +
			"     \\____________________________________________________________________/     \n\n";

		seredieOptions = ///////////////////////////////////////////////////////////////////////////////////// 
			"                ________________________________________________                " +
			"               |    __________________      __________________  |               " +
			"               | 1.|                  |  2.|                  | |               " +
			"               |   |     SCAVENGE     |    |      GATHER      | |               " +
			"               |   |__________________|    |__________________| |               " +
			"               |    __________________      __________________  |               " +
			"               | 3.|                  |  4.|                  | |               " +
			"               |   |      WANDER      |    |       MENU       | |               " +
			"               |   |__________________|    |__________________| |               " +
			"               |________________________________________________|               \n\n\n";
		serediePrompt = "What would you like to do? ";//////////////////////////////////////////////////////// Main prompt
	}


	public void changeSeredieOptions_Scavenge()
	{
		seredieHeader = ////////////////////////////////////////////////////////////////////////////////////// Main header
		"\n\n\n      ____________________________________________________________________      " + 
			"     |     __________________________________________________________     |     " +
			"     |    |------------------||     SCAVENGE     ||------------------|    |     " +
			"     |    |------------------|| TUBEWOOD FOREST  ||------------------|    |     " +
			"     |    |------------------||__________________||------------------|    |     " +
			"     \\____________________________________________________________________/     \n\n";

		seredieOptions = ///////////////////////////////////////////////////////////////////////////////////// 
			"                ________________________________________________                " +
			"               |    __________________________________________  |               " +
			"               | 1.|                                          | |               " +
			"               |   |             START SCAVENGING             | |               " +
			"               |   |__________________________________________| |               " +
			"               |              ____________________              |               " +
			"               |           2.|                    |             |               " +
			"               |             |        BACK        |             |               " +
			"               |             |____________________|             |               " +
			"               |________________________________________________|               \n\n\n";
		serediePrompt = "What would you like to do? ";//////////////////////////////////////////////////////// Main prompt
	}


	public String getSeredieDisplay()////////////////////////////////////////////////////////////////// This method displays the menu
	{//////////////////////////////////////////////////////////////////////////////////////////////////////// 
		seredieDisplay = seredieHeader + seredieOptions + serediePrompt;/////////////////////////
		return seredieDisplay;///////////////////////////////////////////////////////////////////////// 
	}//////////////////////////////////////////////////////////////////////////////////////////////////////// getTheColonyMenuDisplay() End.




	public String printSeredieMenu()/////////////////////////////////////////////////////////////////////// This method displays the full Main Menu
	{////////////////////////////////////////////////////////////////////////////////////////////////////////
		String display = getSeredieDisplay();////////////////////////////////////////////////////////// 
		System.out.print(display);/////////////////////////////////////////////////////////////////////////// 
		menuAnswer = gm.promptUser();//////////////////////////////////////////////////////////////////////// 
		return menuAnswer;/////////////////////////////////////////////////////////////////////////////////// 
	}//////////////////////////////////////////////////////////////////////////////////////////////////////// printTheColonyMenu() End.

	public void goTo_Seredie() throws IOException
	{
		do
		{//////////////////////////////////////////////////////////////////////////////////////////////////// Start of do while loop
			done = false;
			menu.setMenuAreaName(" SEREDIE'S PLAINE ");
			changeSeredieOptions_Explore();
			menuAnswer = printSeredieMenu();
			switch (menuAnswer)
			{//////////////////////////////////////////////////////////////////////////////////////////////// 
			case "1"://////////////////////////////////////////////////////////////////////////////////////// case "1": go to Palma Village
				break;/////////////////////////////////////////////////////////////////////////////////////// End of case "1": Palma Village


			case "2"://////////////////////////////////////////////////////////////////////////////////////// case "2": go to Tubewood Forest
				goTo_TubewoodForest();
				break;/////////////////////////////////////////////////////////////////////////////////////// End of case "2": Tubewood Forest


			case "3"://////////////////////////////////////////////////////////////////////////////////////// case "3": go to Shackle Outcrop
				break;/////////////////////////////////////////////////////////////////////////////////////// End of case "3": Shackle Outcrop
 

			case "4"://////////////////////////////////////////////////////////////////////////////////////// case "4": go to Flexrock Quarry
				break;/////////////////////////////////////////////////////////////////////////////////////// End of case "4": Flexrock Quarry


			case "5"://////////////////////////////////////////////////////////////////////////////////////// case "5": go to Minigame 1
				break;/////////////////////////////////////////////////////////////////////////////////////// End of case "5": Minigame 1


			case "M"://////////////////////////////////////////////////////////////////////////////////////// case "M": go to Menu
			case "6":////////////////////////////////////////////////////////////////////////////////////////
				menu.goTo_inGameMenu();//////////////////////////////////////////////////////////////////////
				break;/////////////////////////////////////////////////////////////////////////////////////// End of case "M": Menu


			default:///////////////////////////////////////////////////////////////////////////////////////// Default case, reloops any invalid answers
				break;///////////////////////////////////////////////////////////////////////////////////////


			}//////////////////////////////////////////////////////////////////////////////////////////////// End of switch/case
		}//////////////////////////////////////////////////////////////////////////////////////////////////// End of do while Loop
		while (done != true);////////////////////////////////////////////////////////////////////////////////
	}

	public void goTo_TubewoodForest() throws IOException
	{
		do
		{//////////////////////////////////////////////////////////////////////////////////////////////////// Start of do while loop
			changeSeredieOptions_TubewoodForest();
			menuAnswer = printSeredieMenu();
			switch (menuAnswer)
			{
			case "1":
				scavenge_TubewoodForest();
				break;


			case "2":
				break;


			case "3":
				wander_TubewoodForest();
				break;


			case "4":
			case "M":
				menu.goTo_inGameMenu();//////////////////////////////////////////////////////////////////////
				break;


			default:
				break;
			
			}
		}//////////////////////////////////////////////////////////////////////////////////////////////////// End of do while Loop
		while (done != true);////////////////////////////////////////////////////////////////////////////////
	}

	public void scavenge_TubewoodForest() throws IOException
	{
		do
		{//////////////////////////////////////////////////////////////////////////////////////////////////// Start of do while loop
			StoryLines story = new StoryLines();
			if (introductionCount_Scavenge == 0)
			{
				story.introduction_Scavenge();
				introductionCount_Scavenge = 1;
			}
			changeSeredieOptions_Scavenge();
			menuAnswer = printSeredieMenu();
			switch (menuAnswer)
			{
			case "1":
				scavengeDistance = 0;
				backTrack = 2;
				int offset;
				int offset2;
				int i;
				path[0] = "  VERY DARK PATH  ";
				path[1] = "    DARK PATH     ";
				path[2] = "    SHADOW PATH   ";
				path[3] = "    FOGGY PATH    ";
				path[4] = "   CROOKED PATH   ";
				path[5] = "    ROCKY PATH    ";
				path[6] = "    LONG PATH     ";
				path[7] = "    SHORT PATH    ";
				path[8] = "    LIGHT PATH    ";
				path[9] = "    CLEAR PATH    ";	
				for (i = 0;i < 10; i++)
				{
					scavengePath = path[random.nextInt(10)];
					scavengePath1 = path[random.nextInt(10)];
					pathsLeft = 10 - i;
					backTracksLeft = backTrack;
					scavenge_Option();
					menuAnswer = printSeredieMenu();
					System.out.println("");
					switch (menuAnswer)
					{
					case "1":
					case "2":
						if (menuAnswer.equals("2"))
							scavengePath = scavengePath1;
						boolean progress = pathOdds();
						if (progress == false)
						{
							scavengeDistance = scavengeDistance - 1;
							if (scavengeDistance < 0)
							{
								System.out.println("You got so lost, you ended up at the beginning.");
								Scavenge_Reward();
							}
						}
						else
							scavengeDistance++;
						break;

					case "3":
						backTrack--;
						if (backTrack < 0)
						{
							System.out.println("You wasted time looking for more paths and went farther back.");
							scavengeDistance = scavengeDistance - 1;
							if (scavengeDistance < 0)
							{
								System.out.println("You got lost looking for paths and ended up at the beginning.");
								Scavenge_Reward();
							}
						}
						else
							System.out.println("You looked around for more paths");
						
						break;

					case "4":
						goTo_TubewoodForest();
						break;

					default:
						System.out.println("You got a little lost looking for paths.");
						scavengeDistance = scavengeDistance - 1;
						System.out.println("You have taken " + scavengeDistance + " successful path into the forest.");
					}
				}
				Scavenge_Reward();
				break;


			case "2":
			case "B":
				goTo_TubewoodForest();//////////////////////////////////////////////////////////////////////
				break;


			default:
				break;
			
			}
		}//////////////////////////////////////////////////////////////////////////////////////////////////// End of do while Loop
		while (done != true);////////////////////////////////////////////////////////////////////////////////
	}



	public void scavenge_Option()
	{
		seredieHeader = ////////////////////////////////////////////////////////////////////////////////////// Main header
		  "\n      ____________________________________________________________________      " + 
			"     |     __________________________________________________________     |     " +
			"     |    |------------------||     SCAVENGE     ||------------------|    |     " +
			"     |    |------------------|| TUBEWOOD FOREST  ||------------------|    |     " +
			"     |    |------------------||__________________||------------------|    |     " +
		   "     \\____________________________________________________________________/     " +
			"      |  BACKTRACKS LEFT: "+backTracksLeft+"  ||  PROGRESS: "+scavengeDistance+"     ||  PATHS LEFT: "+pathsLeft+"       |     \n" +
		  "      |______________________||__________________||______________________|      ";
		
		seredieOptions = ///////////////////////////////////////////////////////////////////////////////////// 
			"                ________________________________________________                " +
			"               |    __________________      __________________  |               " +
			"               | 1.|                  |  2.|                  | |               " +
			"               |   |" + scavengePath + "|    |" + scavengePath1 + "| |               " +
			"               |   |__________________|    |__________________| |               " +
			"               |    __________________      __________________  |               " +
			"               | 3.|                  |  4.|                  | |               " +
			"               |   |    BACK TRACK    |    |      LEAVE       | |               " +
			"               |   |__________________|    |__________________| |               " +
			"               |________________________________________________|               \n\n";
		serediePrompt = "What would you like to do? ";//////////////////////////////////////////////////////// Main prompt
	}



	public void wander_Option()
	{
		seredieHeader = ////////////////////////////////////////////////////////////////////////////////////// Main header
		"\n\n\n      ____________________________________________________________________      " + 
			"     |     __________________________________________________________     |     " +
			"     |    |------------------||      WANDER      ||------------------|    |     " +
			"     |    |------------------|| TUBEWOOD FOREST  ||------------------|    |     " +
			"     |    |------------------||__________________||------------------|    |     " +
			"     \\____________________________________________________________________/     \n\n";

		seredieOptions = ///////////////////////////////////////////////////////////////////////////////////// 
			"                ________________________________________________                " +
			"               |    __________________      __________________  |               " +
			"               | 1.|                  |  2.|                  | |               " +
			"               |   |   MARSHY WOODS   |    |   DENSE GROVE    | |               " +
			"               |   |__________________|    |__________________| |               " +
			"               |    __________________      __________________  |               " +
			"               | 3.|                  |  4.|                  | |               " +
			"               |   |  TANGLED VINES   |    |       BACK       | |               " +
			"               |   |__________________|    |__________________| |               " +
			"               |________________________________________________|               \n\n\n";
		serediePrompt = "What would you like to do? ";//////////////////////////////////////////////////////// Main prompt
	}



	public void wander_Options2()
	{
		seredieHeader = ////////////////////////////////////////////////////////////////////////////////////// Main header
		"\n\n\n      ____________________________________________________________________      " + 
			"     |     __________________________________________________________     |     " +
			"     |    |------------------||      WANDER      ||------------------|    |     " +
			"     |    |------------------|| TUBEWOOD FOREST  ||------------------|    |     " +
			"     |    |------------------||__________________||------------------|    |     " +
			"     \\____________________________________________________________________/     \n\n";

		seredieOptions = ///////////////////////////////////////////////////////////////////////////////////// 
			"                ________________________________________________                " +
			"               |    __________________      __________________  |               " +
			"               | 1.|                  |  2.|                  | |               " +
			"               |   | CHECK FOR PATHS  |    |   SEARCH AREA    | |               " +
			"               |   |__________________|    |__________________| |               " +
			"               |    __________________      __________________  |               " +
			"               | 3.|                  |  4.|                  | |               " +
			"               |   |     MOVE ON      |    |       BACK       | |               " +
			"               |   |__________________|    |__________________| |               " +
			"               |________________________________________________|               \n\n\n";
		serediePrompt = "What would you like to do? ";//////////////////////////////////////////////////////// Main prompt
	}



	public void wander_End()
	{
		seredieHeader = ////////////////////////////////////////////////////////////////////////////////////// Main header
		  "\n      ____________________________________________________________________      " + 
			"     |     __________________________________________________________     |     " +
			"     |    |------------------||      WANDER      ||------------------|    |     " +
			"     |    |------------------|| TUBEWOOD FOREST  ||------------------|    |     " +
			"     |    |------------------||__________________||------------------|    |     " +
		   "     \\____________________________________________________________________/     ";
		
		seredieOptions = ///////////////////////////////////////////////////////////////////////////////////// 
			"                ________________________________________________                " +
			"               |    __________________________________________  |               " +
			"               |   | YOU GOT SO LOST YOU ENDED UP AT THE START| |               " +
		    "               |   |      YOU DIDN'T FIND ANY TUBEWOOD        | |               " +
			"               |   |__________________________________________| |               " +
			"               |    __________________      __________________  |               " +
			"               | 1.|                  |  2.|                  | |               " +
			"               |   |   WANDER AGAIN   |    |      LEAVE       | |               " +
			"               |   |__________________|    |__________________| |               " +
			"               |________________________________________________|               \n\n";
		serediePrompt = "What would you like to do? ";//////////////////////////////////////////////////////// Main prompt
	}


	public void scavenge_End()
	{
		seredieHeader = ////////////////////////////////////////////////////////////////////////////////////// Main header
		  "\n      ____________________________________________________________________      " + 
			"     |     __________________________________________________________     |     " +
			"     |    |------------------||     SCAVENGE     ||------------------|    |     " +
			"     |    |------------------|| TUBEWOOD FOREST  ||------------------|    |     " +
			"     |    |------------------||__________________||------------------|    |     " +
		   "     \\____________________________________________________________________/     " +
			"      |  BACKTRACKS LEFT: "+backTracksLeft+"  ||  PROGRESS: "+scavengeDistance+"     ||  PATHS LEFT: 0       |      " +
			"      |______________________||__________________||______________________|      ";
		
		seredieOptions = ///////////////////////////////////////////////////////////////////////////////////// 
			"                ________________________________________________                " +
			"               |    __________________________________________  |               " +
			"               |   | YOU SUCCESSFULLY MADE IT THROUGH "+scavengeDistance+" PATHS | |              \n" +
		    "               |   | YOU FOUND "+rewardDisplay+" TUBEWOOD IN THE CLEARING | |               " +
			"               |   |__________________________________________| |               " +
			"               |    __________________      __________________  |               " +
			"               | 1.|                  |  2.|                  | |               " +
			"               |   |  SCAVENGE AGAIN  |    |      LEAVE       | |               " +
			"               |   |__________________|    |__________________| |               " +
			"               |________________________________________________|               \n\n";
		serediePrompt = "What would you like to do? ";//////////////////////////////////////////////////////// Main prompt
	}


	public void scavenge_Lost()
	{
		seredieHeader = ////////////////////////////////////////////////////////////////////////////////////// Main header
		  "\n      ____________________________________________________________________      " + 
			"     |     __________________________________________________________     |     " +
			"     |    |------------------||     SCAVENGE     ||------------------|    |     " +
			"     |    |------------------|| TUBEWOOD FOREST  ||------------------|    |     " +
			"     |    |------------------||__________________||------------------|    |     " +
		   "     \\____________________________________________________________________/     " +
			"      |  BACKTRACKS LEFT: 0  ||  PROGRESS: 0     ||  PATHS LEFT: 0       |      " +
			"      |______________________||__________________||______________________|      ";
		
		seredieOptions = ///////////////////////////////////////////////////////////////////////////////////// 
			"                ________________________________________________                " +
			"               |    __________________________________________  |               " +
			"               |   | YOU GOT SO LOST YOU ENDED UP AT THE START| |               " +
		    "               |   |      YOU DIDN'T FIND ANY TUBEWOOD        | |               " +
			"               |   |__________________________________________| |               " +
			"               |    __________________      __________________  |               " +
			"               | 1.|                  |  2.|                  | |               " +
			"               |   |  SCAVENGE AGAIN  |    |      LEAVE       | |               " +
			"               |   |__________________|    |__________________| |               " +
			"               |________________________________________________|               \n\n";
		serediePrompt = "What would you like to do? ";//////////////////////////////////////////////////////// Main prompt
	}

	public void Scavenge_Reward() throws IOException
	{
		reward = 0;
		if (scavengeDistance == 10)
		{
			reward = random.nextInt(75) + 1;
			reward += 25;
			reward *= 150;
		}
		else if (scavengeDistance == 9)
		{
			reward = random.nextInt(75) + 1;
			reward += 25;
			reward *= 120;
		}
		else if (scavengeDistance == 8)
		{
			reward = random.nextInt(75) + 1;
			reward += 25;
			reward *= 80;
		}
		else if (scavengeDistance == 7)
		{
			reward = random.nextInt(75) + 1;
			reward += 25;
			reward *= 60;
		}
		else if (scavengeDistance == 6)
		{
			reward = random.nextInt(75) + 1;
			reward += 25;
			reward *= 45;
		}
		else if (scavengeDistance == 5)
		{
			reward = random.nextInt(90) + 1;
			reward += 10;
			reward *= 35;
		}
		else if (scavengeDistance == 4)
		{
			reward = random.nextInt(90) + 1;
			reward += 10;
			reward *= 25;
		}
		else if (scavengeDistance == 3)
		{
			reward = random.nextInt(90) + 1;
			reward += 10;
			reward *= 20;
		}
		else if (scavengeDistance == 2)
		{
			reward = random.nextInt(90) + 1;
			reward += 10;
			reward *= 15;
		}
		else if (scavengeDistance == 1)
		{
			reward = random.nextInt(100);
			reward += 1;
			reward *= 10;
		}
		if (reward < 10000)
		{
			if (reward <1000)
			{
				if (reward <100)
				{
					if (reward <10)
					{
						rewardDisplay = "  " + reward + "  ";
					}
					else
						rewardDisplay = " " + reward + "  ";
				}
				else
					rewardDisplay = " " + reward + " ";
			}
			else
				rewardDisplay = " " + reward;
		}
		else
			rewardDisplay = "" + reward;
		if (scavengeDistance < 0 )
		{
			reward += 0;
			scavenge_Lost();
		}
		else
			scavenge_End();
		do
		{
			menuAnswer = printSeredieMenu();
			switch (menuAnswer)
			{
			case "1":
			case "S":
				tubewood += reward;
				scavenge_TubewoodForest();
				break;


			case "2":
			case "L":
				tubewood += reward;
				System.out.println("You now have " + tubewood + " tubewood.");
				goTo_TubewoodForest();
				break;


			default:
				break;		
			}
		}
		while (done != true);
	}


	public boolean pathOdds()
	{
		if (scavengePath.equals(path[0]))
		{
			System.out.println("You head down the very dark path.");
			System.out.println("You got lost along the way and ended up right where you started.");
			return false;
		}
		else if (scavengePath.equals(path[1]))
		{
			System.out.println("You head down the dark path.");
			int odds = random.nextInt(100);
			if (odds < 5)
			{
				if (odds > 3)
					System.out.println("You almost gave up after getting lost, but you made it.");
				else
					System.out.println("It wasn't easy, but you found your way.");
				return true;
			}
			else
				System.out.println("You got lost along the way and ended up right where you started.");
				return false;	
		}
		else if (scavengePath.equals(path[2]))
		{
			System.out.println("You head down the shadow path.");
			int odds = random.nextInt(100);
			if (odds < 20)
			{
				if (odds > 10)
					System.out.println("You made it, but just barely.");
				else
					System.out.println("You struggled down the path, but you made it.");
				return true;
			}
			else
				System.out.println("You got lost along the way and ended up right where you started.");
				return false;	
		}
		else if (scavengePath.equals(path[3]))
		{
			System.out.println("You head down the foggy path.");
			int odds = random.nextInt(100);
			if (odds < 40)
			{
				if (odds > 30)
					System.out.println("You made it, but just barely.");
				else
					System.out.println("You struggled down the path, but you made it.");
				return true;
			}
			else
				System.out.println("You got lost along the way and ended up right where you started.");
				return false;	
		}
		else if (scavengePath.equals(path[4]))
		{
			System.out.println("You head down the crooked path.");
			int odds = random.nextInt(100);
			if (odds < 45)
			{
				if (odds > 35)
					System.out.println("You made it, but you mentally exhausted.");
				else
					System.out.println("You made it through, the path was confusing though.");
				return true;
			}
			else
				System.out.println("You got lost along the way and ended up right where you started.");

				return false;	
		}
		else if (scavengePath.equals(path[5]))
		{
			System.out.println("You head down the rocky path.");
			int odds = random.nextInt(100);
			if (odds < 55)
			{
				if (odds > 45)
					System.out.println("You made it through, the rocks were tough though.");
				else
					System.out.println("You made it to the end, but not without some bruises.");
				return true;
			}
			else
				System.out.println("You got lost along the way and ended up right where you started.");
				return false;	
		}
		else if (scavengePath.equals(path[6]))
		{
			System.out.println("You head down the long path.");
			int odds = random.nextInt(100);
			if (odds < 65)
			{
				if (odds > 55)
					System.out.println("You made it, but it was long and windy.");
				else
					System.out.println("You made it all the way down, no issues.");
				odds = random.nextInt(100);
				if (odds < 1)
					System.out.print("You found Minigame1! You can head over anytime now!");
				return true;
			}
			else
				System.out.println("You got lost along the way and ended up right where you started.");
				return false;	
		}
		else if (scavengePath.equals(path[7]))
		{
			System.out.println("You head down the short path.");
			int odds = random.nextInt(100);
			if (odds < 80)
			{
				if (odds > 70)
					System.out.println("You followed the path.");
				else
					System.out.println("The path was easy to follow.");
				odds = random.nextInt(100);
				if (odds < 2)
					System.out.print("You found Minigame1! You can head over anytime now!");
				return true;
			}
			else
				System.out.println("You got lost along the way and ended up right where you started.");
				return false;	
		}
		else if (scavengePath.equals(path[8]))
		{
			System.out.println("You head down the light path.");
			int odds = random.nextInt(100);
			if (odds < 95)
			{
				if (odds > 85)
					System.out.println("You walked down the path.");
				else
					System.out.println("You made it down the path just fine.");
				odds = random.nextInt(100);
				if (odds < 3)
					System.out.print("You found Minigame1! You can head over anytime now!");
				return true;
			}
			else
				System.out.println("You almost made it, but you got lost along the way and ended up right where you started.");
				return false;	
		}
		else if (scavengePath.equals(path[9]))
		{
			System.out.println("You head down the clear path.");
			System.out.println("You made it to the end without a problem.");
			int odds = random.nextInt(100);
			if (odds < 5)
				System.out.print("You found Minigame1! You can head over anytime now!");
			return true;
		}
			return false;
	}



	public void wander_TubewoodForest() throws IOException
	{
		do
		{
			wander_Option();
			menuAnswer = printSeredieMenu();
			switch (menuAnswer)
			{
			case "1":
				break;


			case "2":
				break;


			case "3":
				break;


			case "4":
			case "L":
				goTo_TubewoodForest();
				break;


			default:
				break;
			
			}
		}
		while (done != true);
	}

}
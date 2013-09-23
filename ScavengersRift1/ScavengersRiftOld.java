import java.util.Scanner;
import java.text.DecimalFormat;
class ScavengersRiftOld 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		DecimalFormat progressCheck = new DecimalFormat("#0.0%");
		boolean done = false;
		String garbage = "\0";
		String menuAnswer = "\0";
		String worldName = "--------------<THE COLONY>--------------";
		String worldTitle = "THE COLONY";
		String worldIntro = "The Colony";
		String exploreName = "THE MENU";		
		String playerName = "\0";

		String option1 = "\n\t1. - " + "\0";
		String option2 = "\n\t2. - " + "\0";
		String option3 = "\n\t3. - " + "\0";
		String option4 = "\n\t4. - " + "\0";
		String option5 = "\n\t5. - " + "\0";
		String option6 = "\n\t6. - " + "\0";
		String option7 = "\n\t7. - " + "\0";
		String option8 = "\n\t8. - " + "\0";
		String option9 = "\n\t9. - " + "\0";
		String option10= "\n\t10. - "+ "\0";

		boolean world2 = false;				//places
		boolean world3 = false;
		boolean world4 = false;
		boolean world5 = false;
		boolean world6 = false;
		boolean market = false;
		boolean researchLab = false;
		boolean workshop = false;
		boolean flexrockQuarry = false;
		boolean shackleOutcrop = false;
		boolean meetNelma = false;
		boolean meetTeeklar = false;
		boolean meetShareebla = false;
		boolean minigame1 = false;

		int itemListNumber = 0;
		int toolListNumber = 0;
		int resourceListNumber = 0;
		String itemList = "\0";
		String toolList = "\0";
		String resourceList = "\0";

		boolean wateringCan = false;		//tools
		boolean axe = false;


											//resources

											//items


		int scavengersRiftEvent = 0;		//events	//0 so far
		int exploreEvent = 0;							//1 so far
		int inventoryEvent = 0;							//1 so far
		int travelEvent = 0;							//1 so far
		int colonyEvent = 0;							//2 so far
		int houseEvent = 0;								//1 so far
		int houseSleepEvent = 0;						//1 so far
		int houseChangeEvent = 0;						//1 so far
		int houseProgressEvent = 0;						//1 so far
		int marketEvent = 0;							//0 so far
		int researchLabEvent = 0;						//0 so far
		int workshopEvent = 0;							//0 so far
		int seredieEvent = 0;							//2 so far
		int palmaVillageEvent = 0;						//doesn't affect storyCount

		boolean tishroarsQuest = false;		//quests
		
		

		int noCount = 0;					//Number of "no"'s when you start the game

		int progressCount = 0;				//player overall progress
		int storyCount = 0;					//player storyline progress
		int researchCount = 0;				//player reseach progress
		int upgradeCount = 0;				//player upgrade progress
		int itemCount = 0;					//player item progress
		int taskCount = 0;					//player task progress		
		final int STORYCOUNTMAX = 11;		//max Storylines in the game
		final int RESEARCHCOUNTMAX = 0;		//max Research in the game
		final int UPGRADECOUNTMAX = 0;		//max upgrades in the game
		final int ITEMCOUNTMAX = 0;			//max items in the game
		final int TASKCOUNTMAX = 0;			//max tasks in the game
		final int PROGRESSCOUNTMAX = STORYCOUNTMAX + RESEARCHCOUNTMAX + UPGRADECOUNTMAX + ITEMCOUNTMAX + TASKCOUNTMAX;     //max overall progress
		double progress = 0.0;				//Progess percentage
		double story = 0.0;					//Progess percentage
		double research = 0.0;				//Progess percentage
		double upgrade = 0.0;				//Progess percentage
		double item = 0.0;					//Progess percentage
		double task = 0.0;					//Progess percentage
		
		

		do
		{
			done = false;
			menuAnswer = "\0";
			System.out.println("-----(-_-)-<SCAVENGER'S RIFT>-(-_-)-----\n" 
				+ "\n\t1. - NEW GAME" 
				+ "\n\t2. - CONTINUE GAME" 
				+ "\n\t3. - QUIT\n");
			System.out.print("Please enter a menu item: ");
			menuAnswer = scan.next();
			menuAnswer = menuAnswer.toUpperCase();
			menuAnswer = menuAnswer.substring(0,1);
			//System.out.println("\nYou answered: " + menuAnswer);
			System.out.print("\n");

			switch (menuAnswer)
			{
			case "C": 																									//NEW GAME/CONTINUE GAME
			case "2":
			case "N":
			case "1":
			case "~":
				if (menuAnswer.equals("~"))															//100.0% Complete Game (Not on the menu)
				{
					playerName = "Developer";
					storyCount = STORYCOUNTMAX;
					researchCount = RESEARCHCOUNTMAX;
					upgradeCount = UPGRADECOUNTMAX;
					itemCount = ITEMCOUNTMAX;
					taskCount = TASKCOUNTMAX;
					scavengersRiftEvent = 100;
					inventoryEvent = 100;
					exploreEvent = 100;
					travelEvent = 100;
					colonyEvent = 100;
					houseEvent = 100;
					houseSleepEvent = 100;
					houseChangeEvent = 100;
					houseProgressEvent = 100;
					marketEvent = 100;
					researchLabEvent = 100;
					seredieEvent = 100;
					palmaVillageEvent = 0;
					market = true;
					researchLab = true;
					workshop = true;
					flexrockQuarry = true;
					shackleOutcrop = true;
					minigame1 = true;
					world2 = true;
					world3 = true;
				}
				/*if (menuAnswer.equals("C"))															//Continue Game (doesn't have save files yet)
				{
					scavengersRiftEvent++;
					inventoryEvent++;
					exploreEvent++;
					travelEvent++;
					colonyEvent++;
					houseEvent++;
					houseSleepEvent++;
					houseChangeEvent++;
					houseProgressEvent++;
					marketEvent++;
					researchLabEvent++;
					seredieEvent++;
				}
				if (menuAnswer.equals("2"))															//Continue Game (doesn't have save files yet)
				{
					scavengersRiftEvent++;
					inventoryEvent++;
					exploreEvent++;
					travelEvent++;
					colonyEvent++;
					houseEvent++;
					houseSleepEvent++;
					houseChangeEvent++;
					houseProgressEvent++;
					marketEvent++;
					researchLabEvent++;
					seredieEvent++;
				}*/

				if (menuAnswer == "N" || menuAnswer == "1" || scavengersRiftEvent == 0)									//Welcome to Scavenger's Rift				
				{
					String answer = "\0";
					System.out.println("\nWelcome to Scavenger's Rift!\n\n\n");
					System.out.print("RORY: This must be your first time here!" 
						+ "\nRORY: My name is Rory, nice to meet you!"
						+ "\nRORY: This world you just arrived on is new and exciting."
						+ "\nRORY: I come from a very social and very advanced species."
						+ "\nRORY: You might call me an alien! Anyway, on my planet we create vast cities."
						+ "\nRORY: I miss Morlamast very much, so much so, I decided to build"
						+ "\nRORY: a colony here on Scavenger's Rift!"
						+ "\nRORY: Please join me on this endeavor, I would very much appreciate the company.\n"
						+ "\nRORY: So what do you say? Are you in? ");
						do
						{
							done = false;
							answer = scan.next();
							answer = answer.toUpperCase();
							answer = answer.substring(0,1);
							System.out.print("\n");
							if (answer.equals("Y"))
							{
								done = true;
							}
							else
							{
								if (noCount == 0)
									System.out.print("RORY: Why not? It shall be fun! What do you say? ");
								if (noCount > 0 && noCount <= 2)
									System.out.print("RORY: I can do this on my own, but it sure would"
										+ "\nRORY: be great to have you. So, how about it? ");
								if (noCount > 2 && noCount <= 4)
									System.out.print("RORY: I won't take no for an answer!"
										+ "\nRORY: Will you join me? ");
								if (noCount > 4 && noCount <= 9)
									System.out.print("RORY: Oh my! You are getting quite rude! Please answer my question."
										+ "\nRORY: Will you join me? ");
								if (noCount > 9 && noCount <= 24)
									System.out.print("RORY: Surely, this will be quite an adventure," 
										+ "\nRORY: but I can only take so much of this." 
										+ "\nRORY: Your answer? ");
								if (noCount == 25)
									System.out.print("RORY: That is it, This is the last time I will ask."
										+ "\nRORY: What is your answer? ");
								if (noCount > 25)
								{
									System.out.print("RORY: That was your last chance buddy!!!"
										+ "\nRORY: I have better things to do with my time!"
										+ "\n...\n\n.....\n\n.......\n\n...System32-Deleted...\n"
										+ "\nRORY: Have fun with that, jerk!\n\n...\n\n");
									System.exit(0);
								}
								noCount++;	
							}
						}
						while (done != true);
						done = false;
						System.out.println("\nRORY: Great to hear it!!! I look forward to working with you!"
						+ "\nRORY: I didn't catch your name. What did you say it was?\n");
						do
						{
							done = false;
							System.out.print("\nWhat is your name? ");
							playerName = scan.next();
							System.out.print("\n\nRORY: Your name is "  + playerName + ". Did I catch that right? ");
							menuAnswer = scan.next();
							menuAnswer = menuAnswer.toUpperCase();
							menuAnswer = menuAnswer.substring(0,1);
							if (menuAnswer.equals("Y"))
							{
								System.out.println("\n\nRORY: See you later " + playerName + "!\n");
								done = true;
								System.out.print("Press and enter any key to continue: ");
								garbage = scan.next();
								System.out.print("\n\n\n");
							}
						}
						while (done != true);
						done = false;
				}
				else
					System.out.println("\nWelcome back to Scavenger's Rift!\n\n\n");
				worldTitle = "--------------<THE COLONY>--------------\n";
				worldName = "THE COLONY";
				worldIntro = "The Colony";
				do
				{
					done = false;
					option1 = "\n\t1. - " + "INVENTORY";
					option2 = "\n\t2. - " + "TRAVEL";
					option3 = "\n\t3. - " + "EXPLORE";
					option4 = "\n\t4. - " + "QUIT";
					System.out.println("\nYou are at " + worldIntro + "\n");
					if (colonyEvent == 0)
					{
						System.out.println("\nRORY: Welcome to The Colony!"														//COLONY EVENT 1
							+"\nRORY: This is where I first crash landed."
							+"\nRORY: Since then, I have been working to populate this place."
							+"\nRORY: Someday I hope to have many different creatures"
							+"\nRORY: living and working together to create a great city!"
							+"\nRORY: Maybe someday we can create a city that rivals a city on Morlamast!" 
							+"\nRORY: But, until then take a look around.\n");
						System.out.print("Press and enter any key to continue: ");
						garbage = scan.next();
						System.out.print("\n");
						colonyEvent++;
						storyCount++;
					}
					if (storyCount >= 10 &&colonyEvent == 1)
					{
						System.out.println("Hey, " + playerName + " Well I see that you have gotten the hang of things."		//COLONY EVENT 2
							+"\nRORY: I let you be for now, but I'm sure we will cross paths soon enough!"
							+"\nRORY: I'm off to recruit in the far regions of the planet."
							+"\nRORY: I'm leaving you in charge of the Colony until I get back!"
							+"\nRORY: Take care of it, I know you will do a good job."
							+"\nRORY: See you later, maybe I'll bring back a souvenir!\n");
						System.out.print("Press and enter any key to continue: ");
						garbage = scan.next();
						System.out.print("\n");
						colonyEvent++;
						storyCount++;
					}

					System.out.println(worldTitle
						+ option1 
						+ option2 
						+ option3 
						+ option4 + "\n");

					System.out.print("What would you like to do: ");
					menuAnswer = scan.next();
					menuAnswer = menuAnswer.toUpperCase();
					menuAnswer = menuAnswer.substring(0,1);
					//System.out.println("\nYou answered: " + menuAnswer);
					System.out.print("\n");

					switch (menuAnswer)
					{
					case "1":																							//INVENTORY for in game menu
					case "I":
						if (inventoryEvent == 0)
						{
							System.out.println("\n--------This is your inventory!---------\n"									//INVENTORY INTRO
								+ "\nThis is where your items, resources, and tools are kept!"
								+ "\nYou can check your inventory anytime to see" 
								+ "\nhow many resources you have or what goals you have at the moment.\n");
							System.out.print("Press and enter any key to continue: ");
							garbage = scan.next();
							System.out.print("\n\n");
							inventoryEvent++;
							storyCount++;
						}
						if (itemListNumber == 0)
							System.out.println("You have no items\n");
						else
							System.out.println("You have " + itemListNumber + "\n");
						if (toolListNumber == 0)
							System.out.println("You have no tools\n");
						else
							System.out.println("You have " + toolListNumber + "\n");	
						if (resourceListNumber == 0)
							System.out.println("You have no resources\n");
						else
							System.out.println("You have " + resourceListNumber + "\n");
							do
							{
								done = false;
								option1 = "\n\t1. - " + "CHECK TOOLS";
								option2 = "\n\t2. - " + "CHECK ITEMS";
								option3 = "\n\t3. - " + "CHECK RESOURCES";
								option4 = "\n\t4. - " + "BACK";
								System.out.println(worldTitle
									+ "--------------<INVENTORY>---------------\n"
									+ option1 
									+ option2 
									+ option3 
									+ option4
									+ "\n");
								System.out.print("What would you like to do: ");
								menuAnswer = scan.next();
								menuAnswer = menuAnswer.toUpperCase();
								menuAnswer = menuAnswer.substring(0,1);
								//System.out.println("\nYou answered: " + menuAnswer);
								System.out.print("\n");
								switch (menuAnswer)
								{
								case "1":
									System.out.println("You have these items in your pack:" + "\n" + itemList + "\n");
									break;

								case "2":
									System.out.println("You have these tools in your pack:" + "\n" + toolList + "\n");
									break;

								case "3":
									System.out.println("You have these resources in your pack:" + "\n" + resourceList + "\n");
									break;

								case "4":
								case "B":
									done = true;
									break;

								default:
									break;
								}
							}
							while (done != true);
							done = false;
						break;

					case "2":																							//TRAVEL for in game menu
					case "T":
						if (travelEvent == 0)
						{
							System.out.println("\n-------This is your travel guide!-------\n"								//TRAVEL INTRO
								+ "\nThis is where you can move around Scavenger's Rift easily!"
								+ "\nYou can unlock more places by helping out in each region.\n");
							System.out.print("Press and enter any key to continue: ");
							garbage = scan.next();
							System.out.print("\n\n");
							travelEvent++;
							storyCount++;
						}
						System.out.println(worldTitle
						+ "----------------<TRAVEL>----------------\n"
						+ "\n\t1. - " + "THE COLONY" 
						+ "\n\t2. - " + "THE PLAINES OF SEREDIE");
						if (world2 == true)
							System.out.println("\t3. - " + "WORLD TWO");
						else
							System.out.println("\t3. - " + "LOCKED");
						if (world3 == true)
							System.out.println("\t4. - " + "THE TOOSHENAIR TUNDRA");
						else
							System.out.println("\t4. - " + "LOCKED");
							System.out.println("\t5. - " + "BACK" + "\n");
						System.out.print("Where would you like to travel? ");
						menuAnswer = scan.next();
						menuAnswer = menuAnswer.toUpperCase();
						menuAnswer = menuAnswer.substring(0,1);
						//System.out.println("\nYou answered: " + menuAnswer);
						System.out.print("\n");
						if (world2 == false && menuAnswer.equals("3"))
							menuAnswer = "LOCKED";
						if (world3 == false && menuAnswer.equals("4"))
							menuAnswer = "LOCKED";
						switch (menuAnswer)
						{
						case "1":
							worldTitle = "--------------<THE COLONY>--------------\n";
							worldName = "THE COLONY";
							worldIntro = "The Colony";
							System.out.println("\n\tTraveling to " + worldIntro + " now!");
							System.out.println("\n\tPlease wait a moment.\n");
							System.out.println("\nYou are at " + worldIntro + "\n");
							break;

						case "2":
							worldTitle = "--------<THE PLAINES OF SEREDIE>--------\n";
							worldName = "THE PLAINES OF SEREDIE";
							worldIntro = "The Plaines of Seredie";
							System.out.println("\n\tTraveling to " + worldIntro + " now!");
							System.out.println("\n\tPlease wait a moment.\n");
							System.out.println("\nYou are at " + worldIntro + "\n");
							break;

						case "3":
							worldTitle = "--------------<WORLD TWO>---------------\n";
							worldName = "WORLD TWO";
							worldIntro = "World Two";
							System.out.println("\n\tTraveling to " + worldIntro + " now!");
							System.out.println("\n\tPlease wait a moment.\n");
							System.out.println("\nYou are at " + worldIntro + "\n");
							break;

						case "4":
							worldTitle = "--------<THE TOOSHENAIR TUNDRA>---------\n";
							worldName = "THE TOOSHENAIR TUNDRA";
							worldIntro = "The Tooshenair Tundra";
							System.out.println("\n\tTraveling to " + worldIntro + " now!");
							System.out.println("\n\tPlease wait a moment.\n");
							System.out.println("\nYou are at " + worldIntro + "\n");
							break;

						case "B":
						case "5":
							break;

						case "LOCKED":
							System.out.println("\nYou have not unlocked this region yet");
							System.out.println("Please travel to a place you have already unlocked\n");
							break;

						default:
							System.out.println("\nYou can't travel there!");
							System.out.println("Please enter a place on the menu.\n");
							break;
						}
						break;

					case "3": 																							//EXPLORE for in game menu
					case "E":
						if (exploreEvent == 0)
						{
							System.out.println("\n-This is where you explore each region!-\n"							//EXPLORE INTRO
								+ "\nEach region has differnt resources to offer!"
								+ "\nYou can also make friends through exploring!"
								+ "\nThey may even help you out a bit. Check it out!\n");
							System.out.print("Press and enter any key to continue: ");
							garbage = scan.next();
							System.out.print("\n\n");
							exploreEvent++;
							storyCount++;
						}
						if (worldName.equals("THE COLONY"))																//THE COLONY EVENTS
						{			
							do
							{
								done = false;
								option1 = "\n\t1. - " + "GO TO RORY'S HOUSE";
							if (market == true)
								option2 = "\n\t2. - " + "GO TO THE MARKET";
							else
								option2 = "\n\t2. - " + "LOCKED";
							if (researchLab == true)
								option3 = "\n\t3. - " + "GO TO RESEARCH LAB";
							else
								option3 =  "\n\t3. - " + "LOCKED";
							if (workshop == true)
								option4 = "\n\t4. - " + "GO TO WORKSHOP";
							else
								option4 = "\n\t4. - " + "LOCKED";
							option5 = "\n\t5. - " + "BACK";
								System.out.println(worldTitle
									+ "---------------<EXPLORE>----------------\n"
									+ option1 
									+ option2 
									+ option3 
									+ option4
									+ option5 + "\n");
								System.out.print("What would you like to do: ");
								menuAnswer = scan.next();
								menuAnswer = menuAnswer.toUpperCase();
								menuAnswer = menuAnswer.substring(0,1);
								//System.out.println("\nYou answered: " + menuAnswer);
								System.out.print("\n");
								if (market == false && menuAnswer.equals("2"))
									menuAnswer = "LOCKED";
								if (market == false && menuAnswer.equals("3"))
									menuAnswer = "LOCKED";
								if (market == false && menuAnswer.equals("4"))
									menuAnswer = "LOCKED";

								switch (menuAnswer)
								{
								case "1":																							//GO TO HOUSE
									if (houseEvent == 0)																			//Houseevent1
									{
									System.out.println("RORY: Welcome to my house, you can stay as long as you like!"
										+ "\nRORY: Go ahead and look around. If you get tired you can take a nap."
										+ "\nRORY: You can also customize your outfit here, as well as check your progress."
										+ "\nRORY: Come around anytime! It is your home now afterall.\n");
									System.out.print("Press and enter any key to continue: ");
									garbage = scan.next();
									System.out.print("\n");
									storyCount++;
									houseEvent++;
									}
									else
										System.out.println("\nWelcome home!\n");
									
									done = false;
									exploreName = "--------------<YOUR HOUSE>--------------";
									do
									{
										done = false;
										option1 = "\n\t1. - " + "SLEEP";
										option2 = "\n\t2. - " + "CHANGE CLOTHES";
										option3 = "\n\t3. - " + "CHECK PROGRESS";
										option4 = "\n\t4. - " + "BACK";
										System.out.println(worldTitle
											+ exploreName + "\n"
											+ option1 
											+ option2 
											+ option3 
											+ option4
											+ "\n");
										System.out.print("What would you like to do: ");
										menuAnswer = scan.next();
										menuAnswer = menuAnswer.toUpperCase();
										menuAnswer = menuAnswer.substring(0,1);
										//System.out.println("\nYou answered: " + menuAnswer);
										System.out.print("\n");
										switch (menuAnswer)
										{
										case "1":
											if (houseSleepEvent == 0)															//sleep intro
											{
												System.out.println("When taking naps, any workers you have working on"
													+ "\nresources will collect 1.5x more resources for you!");
												System.out.print("Press and enter any key to continue: ");
												garbage = scan.next();
												System.out.print("\n");
												houseSleepEvent++;
												storyCount++;									//maybe better resource gathering for 5-10 turns?
											}

											System.out.println("You take a nap.\n");
											break;

										case "2":
											if (houseChangeEvent == 0)															//Change clothes intro
											{
												System.out.println("This is where you would change into any clothes"
													+ "\nyou have optained through your adventures.\n");
												System.out.print("Press and enter any key to continue: ");
												garbage = scan.next();
												System.out.print("\n");
												houseChangeEvent++;
												storyCount++;
											}
											System.out.println("You have nothing to change into.\n");
											break;

										case "3":
											if (houseProgressEvent == 0)														//progress intro
											{
												System.out.println("You can check your progess here. You can gain more progress by doing tasks"
													+ "\nexploring, upgrading buildings, reseaching technology, or obtaining items.\n");
												System.out.print("Press and enter any key to continue: ");
												garbage = scan.next();
												System.out.print("\n");
												storyCount++;
												houseProgressEvent++;
											}
											progressCount = storyCount + researchCount + upgradeCount + itemCount + taskCount;
											if (progressCount != 0)
											progress = (double) progressCount / PROGRESSCOUNTMAX;
											if (storyCount != 0)
											story = (double) storyCount / STORYCOUNTMAX;
											if (researchCount != 0)
											research = (double) researchCount / RESEARCHCOUNTMAX;
											if (taskCount != 0)
											task = (double) taskCount / TASKCOUNTMAX;
											if (itemCount != 0)
											item = (double) itemCount / ITEMCOUNTMAX;
											if (upgradeCount != 0)
											upgrade = (double) upgradeCount / UPGRADECOUNTMAX;
											System.out.println("You have completed  " + progressCheck.format(progress) + " of the entire game");
											System.out.println("You have completed  " + progressCheck.format(story) + " of the storyline");
											System.out.println("You have upgraded   " + progressCheck.format(upgrade) + " of the buildings in THE COLONY");
											System.out.println("You have completed  " + progressCheck.format(task) + " of the tasks");
											System.out.println("You have found      " + progressCheck.format(item) + " of the items");
											System.out.println("You have researched " + progressCheck.format(research) + " of the technology game\n");
											break;

										case "4":
										case "B":
											done = true;
											break;

										default:
											break;
										}
									}
									while (done != true);
									done = false;
									break;

								case "2":
	
									break;

								case "3":
									break;

								case "4":
									break;

								case "B":
								case "5":
									done = true;
									break;

								case "LOCKED":
									System.out.println("\nYou have not unlocked this area yet");
									System.out.println("Please explore a place you have already unlocked\n");
									break;

								default:
									break;
								}
							}
							while (done != true);
							done = false;
						}
						else if (worldName.equals("THE PLAINES OF SEREDIE"))										//THE PLAINES OF SEREDIE EVENTS
						{
							done = false;
							if (seredieEvent == 0)																		//Seredie plaines event1
							{
								System.out.println("\nRORY: Welcome to the Plaines of Seredie!"														
									+"\nRORY: This region is just west of the colony, it is a lush and peaceful place."
									+"\nRORY: Since this is your first exploring a region, I've got some suggestions.\n"
									+"\nRORY: 1. Most towns around Scavenger's rift love visitors."
									+"\nRORY: If you help them, you might even get their help for later!\n"
									+"\nRORY: 2. Each region has a resource or two to gather."
									+"\nRORY: If you collect them, you will be"
									+"\nRORY: able to use those resources in the Colony.\n"
									+"\nRORY: 3. Lastly, make sure to explore the region fully," 
									+"\nRORY: you never know what you may find!\n"
									+"\nRORY: Well I'm heading back to the Colony! See you later " + playerName + "\n");	//maybe rory give item/tool?
								System.out.print("Press and enter any key to continue: ");
								garbage = scan.next();
								System.out.print("\n");
								seredieEvent++;
								storyCount++;
							}
							do
							{
								done = false;
								option1 = "\n\t1. - " + "PALMA VILLAGE";
								option2 = "\n\t2. - " + "TUBEWOOD FOREST";
								if (shackleOutcrop == true)
									option3 = "\n\t3. - " + "SHACKLE OUTCROP";
								else
									option3 = "\n\t3. - " + "LOCKED";
								if (flexrockQuarry == true)
									option4 = "\n\t4. - " + "FLEXROCK QUARRY";
								else
									option4 = "\n\t4. - " + "LOCKED";
								if (minigame1 == true)
									option5 = "\n\t5. - " + "MINIGAME";
								else
									option5 = "\n\t5. - " + "LOCKED";
								option6 = "\n\t6. - " + "BACK";
								System.out.println(worldTitle
									+ "---------------<EXPLORE>----------------\n"
									+ option1 
									+ option2 
									+ option3 
									+ option4
									+ option5
									+ option6 + "\n");
								System.out.print("What would you like to do: ");
								menuAnswer = scan.next();
								menuAnswer = menuAnswer.toUpperCase();
								menuAnswer = menuAnswer.substring(0,1);
								//System.out.println("\nYou answered: " + menuAnswer);
								System.out.print("\n");
								done = false;
								switch (menuAnswer)
								{
								case "1":																						//palma village
									if (palmaVillageEvent == 0)																
									{
										System.out.println("\nTISHROAR: Welcome to Palma Village!"
											+ "\nTISHROAR: I am Tishroar, I am the chief here."
											+ "\nTISHROAR: You seem to be just the traveler that we need."
											+ "\nTISHROAR: Come on over to my hut when your ready."
											+ "\n");
										System.out.print("Press and enter any key to continue: ");
										garbage = scan.next();
										System.out.print("\n");
										palmaVillageEvent++;
									}
									System.out.println("\nWelcome to Palma Village!\n");
									exploreName = "-------------<PALMA VILLAGE>------------\n";
									int tishroarsTasks = 0;
									int tubewoodQuestAmount = 0;
									int wateringCanAmount = 0;
									boolean hutFix = false;
									boolean hutWater = false;
									boolean hut1Fix = false;
									boolean hut1Water = false;
									boolean wallsFix = false;
									boolean wallsWater = false;
									boolean gardenWater = false;
									do
									{
										done = false;
										option1 = "\n\t1. - " + "TISHROAR'S HUT";
										if (meetNelma != true)
											option2 = "\n\t2. - " + "HUT";
										else
											option2 = "\n\t2. - " + "NELMA'S HUT";
										if (meetTeeklar != true)
											option3 = "\n\t3. - " + "HUT";
										else
											option3 = "\n\t3. - " + "TEEKLAR's HUT";
										if (meetShareebla != true)
											option4 = "\n\t4. - " + "HUT";
										else
											option4 = "\n\t4. - " + "THE SHAREEBLA'S HUT";
										option5 = "\n\t5. - " + "WELL";
										option6 = "\n\t6. - " + "GARDEN";
										option7 = "\n\t7. - " + "BACK";
										
										if (tishroarsQuest == true)													//tishroars quest explore options
										{
											option1 = "\n\t1. - " + "TISHROAR'S HUT";
											option2 = "\n\t2. - " + "TUBEWOOD TREE";
											option3 = "\n\t3. - " + "HUT";
											option4 = "\n\t4. - " + "HUT";
											option5 = "\n\t5. - " + "WALLS";
											option6 = "\n\t6. - " + "WELL";
											option7 = "\n\t7. - " + "GARDEN";
											option8 = "\n\t8. - " + "BACK";
										System.out.println(worldTitle
											+ exploreName
											+ option1 
											+ option2 
											+ option3 
											+ option4
											+ option5
											+ option6
											+ option7
											+ option8
											+ "\n");
										System.out.print("What would you like to do: ");
										}
										else
										{
										System.out.println(worldTitle
											+ exploreName
											+ option1 
											+ option2 
											+ option3 
											+ option4
											+ option5
											+ option6
											+ option7
											+ "\n");
										System.out.print("What would you like to do: ");
										}
										menuAnswer = scan.next();
										menuAnswer = menuAnswer.toUpperCase();
										menuAnswer = menuAnswer.substring(0,1);
										//System.out.println("\nYou answered: " + menuAnswer);
										System.out.print("\n");
										if (tishroarsQuest == true)													//tishroars quest explore options
										{
											switch (menuAnswer)
											{
											case "1":		//Tishroar's quest tishroars hut
											if (tishroarsTasks >= 4)
											{
												tishroarsQuest = false;
												palmaVillageEvent++;
												seredieEvent++;
												storyCount++;

											}
												break;

											case "2":		//Tishroar's quest tubewood tree
												if (tubewoodQuestAmount < 10)
												{
													System.out.println("You collect some Tubewood from the tree");
													tubewoodQuestAmount++;
													System.out.println("You now have " + tubewoodQuestAmount + " pieces of Tubewood.\n");
												}
												else
													System.out.println("You have enough Tubewood\n");
												break;

											case "3":		//Tishroar's quest hut
												if (hutFix != true)
												{
													if (tubewoodQuestAmount >= 2)
													{
														System.out.println("You fix the hut\n");
														hutFix = true;
														tubewoodQuestAmount -= 2;
														System.out.println("You now have " + tubewoodQuestAmount + " pieces of Tubewood.\n");
													}
													else
													{
														System.out.println("You need more tubewood!\n");
														hutFix = false;
													}
												}
												else if (hutWater != true)
												{
													if (wateringCanAmount >= 2)
													{
														System.out.println("You watered the hut");
														hutWater = true;
														wateringCanAmount -= 2;
														System.out.println("You now have " + wateringCanAmount + " uses of water.\n");
														tishroarsTasks++;
														System.out.println("You are now done with this hut");
													}
													else
													{
														System.out.println("You need more water!\n");
														hutWater = false;
													}
												}
												else if (hutWater == true && hutFix == true)
												{
													System.out.println("You have fixed and watered the hut, you are done with this hut!\n");
												}
												break;

											case "4":		//Tishroar's quest hut
											if (hut1Fix != true)
											{
												if (tubewoodQuestAmount >= 2)
												{
													System.out.println("You fix the hut\n");
													hut1Fix = true;
													tubewoodQuestAmount -= 2;
													System.out.println("You now have " + tubewoodQuestAmount + " pieces of Tubewood.\n");
												}
												else
												{
													System.out.println("You need more tubewood!\n");
													hut1Fix = false;
												}
											}
											else if (hut1Water != true)
											{
												if (wateringCanAmount >= 2)
												{
													System.out.println("You watered the hut");
													hut1Water = true;
													wateringCanAmount -= 2;
													System.out.println("You now have " + wateringCanAmount + " uses of water.\n");
													tishroarsTasks++;
													System.out.println("You are now done with this hut");
												}
												else
												{
													System.out.println("You need more water!\n");
													hut1Water = false;
												}
											}
											else if (hut1Water == true && hut1Fix == true)
											{
												System.out.println("You have fixed and watered the hut, you are done with this hut!\n");
											}
											break;

											case "5":		//Tishroar's quest walls
												if (wallsFix != true)
												{
													if (tubewoodQuestAmount >= 6)
													{
														System.out.println("You fix the walls\n");
														wallsFix = true;
														tubewoodQuestAmount -= 6;
														System.out.println("You now have " + tubewoodQuestAmount + " pieces of Tubewood.\n");
													}
													else
													{
														System.out.println("You need more tubewood!\n");
														wallsFix = false;
													}
												}
												else if (wallsWater != true)
												{
													if (wateringCanAmount >= 2)
													{
														System.out.println("You watered the walls");
														wallsWater = true;
														wateringCanAmount -= 2;
														System.out.println("You now have " + wateringCanAmount + " uses of water.\n");
														tishroarsTasks++;
														System.out.println("You are now done with the walls");
													}
													else
													{
														System.out.println("You need more water!\n");
														wallsWater = false;
													}
												}
												else if (wallsWater == true && wallsFix == true)
												{
													System.out.println("You have fixed and watered the walls, you are done with that!\n");
												}
												break;

											case "6":		//Tishroar's quest well
												if (wateringCanAmount < 10)
												{
													System.out.println("You gather some water from the well");
													wateringCanAmount++;
													System.out.println("You now have " + wateringCanAmount + " uses of water.\n");
												}
												else
													System.out.println("You have enough water\n");
												break;

											case "7":		//Tishroar's quest garden
												if (gardenWater != true)
												{
													if (wateringCanAmount >= 4)
													{
														System.out.println("You watered the walls");
														gardenWater = true;
														wateringCanAmount -= 4;
														System.out.println("You now have " + wateringCanAmount + " uses of water.\n");
														tishroarsTasks++;
														System.out.println("You are now done watering the garden");
													}
													else
													{
													System.out.println("You need more water!\n");
													gardenWater = false;
													}
												}
												else if (gardenWater == true)
												{
													System.out.println("You have watered the garden, you are done with that!\n");
												}
												break;

											case "8":		//Tishroar's quest back
											case "B":
												done = true;
												break;

											default:
												break;
											}
										}
										else
										{
											switch (menuAnswer)
											{
											case "1":				//tishroars hut
												if (palmaVillageEvent == 1)							//palma village event1/seredie event 2 start
												{
												System.out.print("\nTISHROAR: Welcome to my home."
													+ "\nTISHROAR: Like I said I am Tishroar, I am the chief here."
													+ "\nTISHROAR: You must be wondering why I called you here."
													+ "\nTISHROAR: Us Palma are a short people. Sometimes we get called Ewoks"
													+ "\nTISHROAR: but we aren't them. They live on Endor's Moon."
													+ "\nTISHROAR: Anyway, the reason we need you is because you can do things easily"
													+ "\nTISHROAR: which would take a lot of effort to do.\n\n"
													+ "\nTISHROAR: So what do you say? Want to help? ");
												garbage = scan.next();
												System.out.println("\nTISHROAR: Either way, If you want to help here's what you can do."
													+ "\n\nTISHROAR: 1. You can start by cutting some Tubewood for repairs."
													+ "\nTISHROAR: You will also need this Axe.\n"
													+ "\nTISHROAR: 2. Once you have collected some wood, you can start repairs."
													+ "\nTISHROAR: You need to repair the walls and a few huts.\n"
													+ "\nTISHROAR: 3. Lastly, the village needs watering."
													+ "\nTISHROAR: The garden, the walls, and the huts need watering."
													+ "\nTISHROAR: You can head to the well and collect some water."
													+ "\nTISHROAR: You will also need this watering can to hold it."
													+ "\n");
												System.out.println("\nTISHROAR: Come back when you are finished!"
													+ "\nTISHROAR: I will reward you well."
													+ "\n");
												System.out.print("Press and enter any key to continue: ");
												garbage = scan.next();
												System.out.print("\n");
												axe = true;
												wateringCan = true;
												seredieEvent++;
												palmaVillageEvent++;
												tishroarsQuest = true;
												}
												break;

											case "2":				//nelma's hut 
												meetNelma = true;
												break;

											case "3":				//teeklar'S HUT, 
												meetTeeklar = true;
												break;

											case "4":				//the shareebla's HUT
												meetShareebla = true;
												break;

											case "5":				//well
												break;

											case "6":				//garden
												break;

											case "7":				//back
											case "B":
												done = true;
												break;

											default:
												break;
											}
										}
									}
									while (done != true);
									done = false;
									break;

								case "2":																			//tubewood forest
									done= false;	
									if (seredieEvent == 1)
									{
										System.out.println("You should check out Palma Village first\n");
										done = true;
									}
									else if (seredieEvent == 2)
									{
										System.out.println("You should help out in Palma Village before exploring\n");
										done = true;
									}
									else
										System.out.println("\nWelcome to Tubewood Forest!\n");
									exploreName = "TUBEWOOD FOREST";
									while (done != true)
									{
										option1 = "\n\t1. - " + "";
										option2 = "\n\t2. - " + "";
										option3 = "\n\t3. - " + "";
										option4 = "\n\t4. - " + "BACK";
										System.out.println("-------<" + worldName + ">-------\n"
											+ "  -----<" + exploreName + ">-----\n"
											+ option1 
											+ option2 
											+ option3 
											+ option4
											+ "\n");
										System.out.print("What would you like to do: ");
										menuAnswer = scan.next();
										menuAnswer = menuAnswer.toUpperCase();
										menuAnswer = menuAnswer.substring(0,1);
										//System.out.println("\nYou answered: " + menuAnswer);
										System.out.print("\n");
										switch (menuAnswer)
										{
										case "1":
											break;

										case "2":
											break;

										case "3":
											break;

										case "4":
										case "B":
											done = true;
											break;

										default:
											break;
										
										}
									}
									done= false;
									break;

								case "3":																				//shackle outcrop
									System.out.println("\nWelcome home!\n");
									
									done = false;
									exploreName = "HOUSE";
									do
									{
										done = false;
										option1 = "\n\t1. - " + "SLEEP";
										option2 = "\n\t2. - " + "CHANGE CLOTHES";
										option3 = "\n\t3. - " + "CHECK PROGRESS";
										option4 = "\n\t4. - " + "BACK";
										System.out.println("-------<" + worldName + ">-------\n"
											+ "  -----<" + exploreName + ">-----\n"
											+ option1 
											+ option2 
											+ option3 
											+ option4
											+ "\n");
										System.out.print("What would you like to do: ");
										menuAnswer = scan.next();
										menuAnswer = menuAnswer.toUpperCase();
										menuAnswer = menuAnswer.substring(0,1);
										//System.out.println("\nYou answered: " + menuAnswer);
										System.out.print("\n");
										switch (menuAnswer)
										{
										case "1":
											break;

										case "2":
											break;

										case "3":
											break;

										case "4":
										case "B":
											done = true;
											break;

										default:
											break;
										
										}
									}
									while (done != true);
									done = false;
									break;

								case "4":																						//flexrock quarry
									System.out.println("\nWelcome home!\n");
									
									done = false;
									exploreName = "HOUSE";
									do
									{
										done = false;
										option1 = "\n\t1. - " + "SLEEP";
										option2 = "\n\t2. - " + "CHANGE CLOTHES";
										option3 = "\n\t3. - " + "CHECK PROGRESS";
										option4 = "\n\t4. - " + "BACK";
										System.out.println("-------<" + worldName + ">-------\n"
											+ "  -----<" + exploreName + ">-----\n"
											+ option1 
											+ option2 
											+ option3 
											+ option4
											+ "\n");
										System.out.print("What would you like to do: ");
										menuAnswer = scan.next();
										menuAnswer = menuAnswer.toUpperCase();
										menuAnswer = menuAnswer.substring(0,1);
										//System.out.println("\nYou answered: " + menuAnswer);
										System.out.print("\n");
										switch (menuAnswer)
										{
										case "1":
											break;

										case "2":
											break;

										case "3":
											break;

										case "4":
										case "B":
											done = true;
											break;

										default:
											break;
										
										}
									}
									while (done != true);
									done = false;
									break;

								case "5":																				//minigame1
									System.out.println("\nWelcome home!\n");
									exploreName = "HOUSE";
									do
									{
										done = false;
										option1 = "\n\t1. - " + "SLEEP";
										option2 = "\n\t2. - " + "CHANGE CLOTHES";
										option3 = "\n\t3. - " + "CHECK PROGRESS";
										option4 = "\n\t4. - " + "BACK";
										System.out.println("-------<" + worldName + ">-------\n"
											+ "  -----<" + exploreName + ">-----\n"
											+ option1 
											+ option2 
											+ option3 
											+ option4
											+ "\n");
										System.out.print("What would you like to do: ");
										menuAnswer = scan.next();
										menuAnswer = menuAnswer.toUpperCase();
										menuAnswer = menuAnswer.substring(0,1);
										//System.out.println("\nYou answered: " + menuAnswer);
										System.out.print("\n");
										switch (menuAnswer)
										{
										case "1":
											break;

										case "2":
											break;

										case "3":
											break;

										case "4":
										case "B":
											done = true;
											break;

										default:
											break;
										
										}
									}
									while (done != true);
									done = false;
									break;

								case "B":
								case "6":
									done = true;
									break;

								case "LOCKED":
									System.out.println("\nYou have not unlocked this area yet");
									System.out.println("Please explore a place you have already unlocked\n");
									break;

								default:
									break;
								}
							}
							while (done != true);
							done = false;
						}
						else if (worldName.equals("WORLD TWO"))																//WORLD2 EVENTS
						{							
							do
							{
								done = false;
								option1 = "\n\t1. - " + "GO TO RESOURCE3";
								option2 = "\n\t2. - " + "GO TO RESOURCE4";
								option3 = "\n\t3. - " + "GO TO TOWN3";
								option4 = "\n\t4. - " + "GO TO TOWN4";
								option5 = "\n\t5. - " + "BACK";
								System.out.println(worldTitle
									+ "---------------<EXPLORE>----------------\n"
									+ option1 
									+ option2 
									+ option3 
									+ option4
									+ option5 + "\n");
								System.out.print("What would you like to do: ");
								menuAnswer = scan.next();
								menuAnswer = menuAnswer.toUpperCase();
								menuAnswer = menuAnswer.substring(0,1);
								//System.out.println("\nYou answered: " + menuAnswer);
								System.out.print("\n");
								switch (menuAnswer)
								{
								case "1":
									break;

								case "2":
									break;

								case "3":
									break;

								case "4":
									break;

								case "B":
								case "5":
									done = true;
									break;

								default:
									break;
								}
							}
							while (done != true);
							done = false;
						}
						else if (worldName.equals("THE TOOSHENAIR TUNDRA"))																//WORLD3 EVENTS
						{
							do
							{
								done = false;
								option1 = "\n\t1. - " + "GO TO RESOURCE5";
								option2 = "\n\t2. - " + "GO TO RESOURCE6";
								option3 = "\n\t3. - " + "GO TO TOWN5";
								option4 = "\n\t4. - " + "GO TO TOWN6";
								option5 = "\n\t5. - " + "BACK";
								System.out.println(worldTitle
									+ "---------------<EXPLORE>----------------\n"
									+ option1 
									+ option2 
									+ option3 
									+ option4
									+ option5 + "\n");
								System.out.print("What would you like to do: ");
								menuAnswer = scan.next();
								menuAnswer = menuAnswer.toUpperCase();
								menuAnswer = menuAnswer.substring(0,1);
								//System.out.println("\nYou answered: " + menuAnswer);
								System.out.print("\n");
								switch (menuAnswer)
								{
								case "1":
									break;

								case "2":
									break;

								case "3":
									break;

								case "4":
									break;

								case "B":
								case "5":
									done = true;
									break;

								default:
									break;
								}
							}
							while (done != true);
							done = false;
						}
						break;

					case "4":																							 //QUIT for in game menu
					case "Q":
						System.out.print("Are you sure you want to go back to the main menu? Yes or No? ");
						menuAnswer = scan.next();
						menuAnswer = menuAnswer.toUpperCase();
						menuAnswer = menuAnswer.substring(0,1);
						//System.out.println("\nYou answered: " + menuAnswer);
						if (menuAnswer.equals("Y"))
						{
							done = true;
							System.out.println("\n");
						}
						break;

					default:
						System.out.println("\nYour input was not understood.");
						System.out.println("Please enter a valid menu option or word.\n");
						break;
					}
				}
				while (done != true);
				done = false;
				break;

			case "Q": 																										//option 3 for main menu
			case "3":
				System.out.print("Are you sure you want to quit? Yes or No? ");
				menuAnswer = scan.next();
				menuAnswer = menuAnswer.toUpperCase();
				menuAnswer = menuAnswer.substring(0,1);
				//System.out.println("\nYou answered: " + menuAnswer);
				if (menuAnswer.equals("Y"))
				{
					System.out.println("\n\nRORY: Thanks for playing!");
					System.out.println("RORY: Goodbye for now!\n");
					System.exit(0);
				}
				System.out.println("\n");
				break;

			default:
				System.out.println("\nYour input was not understood.");
				System.out.println("Please enter a valid menu option or word.\n");
				break;
			}
		System.out.println("\n\n");
		}
		while (done != true);
		done = false;
	}
}
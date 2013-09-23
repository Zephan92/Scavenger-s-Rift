import java.io.*;

class MethodTest 
{
	public static void main(String[] args) throws IOException
	{
		Save save = new Save();////////////////////////////////////////////////////////////////////////// Access to player files
		GeneralMethods gm = new GeneralMethods();//////////////////////////////////////////////////////// Access to the general methods
		StoryLines story = new StoryLines();///////////////////////////////////////////////////////////// Access to the story events
		InGameMenu menu1 = new InGameMenu();///////////////////////////////////////////////////////////// Access to the in game menu
		TheColony theColony = new TheColony();
		MainMenu mainMenu = new MainMenu();
		Seredie seredie = new Seredie();

		save.checkClass();
		gm.checkClass();
		story.checkClass();
		menu1.checkClass();
		theColony.checkClass();
		mainMenu.checkClass();
	}
}

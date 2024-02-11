package com.software.developers;

public class Software {
	//creating the method and accepting parent class object
	public void SoftwareDevoloper(SoftwareEngineer se)
	{
		//calling the inherited methods
		se.attendMeeting();
		//calling the over ridden method
		se.doProject();
		//calling the child specific class
		if(se instanceof BackendDeveloper)
		{
			((BackendDeveloper) (se)).learnBackEndlang();
		}
		else if(se instanceof FrontendDeveloper)
		{
		   ((FrontendDeveloper) (se)).learnFrontendlang();
		
	     }

}
}

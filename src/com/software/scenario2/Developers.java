package com.software.scenario2;

public class Developers {
	//creating the method and storing the Parent class object
	public void doActivity(SoftwareEngineer se)
	{
		//calling the inherited methods
		se.testCode();
		//calling the over ridden methods
		se.attendMeeting();
		//calling the child specific method
		 if(se instanceof JavaDeveloper)
		{
			((JavaDeveloper)(se)).doBackEndproj();
			((JavaDeveloper)(se)).learnJava();
		}
		else if(se instanceof PythonDeveloper)
		{
			((PythonDeveloper)(se)).doBackEndproj();
			((PythonDeveloper)(se)).learnPython();
		}
		else if(se instanceof BackEndDeveloper)
		{
			((BackEndDeveloper)(se)).doBackEndproj();
		}
		else if(se instanceof FrontEndDeveloper)
		{
			((FrontEndDeveloper)(se)).doFrontEndproj();
			((FrontEndDeveloper)(se)).learnFrontEndlang();
		}
		
	}

}

package com.software.scenario2;

public class FrontEndDeveloper extends SoftwareEngineer{

	@Override
	void attendMeeting() {
		System.out.println("FrontEndDeveloper is attending the meeting");
	     
	}
	//child Specific Method
	void doFrontEndproj()
	{
		System.out.println("FrontendDeveloper is doing Frontend Project");
	}
	//child Specific Method
	void learnFrontEndlang()
	{
		System.out.println("Frontend Developer is learning Frontend Languages");
	}
	

}

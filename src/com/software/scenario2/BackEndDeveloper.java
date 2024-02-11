package com.software.scenario2;

public class BackEndDeveloper extends SoftwareEngineer {

	@Override
	void attendMeeting() {
		System.out.println("BackendDeveloper Attending the meeting");
		
	}
	//child Specific method
	void doBackEndproj()
	{
		System.out.println("BackendDeveloper is doing Backend Project");
	}
	

}

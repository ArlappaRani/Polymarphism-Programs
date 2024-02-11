package com.software.developers;

public class DevelopersApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating the objects of child classes and
	
		BackendDeveloper bd=new BackendDeveloper();
		FrontendDeveloper fd=new FrontendDeveloper();
        Software sf=new Software();
        sf.SoftwareDevoloper(bd);
        System.out.println("-----------------");
        sf.SoftwareDevoloper(fd);
        
	}

}

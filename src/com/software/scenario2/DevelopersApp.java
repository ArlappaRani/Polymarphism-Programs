package com.software.scenario2;

public class DevelopersApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating the child objects
		BackEndDeveloper bd=new BackEndDeveloper();
		FrontEndDeveloper fd=new FrontEndDeveloper();
		JavaDeveloper jd=new JavaDeveloper();
		PythonDeveloper pd=new PythonDeveloper();
		//creating the object of new class
		Developers dp=new Developers();
		dp.doActivity(bd);
		System.out.println("----------------------------------------");
        dp.doActivity(fd);
        System.out.println("----------------------------------------");
        dp.doActivity(jd);
        System.out.println("----------------------------------------");
        dp.doActivity(pd);
	}

}

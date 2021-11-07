package com.inheritance;

public class SingleMainClass {
	public static void main(String[] args) {
//		ParentClass pc=new ParentClass();
//		System.out.println("parent class object details");
//		pc.setName("Krishna");
//		pc.setAge(78);
//		System.out.println(pc.toString());
//		pc.car();
		ChildClass cc=new ChildClass();
		System.out.println("child class object details");
		cc.setName("Mahesh");
		cc.setAge(46);
		cc.setQualification("Actor");
		System.out.println("Name"+"  "+cc.getName()+"  "+"Age"+"  "+cc.getAge()+"  "+"Qualification"+"  "+cc.getQualification());
		cc.bike();
		System.out.println(" Ok dont worry ill take my parent car ");
		cc.setName("Krishna");
		System.out.println("Calling dad "+" "+cc.getName()+" "+"hello dad i want your car today");
		cc.car();
		System.out.println("now son able to drive car");

		
}
}

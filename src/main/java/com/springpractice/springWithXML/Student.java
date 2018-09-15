package com.springpractice.springWithXML;

public class Student {  
private String name; 
private String id; 
public String getId() {
	return id;
}
public void setId(String id) throws Exception {
	
	System.out.println("In Student setId");
	this.id = id;
	/*finally
	{
		System.out.println("Inside finally setId");
	}
	*/}
Student(){
	System.out.println("In Student Constructor");
	
}

Student( String id ,String name){
	
	System.out.println(" Arg constructor Constructor");
	this.name = name;
	this.id = id;
}
/*Student( String name){
	
	System.out.println(" Arg constructor Constructor");
	this.name = name;
}*/

public String getName() {  
    return name;  
}  
  
public void setName(String name) {
	System.out.println("In Student setName");
	
    this.name = name;
    
}  public void initIt() throws Exception {
    System.out.println("Init method after properties are set ");
  }

  public void cleanUp() throws Exception {
    System.out.println("Spring Container is destroy! Customer clean up");
  }
  
  public void destructor() throws Exception {
	    System.out.println("Spring Container is destroy! Customer clean up");
	  }
  @Override
  public void finalize() {
    System.out.println("Book instance is getting destroyed");
  }
  
public void displayInfo(){  
	  System.out.println("Hello: "+name +" id: " + id);  

	throw new IllegalArgumentException();
	
  }  
}
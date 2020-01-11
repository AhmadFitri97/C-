package Hospital;

public class Patient {
	private String name;
	private int Id;
	
public Patient(String name,int Id){
	this.name=name;
	this.Id=Id;
}
public void setName(String name){
	this.name=name;
	
}
public void setId(int Id){

	this.Id=Id;
}
public String getName(){
	return name;
}
public int getId(){
	return Id;
}
}

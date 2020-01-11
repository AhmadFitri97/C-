package Hospital;

public class Disease {
	private String nyakit;
	private String medicine;
	private double price; 

public Disease(String nyakit,String medicine,double price)
{
this.nyakit=nyakit;
this.medicine=medicine;
this.price=price;
}

public String getNyakit(){
	return nyakit;
}
public String getMedicine(){
	return medicine;
}
public double getprice(){
	return price;
}
public String toString(){
	return "/n"+nyakit+"/n"+medicine+"/n"+price;
}
}
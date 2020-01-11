package Hospital;
import java.util.Scanner;
public class Test_Hospital {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char ans;
		Disease [] disease=new Disease[7];
		disease[0]= new Disease("FEVER", "Tab. PCM (Panadol) 1000 Mg Tds X 3/7,", 10.30);
		disease[1]= new Disease("VOMITTING", "Tab. Prochlorperazine (Stemetil) 5 Mg Tds X 3/7", 15.00);
		disease[2]= new Disease("COUGH", "Eksp. Diphenhydramine Hcl (Benadryl) 10 Ml Tds X 3/7", 17.00);
		disease[3]= new Disease("HEADACHE","Cap. Mefenamic Acid (Ponstant) 250 Mg Tds X 3/7", 14.50);
		disease[4]= new Disease("CONJUNCTIVITIS", "Chloramphenicol 0.5% Eye Gutt Qid X 1/52", 16.50);
		disease[5]= new Disease("SORE THROAT", "Thymol Gargle", 5.00);
		disease[6]= new Disease("R/NOSE", "Tab. Chlorpheniraminen Maleate (Piriton) 4 Mg Tds X 3/7", 13.00);
		vitamin [] Vitamin = new vitamin[7]; 
		Vitamin[0]= new vitamin("THIAMIN (Vitamin B)");
		Vitamin[1]= new vitamin("RETINOL (TVitamin A)");
		Vitamin[2]= new vitamin("CALCIFEROL (Vitamin D)");
		Vitamin[3]= new vitamin("KUREUL (Vitamin C)");
		Vitamin[4]= new vitamin("ALDOMIUM (Vitamin E)");
		do{
			System.out.println("____________________________");
			System.out.println("^^ Welcome to Budi Clinic ^^");
			System.out.println("****************************");
			System.out.println("____________________________");
			System.out.println("Please Fill in the informations below :- ");
			System.out.println("____________________________");
			System.out.print("Enter Patient's Name : ");
			String name= input.nextLine();
			System.out.print("Enter Patient's Identification Number: ");
			int id=input.nextInt();
			Patient patient= new Patient(name,id);
			System.out.println("____________________________");
							
			option(patient,disease,Vitamin);
				
				
				
			System.out.println("Do you have other customers (y-Yes/n-NO): ");		
			ans = input.next().charAt(0);
		}while(ans=='y');
		
		
		
		
	}
	static void option(Patient patient,Disease [] disease,vitamin [] Vitamin)  // function body for option where to meet doctor and buy medicine
	{
		Scanner input = new Scanner(System.in);

		int ill, quan,correct;
		char awak;		
		System.out.println("Here we provided two options for you Mr/Mrs "+patient.getName());
		System.out.println("1. Buy our vitamin");
		System.out.println("2. Meet our doctors");
		System.out.println("Which option do you want to? : ");
		int option =input.nextInt();
		while(option<1 || option>2)
    	{
			System.out.println("Please enter again : ");
			option =input.nextInt();
		} 
		if(option==1)
		{
			int want;
			System.out.println("Welcome to Our Pharmacy");
		    
			System.out.println("***********************");
			System.out.println("Here we have a few medicine that you can buy :");
		    
		    for (int j=0; j<5; j++)
		    {
		    	System.out.println(Vitamin[j].getVitamin());
		    }
		    System.out.println("______________________________________________");
		    vitamins(Vitamin);       // call function vitamin to display the quantiy and price for the vitamin
		    
		    
		    confirm(patient);
		    
		}
		else
		{
			String [] doctor = {"Dr. Azman","Dr. Nathan","Dr. Lee","Dr. Niesa","Dr Haisya"};
		   
			System.out.println("Welcome to Our Clinic");
			System.out.println("***********************");
		    int um=(int)(Math.random() *(5));
		    System.out.println("Please go to room ");
		    System.out.println("Your doctor is "+doctor[um-1]);
		    System.out.println("Please wait for your turn . Thank You.");

		
		    System.out.println("These are few disease :");
	        for(int i=0; i<7; i++)
	        {
	        	System.out.println(i+1+"."+disease[i].getNyakit());
	        }
	    do
		{
	    	System.out.println("Please enter your patient's illness : ");
	        ill =input.nextInt();
	    } while(ill<1 || ill>7);
	    switch(ill)
	    {
	    case 1:displayDisease( disease,ill,patient);
	    	break;
	    case 2:displayDisease( disease,ill,patient);
	    	break;
	    case 3:displayDisease( disease,ill,patient);
	    	break;
	    case 4:displayDisease( disease,ill,patient);
	    	break;
	    case 5:displayDisease( disease,ill,patient);
	    	break;
	    case 6:displayDisease( disease,ill,patient);
	    	break;
	    case 7:displayDisease( disease,ill,patient);
	    	break;
	    	
	    }
		}
	}
	static void displayDisease(Disease [] disease,int ill,Patient patient)
	{
		
		System.out.println("\n\n*************************************");
		System.out.println("   Brought this slip to Pharmacist   ");	
		System.out.println("This Patient get "+disease[ill-1].getNyakit());
		System.out.println("Give the right medicine for him/her.");
		System.out.println("*************************************");
		System.out.println("Welcome to Our Pharmacy");
		System.out.println("***********************");
		System.out.println("Dear "+ patient.getName() +",please take your medicine.");
		System.out.println("* "+disease[ill-1].getMedicine());
		System.out.println("The price for your medicine is RM "+disease[ill-1].getprice());
		System.out.println("*****************************************");
	    confirm(patient);

	}
	static void confirm(Patient patient) // function for confirmation the patient's data

	{
			
			
			System.out.println("______________________________");
			System.out.println("CONFIRMATION OF PATIENT'S DATA");
			System.out.println("______________________________");
			System.out.println("Thanks again MR/MRS "+patient.getClass()+" for using our services");
			System.out.println("For our record, we need to check your information before you leave.\n");
			System.out.println("Patient's Name : "+patient.getName());
			System.out.println("Patient's Identification Number : "+patient.getId());
		    
		    
		    System.out.println("Is it your Identification Number is correct (1-Yes/2-No) : ");
		    Scanner input = new Scanner(System.in);
		    int correct=input.nextInt();
	    	while(correct<1 || correct >2)
	    	{
	    		System.out.println("Please enter again : ");
	    		correct=input.nextInt();
			}
	         
	        switch (correct)
	        {
	        	case 1:
	        		System.out.println("Okey, Thank you Mr/Mrs "+patient.getName());
	        		break;
	    
	    		case 2:
	    			System.out.println("Okey, Please enter again correctly: ");
	    			int ic=input.nextInt();
	    			patient.setId(ic);
	        		System.out.println("__________________________________________________________________");
	        		
	        		System.out.println("For our record, we need to check your information before you leave.\n");
	    			System.out.println("Patient's Name : "+patient.getName());
	    			System.out.println("Patient's Identification Number : "+patient.getId());
	        		break;
	        
			}
	        System.out.println("Thanks for coming !");
	        System.out.println("_________________________________________");
	}
	static void vitamins(vitamin[] vitamin)  // function body for buying medicine
	{
		Scanner input = new Scanner(System.in);

	    int want[]= new int[100];
		int qnty[]=new int[100];
		int kong=0;
		float Total=0;
		char again;
		
		do
		{
			System.out.println("Which medicine you want ?: ");
		    want[kong]= input.nextInt();
		    while(want[kong]<1 || want[kong] >5)
	    	{
		    	System.out.println("Please enter again : ");
		    	want[kong]= input.nextInt();
			}
		
		    System.out.println("How many did you want :");
		    qnty[kong]= input.nextInt();
		   
		
		    System.out.println("Do you want to buy anything else (no = n , yes = y) : ");
		    again = input.next().charAt(0);
		    

		    kong++;
		
		} while ( again == 'y');
		
		System.out.println( "You bought : " );
		
		for(int i=0; i<kong; i++)
		{
		    switch(want[i])
		    {
		        case 1 :
		        	System.out.println( qnty[i] + " Vitamin B");
			        Total+=qnty[i] * 13.20;
					break;
					
		        case 2 :
		        	System.out.println(qnty[i] + " Vitamin A");
			        Total+=qnty[i] * 10.20;
					break;
					
		        case 3 :
		        	System.out.println( qnty[i]+ " Vitamin D");
			        Total+=qnty[i] *36.20;
					break;
					
		        case 4 : 
		        	System.out.println(qnty[i]+" Vitamin C");
			        Total+=qnty[i] *15.00;
			        break;
			
		        case 5 : 
		        	System.out.println(qnty[i] +" Vitamin E");
			        Total+=qnty[i] * 17.40;
		            break;
			}
		}
		System.out.println("The total Price is RM " +Total);
	
	}	
}

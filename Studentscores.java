package userinput;

import java.util.*;	 
	public class Studentscores {
	 
	 public static void main(String[] args) {
	 
		 // variable declaration 
		 
		    List<Integer> Grades= new ArrayList<Integer>();
	        String userResponse = "Yes";
	        try (Scanner sc = new Scanner(System.in)) {
			try (Scanner Option = new Scanner(System.in)) {
			while (!userResponse.equals("no")){	
				System.out.println("Hello Please enter a grade:");
			Grades.add(sc.nextInt());
				System.out.println("Do you like to enter another grade Yes/No:");
			userResponse = Option.next().toLowerCase();
					   }
				}
			}
	       
	       Collections.sort(Grades);
	       
	       int lastItem = Grades.get(Grades.size()-1);
			System.out.println("Highest Score : " +lastItem);
	    	System.out.println("Lowest Score :" +Grades.get(0));
	    	   
	    	   
	    	   int Total= 0;
	    	   int A = 0;
	    	   int B = 0;
	    	   int C = 0;
	    	   int F = 0;
	    	  
	    	   for (int i=0; i<Grades.size();i++) {
	    		   Total = Total+Grades.get(i);
	    		   
	    	   if(Grades.get(i) >=90)
		         A++;  
	    	   else if(Grades.get(i) >=80)
	    		 B++;
	           else if(Grades.get(i)>70)
	             C++;
	           else if(Grades.get(i)<69)
	             F++;
	    	   
	
	       }
	    	   
	    	   System.out.println("The Average Score for the class is : " +Total/Grades.size());
	    	   System.out.println("A Students : " +A);
	    	   System.out.println("B Students : " +B);
	    	   System.out.println("C Students : " +C);
	    	   System.out.println("F Students : " +F);
	    	   System.out.println("Thank You!");
	    	   
	 }
	}

	

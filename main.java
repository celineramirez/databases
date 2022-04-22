//package databases;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int option = 0;
				
		while (option != 6) {
		System.out.println("Please make a number selection:\n	 ");
		System.out.println("1 Add a student, department, course, or course section ");
		System.out.println("2 Add students to a course");
		System.out.println("3 Generate a grade report ");
		System.out.println("4 Find offered couses ");
		System.out.println("5 Add a grade ");
		System.out.println("6 Exit ");
		option = sc.nextInt();
		
	
		 
		switch(option) {
	    case 1:
	    	System.out.println("Option 1 selected");
	    	// insert student, dept, course, section
	    	System.out.println("Insert:\n1)Student\n2)Department\n3)Course\n4)Section");
	    	int select = sc.nextInt();
	        switch(select) {
	        case 1:
		    	System.out.println("Please input student information:");
	        	//student(pstmt, conn);
	        	break;
	        case 2:
	        	System.out.println("Please input department information:");
	        	//department(pstmt,conn);
	        	break;
	        case 3:
	        	System.out.println("Please input course information:");
	        	//course(pstmt,conn);
	        	break;
	        case 4:
	        	System.out.println("Please input section information:");
	        	//section(pstmt,conn);
	        	break;
	        }
	    	break; 
	    case 2:
	    	System.out.println("Option 2 selected");
	    	System.out.println("Please input enrollment information:");
	    	//insert enrolled
	    	//enrolled(pstmt,conn);
	    	break;
	    case 3:
	    	System.out.println("Option 3 selected");
	    	// select for student grade report
	    	
	    	break;
	    case 4:
	    	System.out.println("Option 4 selected");
	    	// select for courses
	    	
	    	break;
	    case 5:
	    	System.out.println("Option 5 selected");
	    	System.out.println("Please input grade report information:");
	    	// insert for grade report
	    	//gradereport(pstmt,conn);
	    	break;
	    case 6:
	    	System.out.println("Exiting and closing connections");
	    	//conn.close();
	    	break;
			}
		}
		
	}
}



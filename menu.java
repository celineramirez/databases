
import java.util.Scanner;
import java.sql.*;
import java.io.*;  

class menu
{
  public static void main (String args [])
       throws SQLException
  {

      System.out.print("userid: ");
      String uid;
      uid = getString();

      System.out.print("password: ");
      String pword;
      pword = getString();

      String url = "jdbc:oracle:thin:@cisvm-oracle.unfcsd.unf.edu:1521:orcl";
    // Load the Oracle JDBC driver
    DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

    // Connect to the database
    Connection conn =
      DriverManager.getConnection (url, uid, pword);
		Scanner sc = new Scanner(System.in);
		int option = 0;
				
		while (option != 9) {
		System.out.println("Please make a number selection:\n	 ");
		System.out.println("1 Add a student record ");
		System.out.println("2 Add a department");
		System.out.println("3 Add a course");
		System.out.println("4 Add a course section ");
		System.out.println("5 Add students to a course");
		System.out.println("6 Generate a grade report ");
		System.out.println("7 Find offered couses ");
		System.out.println("8 Add a grade ");
		System.out.println("9 Exit "); 
		option = sc.nextInt(); 
		
	
		 
		switch(option) {
	    case 1:
	    	System.out.println("Option 1 selected");
	    	
	    	
	 
		    	System.out.println("Please input student information:");
		    	PreparedStatement
			    pstmt = conn.prepareStatement ("INSERT INTO STUDENT(Fname, MI, Lname, Ssn, Nnumber, Birthdate, Sex, Degree, Current_Address, Current_Phone, Perm_Address, Perm_Phone, City, State, Zip, Major, Minor) " +
			  	      "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?)");
		    	
			  	      System.out.println("\nEnter first Name: ");
			  	      String Fname = getString();
			  	      System.out.println("\nEnter middle initial: ");
			  	      String MI = getString();
			  	      System.out.println("\nEnter last name: ");
			  	      String Lname = getString();   //the date is read as a String object in the specified format
			  	      System.out.println("\nEnter SSN ");
			  	      int Ssn = getInt();
			  	      System.out.println("\nEnter Nnumber: ");
			  	      String Nnumber = getString();
			  	      System.out.println("\nEnter date of birthday: ");
			  	      String Birthdate = getString();
			  	      System.out.println("\nEnter sex: "); //Must be a fraction ( <1.0 )
			  	      String Sex = getString();
			  	      System.out.println("\nEnter degree: ");
			  	      String Degree = getString();
			  	      System.out.println("\nEnter current address: ");
			  	      String Current_Address = getString();
			  	      System.out.println("\nEnter current phone number: ");
			  	      String Current_Phone = getString();
			  	      System.out.println("\nEnter permanent address ");
			  	      String Perm_Address = getString();
			  	      System.out.println("\nEnter permanent phone number: ");
			  	      String Perm_Phone = getString();
			  	      System.out.println("\nEnter city: ");
			  	      String City = getString();
			  	      System.out.println("\nEnter state:");
			  	      String State = getString();
			  	      System.out.println("\nEnter zip:");
			  	      int Zip = getInt();
			  	      System.out.println("\nEnter major:");
			  	      String Major = getString();
			  	      System.out.println("\nEnter minor:");
			  	      String Minor = getString();
			  	      
			  	      
			  	pstmt.setString(1, Fname);
			  	pstmt.setString(2, MI);
			  	pstmt.setString(3, Lname);
			  	pstmt.setInt(4, Ssn);
			  	pstmt.setString(5, Nnumber);
			  	pstmt.setString(6, Birthdate);
			  	pstmt.setString(7, Sex);      
			  	pstmt.setString(8, Degree);  
			  	pstmt.setString(9, Current_Address);
			  	pstmt.setString(10, Current_Phone);
			  	pstmt.setString(11, Perm_Address);
			  	pstmt.setString(12, Perm_Phone);
			  	pstmt.setString(13, City); 
			  	pstmt.setString(14, State);
			  	pstmt.setInt(15, Zip);        	
			  	pstmt.setString(16, Major);
			  	pstmt.setString(17, Minor); 
			  	int NumRows = pstmt.executeUpdate();
    	  	     System.out.println("\n" + NumRows + " row(s) inserted");
 
	        	break;
	        case 2:
	        	System.out.println("Please input department information:");
	        	PreparedStatement pstmt2 =
	          	      conn.prepareStatement ("INSERT INTO DEPARTMENT(Department_Code, Dname, College, Office_phone, Office_number) " +
	          	      "VALUES (?, ?, ?, ?, ?)");

	          	    
	          	      System.out.println("\nEnter department code: ");
	          	      String dcode = getString();
	          	      System.out.println("\nEnter department name: ");
	          	      String dname = getString();
	          	      System.out.println("\nEnter college ");
	          	      String college = getString();   
	          	      System.out.println("\nEnter office phone: ");
	          	      String phonenum = getString();
	          	      System.out.println("\nEnter office number: ");
	          	      int officenum = getInt();

	          	      pstmt2.setString(1, dcode);
	          	      pstmt2.setString(2, dname);
	          	      pstmt2.setString(3, college);
	          	      pstmt2.setString(4, phonenum);
	          	      pstmt2.setInt(5, officenum);
	      	  	     
	      	  	      int NumRows2 = pstmt2.executeUpdate();
	      	  	      System.out.println("\n" + NumRows2 + " row(s) inserted");
	     	  	      break;
	          	    
	        case 3:
	        	System.out.println("Please input course information:");
	        	PreparedStatement pstmt3 =
	  	      	      conn.prepareStatement ("INSERT INTO COURSE(Department_code, Course_number, cName, cLevel, Description, Semester_hours) " +
	  	      	      "VALUES (?, ?, ?, ?, ?, ?)");

	  	      	
	  	      	      System.out.println("\nEnter department code: ");
	  	      	      String dcode2 = getString();
	  	      	      System.out.println("\nEnter course number: ");
	  	      	      int coursenum = getInt();

	  	      	      System.out.println("\nEnter course name ");
	  	      	      String cName = getString();
	  	      	      System.out.println("\nEnter course level: ");
	  	      	      int clevel = getInt();
	  	      	      System.out.println("\nEnter description: ");
	  	      	      String desc = getString();
	  	      	      System.out.println("\nEnter semester hours: ");
	  	      	      String hours = getString();

	  	      	      pstmt3.setString(1, dcode2);
	  	      	      pstmt3.setInt(2, coursenum);
	  	      	      pstmt3.setString(3, cName);
	  	      	      pstmt3.setInt(4, clevel);
	  	      	      pstmt3.setString(5, desc);
	  	      	      pstmt3.setString(6, hours);
	  	      	  int NumRows3 = pstmt3.executeUpdate();
		  	      System.out.println("\n" + NumRows3 + " row(s) inserted");
	  	      	    
	        	break;
	        case 4:
	        	System.out.println("Please input section information:");
	        	PreparedStatement pstmt4 =
		          	      conn.prepareStatement ("INSERT INTO SECTION(Section_number, Course_number, Instructor, Semester, sYear) " +
		          	      "VALUES (?, ?, ?, ?, ?)");

		          	      System.out.println("\nEnter section number: "); 
		          	      int sect_num = getInt();
		          	      System.out.println("\nEnter course number: ");
		          	      int course_num = getInt();
		          	      System.out.println("\nEnter instructor: ");
		          	      String instructor = getString();
		          	      System.out.println("\nEnter semester ");
		          	      String semester = getString();
		          	      System.out.println("\nEnter semester year: ");
		          	      int sem_year = getInt();
		          	      
		          	      pstmt4.setInt(1, sect_num);
		          	      pstmt4.setInt(2, course_num);
		          	      pstmt4.setString(3, instructor);
		          	      pstmt4.setString(4, semester);
		          	      pstmt4.setInt(5, sem_year);
		          	    int NumRows4 = pstmt4.executeUpdate();
		  	  	      System.out.println("\n" + NumRows4 + " row(s) inserted");
		          	    
	        
	        
	    	break; 
			  	    
	    case 5:
	    	System.out.println("Option 5 selected");
	    	System.out.println("Please input enrollment information:");
	    	//insert enrolled
	    	PreparedStatement pstmt5 =
        	          conn.prepareStatement ("INSERT INTO Enrolled (Nnumber, Course_number, Section_number) " +
        	          "VALUES (?, ?, ?)");

        	        
        	          System.out.println("\nEnter Nnumber: "); 
        	          String Nnumber2 = getString();
        	          System.out.println("\nEnter course number: ");
        	          int Course_number  = getInt();
        	          System.out.println("\nEnter section Number: ");
        	          int Section_number  = getInt();
        	          
        	          pstmt5.setString(1, Nnumber2);
        	          pstmt5.setInt(2, Course_number );
        	          pstmt5.setInt(3, Section_number);
        	          int NumRows6 = pstmt5.executeUpdate();
        	  	      System.out.println("\n" + NumRows6 + " row(s) inserted");
        	        
	    	break;
	    case 6:
	    	System.out.println("Option 6 selected");
	    	// select for student grade report
	    	String q = "SELECT * " + 
	    		  	"FROM Grade_Report " + 
	    		  	"WHERE Nnumber =  + ?";
	        
	        PreparedStatement pstmt6 =
	        	      conn.prepareStatement (q);
	        
	        System.out.println("\nEnter Nnumber for student");
	        String N = getString();
	        pstmt6.setString(1, N);

	          ResultSet rset = pstmt6.executeQuery();

	          // Display result
	          while (rset.next ()) {
	            String Nnumber1 = rset.getString("Nnumber");
	            int Section_number1  = rset.getInt("Section_number");
	            int Course_number1  = rset.getInt("Course_number");
	            String Letter = rset.getString("Letter");   
	            int Grade = rset.getInt("Grade");
	            System.out.println ("Nnumber:" + Nnumber1 + "\nSection number:" + Section_number1 + "\nCourse number:" + 
	            		Course_number1 + "\nLetter grade:" + Letter + "\nGrade:" + Grade );
	          }
	    	break;
	    case 7:
	    	System.out.println("Option 7 selected");
	    	// select for courses
	    	String q2 = "SELECT * " + 
	      		  	"FROM Course " + 
	      		  	"WHERE Department_Code =  + ?";
	          
	          PreparedStatement pstmt7 =
	          	      conn.prepareStatement (q2);  
	          
	          System.out.println("\nEnter depatment number to display all courses offered");
	          String course = getString();
	          pstmt7.setString(1, course);

	            ResultSet rset2 = pstmt7.executeQuery();

	            // Display result
	            while (rset2.next ()) {
	          	  String Department_code = rset2.getString("Department_code");
	                int Course_number2  = rset2.getInt("Course_number");
	                String cName2 = rset2.getString("cName");
	                int cLevel = rset2.getInt("cLevel");   
	                String Description = rset2.getString("Description");
	                int Semester_hours  = rset2.getInt("Semester_hours");
	                System.out.println ("Department number:" + Department_code + "\nCourse number:" + Course_number2 + "\nCourse name:" + 
	                		cName2 + "\nLevel:" + cLevel + "\nDescription:" + Description + "\nSemester hours:" + Semester_hours);
	            }
	    	break;
	    case 8:
	    	System.out.println("Option 5 selected");
	    	System.out.println("Please input grade report information:");
	    	// insert for grade report
	    	PreparedStatement pstmt8 =
            	      conn.prepareStatement ("INSERT INTO GRADE_REPORT(Nnumber, section_number, course_number, letter, grade) " +
            	      "VALUES (?, ?, ?, ?, ?)");

            	    
            	      System.out.println("\nEnter Nnumber: ");
            	      String nnumber = getString(); 
            	      System.out.println("\nEnter section number: ");
            	      int sectionnum = getInt();
            	      System.out.println("\nEnter course number: ");
            	      int coursenum2 = getInt();
            	      System.out.println("\nEnter letter grade");
            	      String letter = getString();
            	      System.out.println("\nEnter student grade: ");
            	      int grade = getInt(); 
            	     
            	      pstmt8.setString(1, nnumber);
            	      pstmt8.setInt(2, sectionnum);
            	      pstmt8.setInt(3, coursenum2);
            	      pstmt8.setString(4, letter);
            	      pstmt8.setInt(5, grade);
            	      int NumRows5 = pstmt8.executeUpdate();
        	  	      System.out.println("\n" + NumRows5 + " row(s) inserted");
            	    
	    	break;
	    case 9:
	    	System.out.println("Exiting and closing connections");
	    	conn.close();
	    	break;
			}
		}
		
	}


	          	    public static String getString() {
	          	    	try {
	          	    	    StringBuffer buffer = new StringBuffer();
	          	    	    int c = System.in.read();
	          	    	    while (c != '\n' && c != -1) {
	          	    		  buffer.append((char)c);
	          	    		  c = System.in.read();
	          	    	    }
	          	    	    return buffer.toString().trim();
	          	    	}
	          	    	catch (IOException e){return "";}
	          	        }

	          	      public static int getInt() 

	          	      {
	          	          String s= getString();
	          	          return Integer.parseInt(s);
	          	      }

	          	      public static float getFloat() 

	          	      {
	          	          String s= getString();
	          	          return Float.parseFloat(s);
	          	      }
	          	    } 
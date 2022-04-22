import java.sql.*;
import java.io.*;  

class Example1
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

    // Prepare to insert new products in the student
   PreparedStatement
	    pstmt = conn.prepareStatement ("INSERT INTO STUDENT(Fname, MI, Lname, Ssn, Nnumber, Birthdate, Sex, Degree, Current_Address, Current_Phone, Perm_Address, Perm_Phone, City, State, Zip, Major, Minor) " +
	  	      "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?)");

	  	    int done = 1;

	  	    while (done != 0) {
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

	  	      System.out.println("\nHit 0 for exit, " +
	  		     "or enter any other number for another insert: ");
	  	      done = getInt();
	  	      } // while done
	  	    conn.close();
	}// student
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
    } // Example5


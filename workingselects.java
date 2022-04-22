import java.sql.PreparedStatement;
import java.sql.ResultSet;

String q = "SELECT * " + 
		  	"FROM Grade_Report " + 
		  	"WHERE Nnumber =  + ?";
    
    PreparedStatement pstmt =
    	      conn.prepareStatement (q);
    
    System.out.println("\nEnter Nnumber for student");
    String N = getString();
    pstmt.setString(1, N);

      ResultSet rset = pstmt.executeQuery();

      // Display result
      while (rset.next ()) {
        String Nnumber = rset.getString("Nnumber");
        int Section_number  = rset.getInt("Section_number");
        int Course_number  = rset.getInt("Course_number");
        String Letter = rset.getString("Letter");   
        int Grade = rset.getInt("Grade");
        System.out.println ("Nnumber:" + Nnumber + "\nSection number:" + Section_number + "\nCourse number:" + 
        		Course_number + "\nLetter grade:" + Letter + "\nGrade:" + Grade + ":" );
      }
   
      
      String q = "SELECT * " + 
  		  	"FROM Course " + 
  		  	"WHERE Department_Code =  + ?";
      
      PreparedStatement pstmt =
      	      conn.prepareStatement (q); 
      
      System.out.println("\nEnter depatment number to display all courses offered");
      String N = getString();
      pstmt.setString(1, N);

        ResultSet rset = pstmt.executeQuery();

        // Display result
        while (rset.next ()) {
      	  String Department_code = rset.getString("Department_code");
            int Course_number  = rset.getInt("Course_number");
            String cName = rset.getString("cName");
            int cLevel = rset.getInt("cLevel");   
            String Description = rset.getString("Description");
            int Semester_hours  = rset.getInt("Semester_hours");
            System.out.println ("Department number:" + Department_code + "\nCourse number:" + Course_number + "\nCourse name:" + 
            		cName + "\nLevel:" + cLevel + "\nDescription:" + Description + "\nSemester hours:" + Semester_hours);
        }
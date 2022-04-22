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


PreparedStatement pstmt =
    	      conn.prepareStatement ("INSERT INTO DEPARTMENT(Department_Code, Dname, College, Office_phone, Office_number) " +
    	      "VALUES (?, ?, ?, ?, ?)");

    	    int done = 1;

    	    while (done != 0) {
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

    	      pstmt.setString(1, dcode);
    	      pstmt.setString(2, dname);
    	      pstmt.setString(3, college);
    	      pstmt.setString(4, phonenum);
    	      pstmt.setInt(5, officenum);
	  	     
	  	      int NumRows = pstmt.executeUpdate();
	  	      System.out.println("\n" + NumRows + " row(s) inserted");

	  	    PreparedStatement pstmt =
	      	      conn.prepareStatement ("INSERT INTO COURSE(Department_code, Course_number, cName, cLevel, Description, Semester_hours) " +
	      	      "VALUES (?, ?, ?, ?, ?, ?)");

	      	    int done = 1;

	      	    while (done != 0) {
	      	      System.out.println("\nEnter department code: ");
	      	      String dcode = getString();
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

	      	      pstmt.setString(1, dcode);
	      	      pstmt.setInt(2, coursenum);
	      	      pstmt.setString(3, cName);
	      	      pstmt.setInt(4, clevel);
	      	      pstmt.setString(5, desc);
	      	      pstmt.setString(6, hours);
	      	      
	      	    PreparedStatement pstmt =
	          	      conn.prepareStatement ("INSERT INTO SECTION(Section_number, Course_number, Instructor, Semester, sYear) " +
	          	      "VALUES (?, ?, ?, ?, ?)");

	          	    int done = 1;

	          	    while (done != 0) {
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
	          	      
	          	      pstmt.setInt(1, sect_num);
	          	      pstmt.setInt(2, course_num);
	          	      pstmt.setString(3, instructor);
	          	      pstmt.setString(4, semester);
	          	      pstmt.setInt(5, sem_year);
	          	      
	          	    PreparedStatement pstmt =
	              	      conn.prepareStatement ("INSERT INTO GRADE_REPORT(Nnumber, section_number, course_number, letter, grade) " +
	              	      "VALUES (?, ?, ?, ?, ?)");

	              	    int done = 1;

	              	    while (done != 0) {
	              	      System.out.println("\nEnter Nnumber: ");
	              	      String nnumber = getString(); 
	              	      System.out.println("\nEnter section number: ");
	              	      int sectionnum = getInt();
	              	      System.out.println("\nEnter course number: ");
	              	      int coursenum = getInt();
	              	      System.out.println("\nEnter letter grade");
	              	      String letter = getString();
	              	      System.out.println("\nEnter student grade: ");
	              	      int grade = getInt(); 
	              	     
	              	      pstmt.setString(1, nnumber);
	              	      pstmt.setInt(2, sectionnum);
	              	      pstmt.setInt(3, coursenum);
	              	      pstmt.setString(4, letter);
	              	      pstmt.setInt(5, grade);
	              	      
	              	    PreparedStatement pstmt =
	              	          conn.prepareStatement ("INSERT INTO Enrolled (Nnumber, Course_number, Section_number) " +
	              	          "VALUES (?, ?, ?)");

	              	        int done = 1;

	              	        while (done != 0) {
	              	          System.out.println("\nEnter Nnumber: "); 
	              	          String Nnumber = getString();
	              	          System.out.println("\nEnter course number: ");
	              	          int Course_number  = getInt();
	              	          System.out.println("\nEnter section Number: ");
	              	          int Section_number  = getInt();
	              	          
	              	          pstmt.setString(1, Nnumber);
	              	          pstmt.setInt(2, Course_number );
	              	          pstmt.setInt(3, Section_number);
	          	      
	  	     
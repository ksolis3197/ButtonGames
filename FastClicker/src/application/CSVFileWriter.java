package application;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVWriter 
{
  private static final String COMMA = ",";
  private static final String NL_SEPERATOR = "\n";
  
  private static final String HEADER = "Name, High Score";
  
  @SuppressWarnings({ "rawtypes", "unchecked" })
public static void writeCSVFile(String fileName)
  {
	  User user1 = new User("Devin",1);
	  User user2 = new User("Madison", 3);
	  
	  List users = new ArrayList();
	  
	  users.add(user1);
	  users.add(user2);
	  
	  FileWriter fileWriter = null;
	  
	  try
	  {
		  fileWriter = new FileWriter(fileName);
		  fileWriter.append(HEADER.toString());
		  
		  fileWriter.append(NL_SEPERATOR);
		  
		  
		  for (User user:users)
		  {
			  fileWriter.append(String.valueOf(user.getUserName()));
			  fileWriter.append(COMMA);
			  User score;
			fileWriter.append(String.valueOf(score.getScore()));
			  fileWriter.append(COMMA);		  
		  }
		  
		  
          System.out.println("CSV file was created successfully !!!");

		  } catch (Exception e) 
	  
	  	{
		
		      System.out.println("Error in CsvFileWriter !!!");
		
		      e.printStackTrace();
		
		  } finally {
		
		      try {
		
		          fileWriter.flush();
		
		          fileWriter.close();
		
		      } catch (IOException e) {
		       System.out.println("Error while flushing/closing fileWriter !!!");
		       e.printStackTrace();
		
		      }
		
			  }
			  
  }
  
}

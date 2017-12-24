package Names;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadNames extends Main{
	
	static StringBuffer tempNames = new StringBuffer();
	
	 
	 public static void getNames() throws IOException, FileNotFoundException{
		int indexnum1 = 0;
		int indexnum2 = 0;
		String line = null;
		String subName;
		int indexcount = 1;
		 String fileName = "C:\\Eclipse\\NamesList.txt";
		 BufferedReader bufferedReader = null;
		 try{
		 FileReader fileNames = new FileReader(fileName);
		 
		 bufferedReader = new BufferedReader(fileNames);
		 
		 while ((line = bufferedReader.readLine()) != null) {
			// System.out.println(line);
			 //System.out.println(indexcount);
			// Main.addPerson();
			 indexcount = 1;
			 tempNames.setLength(0);
			 tempNames.append(line);
			 indexnum1 = 0;
		 while(indexnum1 != -1){
			 //System.out.println(indexnum1);
			 indexnum2 = indexnum1;
			 indexnum1 = tempNames.indexOf(" ", indexnum2);
			
			if(indexnum1 != -1){
				// subName.setLength(0);
				 subName = (tempNames.substring(indexnum2, indexnum1));
				//Main.names = subName;
				 addName(subName, indexcount);
				 indexcount++;
				 indexnum1++;
			}else if(indexnum1 == -1){
			subName = (tempNames.substring(indexnum2));
			addName(subName, indexcount);
				 addToArray(indexcount);
			 } 
			//System.out.println(subName);
		 }
             
         }   
		 
	 }catch(FileNotFoundException e){
		 System.out.println("Unable to find file");
	 }
	catch(IOException e){
		System.out.println("Error reading file");
	}finally{
		bufferedReader.close();
	}
	 }
}

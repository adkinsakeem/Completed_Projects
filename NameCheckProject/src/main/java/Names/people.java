package Names;

public class people {
	

	public String[] Names = new String[10];
	
	int nameSize = 0;
	
	
	public void addInfo(String n1, String n2, String n3, String n4, String n5,
			String n6, String n7, String n8, String n9, String n10, int indexcount){
		
	
		
		Names[0] = n1;
		Names[1] = n2;
		Names[2] = n3;
		Names[3] = n4;
		Names[4] = n5;
		Names[5] = n6;
		Names[6] = n7;
		Names[7] = n8;
		Names[8] = n9;
		Names[9] = n10;
		
		nameSize = indexcount;
	}

}

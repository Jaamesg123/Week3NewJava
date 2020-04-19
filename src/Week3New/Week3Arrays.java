package Week3New;

public class Week3Arrays {
	
	public static void main (String[] args) {
	 
	int[] ages = new int[9];
	
	ages[0] = 3;
	ages[1] = 9;
	ages[2] = 23;
	ages[3] = 64;
	ages[4] = 2;
	ages[5] = 8;
	ages[6] = 28;
	ages[7] = 93;
	ages[8] = 104;
	
	
	int ageSum = 0;
	
	for (int i = 0; i < ages.length; i++) {
		
		ageSum = ageSum + ages[i];

	}
					
		System.out.println(ageSum / ages.length);
		
	String[] names = new String[7];
	
	names[0] = "Sam";
	names[1] = "Tommy";
	names[2] = "Tim";
	names[3] = "Sally";
	names[4] = "Buck";
	names[5] = "Bob";
	names[6] = "Dick";
	
		
	System.out.println(names[names.length - (names.length)]);
	
	int nameLength = 0;
	String space = " ";
	
	for (int i = 0; i < names.length; i++ ) {
		 
		nameLength += names[i].length();
		
			
		System.out.println(names[i]);
	}
	
	System.out.println(nameLength / names.length);
	
	String newNameLength = ""; 	
	
	for (int i = 0; i < names.length; i++ ) {
		
	newNameLength += names[i].concat(space);	
	if ( i > (names.length -2))
	System.out.println(newNameLength);
	
	
		} int[] nameLengths = new int[7];
		
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(nameLengths[i] + names[i].length()); 
			
		
		}
		 
		for (int i = 0; i < nameLengths.length; i++) {
			
			if (i >= nameLengths.length - 1)
			System.out.println(nameLength);
			
			

			
		}
		
		
		
		}
		 
}
	


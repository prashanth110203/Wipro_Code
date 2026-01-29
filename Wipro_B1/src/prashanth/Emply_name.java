package prashanth;

public class Emply_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String array[]= {"Renu sai ", "Akhil kumar ", "John doe ", "Meera "};
	for ( int i=0; i< array.length; i++) {
		String name = array[i];
		System.out.print("Employee: " +name);
		if(name.length() >10) {
			System.out.println("Long Name");
		}
		else if(!name.contains(" ")) {
			System.out.println("Single Word Name");
		}
		else {
			System.out.println("Normal Name");
		}
		 System.out.println("UPPER: " +name.toUpperCase());
		 StringBuffer rev= new StringBuffer(name);
		 System.out.println("REVERSE: " +rev.reverse());
		 StringBuilder app= new StringBuilder(name);
		 System.out.println("APPENDED: " +app.append("-verified"));
		
	}
 
	}
 
}
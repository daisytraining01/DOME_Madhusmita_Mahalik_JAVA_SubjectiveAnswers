public class RemoveCharFromString {

	public static void main(String[] args) {
		
		System.out.println (removeCharInString ("REST ASSURED",  'S' , 'T'));
	    
    }

   public static String removeCharInString (String string, char charToBeRemoved, char c) {

     if (string == null)
          return "";

    
 	    StringBuilder strBuild = new StringBuilder ();

     for (int i = 0; i < string.length (); i++) {
         char chr = string.charAt (i);
         if (chr == charToBeRemoved)
             continue;
         strBuild.append (chr);
     }
     return strBuild.toString ();
 }
}
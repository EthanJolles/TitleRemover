public class Main {

    public static void main(String[] args)
    {
	String name1  = "Mr. John Smith";
	String name2 = "Ms. Nancy Wheeler";
	String name3 = "Prof. Susan Johnson";
    System.out.println(titleRemover(name1));
    System.out.println(titleRemover(name2));
    System.out.println(titleRemover(name3));
    }

    public static String titleRemover(String name)
    {
    int position = name.indexOf(' '); //Find location of first whitespace
    position++; //Increment by one so that I'm not left with a space
    int length = name.length(); //Find the length of the string
    return name.substring(position, length); //Return the characters between the whitespace+1 and my total length
    }
}

package test;
import java.util.ArrayList;
public class ArraylistExample 
{
	public static void main(String[] args) 
    {
    ArrayList<String> listOfNames = new ArrayList<String>();
    listOfNames.add("QA");
    listOfNames.add("BY");
    listOfNames.add("WEB");
        
    ArrayList<String> listOfNames2 = new ArrayList<String>();
    listOfNames2.add("NEW");
    listOfNames2.add("LIST");
    
    listOfNames.addAll(1, listOfNames2);
        
    for(String name : listOfNames)
    {
        System.out.println("Names from list = "+name);
    }
}
}
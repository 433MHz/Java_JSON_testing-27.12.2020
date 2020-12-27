package pl.krystian.JSON_parse_excersise;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Gson g = new Gson();
    	Employee emp = new Employee();
    	emp.setFirst_name("Krystian");
    	emp.setLast_name("Izdebski");
    	emp.setAge(21);
    	
    	String json = g.toJson(emp);
    	
    	System.out.println(json);
    }
}

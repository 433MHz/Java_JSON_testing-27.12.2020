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
    	
    	
    	Employee emp2 = new Employee();
    	
    	
    	emp2 = g.fromJson(json, Employee.class);
    	
    	System.out.println(emp2.getFirst_name());
    	System.out.println(emp2.getLast_name());
    	System.out.println(emp2.getAge());
    }
}

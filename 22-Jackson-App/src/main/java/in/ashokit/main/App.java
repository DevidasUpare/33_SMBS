package in.ashokit.main;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.binding.User;

public class App {
	
	public static void main(String[] args) throws Exception {
		App app=new App();
		app.convertObjToJson();
	}
	
	public void convertJsonToObj() throws Exception
	{
		ObjectMapper mapper=new ObjectMapper();
		User user=mapper.readValue(new File("user.json"), User.class);
		System.out.println(user);
	}
	
	public void convertObjToJson() throws Exception
	{
		User u = new User(101,"Dev","Male",123412311L);
		
		ObjectMapper mapper=new ObjectMapper();
		
		mapper.writeValue(new File("user.json"), u);
		
		System.out.println("Java Object converted to Json...!!");
		
	}

}

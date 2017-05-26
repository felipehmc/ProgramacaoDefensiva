package exe4;

import javax.script.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeInjection1 {
	
	public static void run(String str){
		String desired = "[a-zA-Z0-9\\-\\_]*";
		
		Pattern pattern = Pattern.compile(desired);
		Matcher matcher = pattern.matcher(str);
		if(!matcher.find()){
			throw new IllegalArgumentException();
		}			
		
		try {
			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine engine = manager.getEngineByName("JavaScript");
			engine.eval(new java.io.FileReader("resources/" + str + ".js"));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws ScriptException{
		String file = "teste";
		CodeInjection1.run(file);
		
	}
}
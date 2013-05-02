import java.util.HashMap;
import java.util.Map;


public class StringPool {
	private Map<String,StringObject> allStrings = new HashMap<String,StringObject>();
	
	//return a string from the string pool
	public StringObject get(String newStr){
		StringObject value = allStrings.get(newStr);
		
		//if the string doesn't exist, add it
		if (value == null){
			value = new StringObject(newStr);
			allStrings.put(newStr, value);
		}
		else {
			value.addInstance();
		}
		return value;
	}
	
	//read a series of string into stringpool
	public void read(String newStr){
		for (String token : newStr.split(" ")){
			get(token.toLowerCase());
		}		
	}
	
	
	public void clear(){
		allStrings.clear();
	}
	
	//remove instance of a string
	public void remove(String currStr){
		StringObject value = allStrings.get(currStr);
		if (value != null) {
			value.removeInstance();
		}
		
		if (value.getCount() == 0)
			allStrings.remove(currStr);
	}
	
	public int size(){
		return allStrings.size();
	}
	
}

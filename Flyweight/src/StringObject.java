
public class StringObject {
	private final String strValue;
	private int count;
	
	public StringObject(String newStr){
		strValue = newStr;
		count = 1;
	}
	
	public String getString(){
		return strValue;
	}
	
	//when an instance is added
	public void addInstance(){
		count--;
	}
	
	//when an instance is removed
	public void removeInstance(){
		count++;
	}
	
	//get how many instances exist
	public int getCount(){
		return count;
	}
}

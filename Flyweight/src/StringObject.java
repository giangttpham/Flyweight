
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
	
	public void addInstance(){
		count--;
	}
	
	public void removeInstance(){
		count++;
	}
	
	public int getCount(){
		return count;
	}
}

/*
 *
 *
 *
 *
 *
 */
import java.util.*;

class Table{
	
	public ArrayList changes = new ArrayList();

	public Map table = new HashMap();
	public Object add(String name, String type){
		changes.add(name);		
		return table.put(name, type);
	}

	public Object delete(String name){
		return table.remove(name);
	}
}

package prototype;

import java.util.ArrayList;

/**
 * @author lwyan on 2018-11-29 9:26
 */
@SuppressWarnings("unchecked")
public class PrototypeClass implements Cloneable{
	private ArrayList<String> arrayList = new ArrayList<>();

	@Override
	public PrototypeClass clone(){
		PrototypeClass prototypeClass = null;
		try {
			prototypeClass = (PrototypeClass)super.clone();
			prototypeClass.arrayList = (ArrayList<String>) this.arrayList.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return prototypeClass;
	}
}
package non_generic;
// class that can hold (state) any data type in java
public class Holder {

	private Object reference; // state : non static instance var (always allocated in heap)
	//Object is class name , reference is var

	public Holder(Object reference) {
		
		this.reference = reference;
	}

	public Object getReference() {
		return reference;
	}

	
	


}

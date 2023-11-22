package core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;

public class Stack implements IStack {
	private ArrayList<Object> elms;
	public Stack() {
		elms=new ArrayList<Object>();
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(elms!=null) {
			if(elms.size()==0)
				return true;
			else
				return false;
		}
		else
			return true;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		if(elms!=null)
			return elms.size();
		else
			return 0;
	}

	@Override
	public void push(Object elm) {
		// TODO Auto-generated method stub
		elms.add(elm);
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getTop() {
		// TODO Auto-generated method stub
		return elms.get(getSize()-1);
	}
	
	@Override
	public Object pop() {
		if(!isEmpty()) {
			return elms.remove(getSize()-1);
		}
		else {
			return null;
		}
	}

}

/*
  Class ArrayPriorityQueue
 */
import java.util.ArrayList;

public class ArrayPriorityQueue<T extends Comparable> implements PriorityQueue<T> {
    
    private ArrayList<T> _data;
    
    public ArrayPriorityQueue() {
	_data = new ArrayList<T>();
    }

    public void add(T x) {
	if(isEmpty()) {
	    _data.add(x);
	}
	else {
	    for (int a = 0; a < _data.size(); a ++) {
		if (_data.get(a).compareTo(x) > 0) {
		    _data.add(a, x);
		    return;
		}
	    }
	    _data.add(x);
	}
    }

    public boolean isEmpty(){
	return _data.size() == 0;
    }

    public T peekMin(){
	return _data.get(0);
    }
		
		
    public T removeMin(){
	if (isEmpty()){
	    return null;
	}
	else{
	    return _data.remove(0);
	}
    }

    public String toString() {
	return _data.toString();
    }

}

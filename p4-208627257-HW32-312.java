//Team PIJeon
//APCS2 pd4
//HW32 -- Getting past the Velvet Rope
//2017-04-20
import java.util.ArrayList;


public class ArrayPriorityQueue implements PriorityQueue<Integer>{
    
    private ArrayList<Integer> _data;
    
    public ArrayPriorityQueue(){
	_data = new ArrayList<Integer>();
    }

    public void add(Integer x){
	if(isEmpty()){
	    _data.add(x);
	}
	else{
	    for (int a = 0; a < _data.size(); a += 1){
		if (_data.get(a).compareTo(x) > 0){
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

    public Integer peekMin(){
	return _data.get(0);
    }
		
		
    public Integer removeMin(){
	if (isEmpty()){
	    return null;
	}
	else{
	    return _data.remove(0);
	}
    }

    public static void main(String[] args){
	//	System.out.println("oo".compareTo("pp"));
	
	PriorityQueue whoDat = new ArrayPriorityQueue();
	for (int x = 1; x <= 10; x += 1){
	    whoDat.add(x);
	    whoDat.add(11 - x);
	}
	for (int x = 1; x <= 20; x += 1){
	    System.out.println(whoDat.removeMin());
	}
    }	
}

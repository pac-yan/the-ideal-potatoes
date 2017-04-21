/*
Class Ticket
*/
public class Ticket{
    private int ID;
    private int VIP;
    private String problem;
    private boolean solved;
    private String name;
    private String solution;
    public Ticket(int id, int vip, String prob, String nombre){
	ID = id;
	VIP = vip;
	problem = prob;
	solved = false;
	name = nombre;
	solution = "";
    }
    public int getID(){
	return ID;
    }
    public int getVIP(){
	return VIP;
    }
    public String getProblem(){
	return problem;
    }
    public boolean getSolved(){
	return solved;
    }
    public String getName(){
	return name;
    }
    public String getSolution(){
	return solution;
    }
}

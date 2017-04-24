/*
  Class HelpDesk
*/

import java.util.ArrayList;

public class HelpDesk {

    private ArrayPriorityQueue<Ticket> ticketQ;
    private ArrayList<Ticket> solvedTickets;
    
    public HelpDesk() {
	ticketQ = new ArrayPriorityQueue<Ticket>();
	solvedTickets = new ArrayList<Ticket>();
    }
    
    private void createTicket(String name, int VIP, String problem) {
	int a = (int) (Math.random() * 1000); 
	Ticket newTicket = new Ticket(a, VIP, problem, name);
	place(newTicket);
	System.out.println("Your ticket number is: " + a + "! Don't forget it!");
    }
    
    private void place(Ticket x) {
	ticketQ.add(x);
    }

    public void solve() {
	Ticket beingSolved = ticketQ.removeMin();
	beingSolved.setSolution("Turn it off and on again");
	solvedTickets.add(beingSolved);
    }
   
    /*
    private void solveNext() {
	Ticket beingSolved = ticketQ.peekMin();
	if (solvedTickets.contains(beingSolved)) {
	    solveOld();
	}
	else {
	    solveNew();
	}
    }
    
    private void solveNew() {
	Ticket workOnNow = ticketQ.peekMin();
	//Deal with problem here
	ticketQ.removeMin();
	solvedTickets.add(workOnNow);
    }
    
    private void solveOld() {
	
    }
    */
    
}

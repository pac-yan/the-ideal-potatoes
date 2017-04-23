/*
  Class HelpDesk
*/

import java.util.ArrayList;

public class HelpDesk {

    private ArrayPriorityQueue<Ticket> ticketQ;
    private ArrayList<Ticket> SolvedTickets;
    
    public HelpDesk() {
	ticketQ = new ArrayPriorityQueue<Ticket>();
	SolvedTickets = new ArrayList<Ticket>();
    }
    
    private void createTicket(String name, int VIP, String problem) {
	int a = (int) (Math.random() * 1000); 
	Ticket newTicket = new Ticket(a, VIP, problem, name);
	System.out.println("Your ticket number is: " + a + "! Don't forget it!");
    }
    
    private void place(Ticket x) {
	ticketQ.add(x);
    }
    
    private void solveNext() {
	Ticket beingSolved = ticketQ.peekMin();
	if (SolvedTickets.contains(beingSolved)) {
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
	SolvedTickets.add(workOnNow);
    }
    
    private void solveOld() {
	
    }
    
}

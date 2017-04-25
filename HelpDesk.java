/*
  Class HelpDesk
*/

import java.util.ArrayList;
import java.util.Scanner;

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
	System.out.println("Ticket #" + beingSolved.getID() + " has been solved");
	System.out.println("    Solution: " + beingSolved.getSolution());
    }

    public boolean allSolved() {
	return ticketQ.isEmpty();
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

    public static void main(String[] args) {
	HelpDesk halp = new HelpDesk();
	System.out.println("Welcome to the help desk!");
	System.out.println("Start queuing tickets...");
	Scanner sc = new Scanner(System.in);
	String more = "";

	while (!more.equals("n")) {
	    System.out.print("Enter name: ");
	    String name = sc.next();
	    System.out.print("What's the problem? :");
	    String prob = sc.next();
	    System.out.print("What VIP level? :");
	    int vip = sc.nextInt();
	    halp.createTicket(name, vip, prob);
	    System.out.println("Any more tickets? (y/n):");
	    more = sc.next();
	    while (!more.equals("n") && !more.equals("y")) {
		System.out.println("Enter y or n (not " + more + ")");
		more = sc.next();
	    }
	}

	System.out.println();
	System.out.println("Now solving tickets...");
	while (!halp.allSolved()) {
	    halp.solve();
	}
	System.out.println("Done with all tickets. Enjoy or day!");
    }
    
}

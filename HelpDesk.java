/*
Class HelpDesk
*/
public class HelpDesk{
    private ArrayPriorityQueue<Ticket> ticketQ;
    private ArrayList<Ticket> SolvedTickets;
    public HelpDesk(){
	ticketQ = new ArrayPriorityQueue<Ticket>();
	SolvedTickets = new ArrayList<Ticket>();
    }
    private void createTicket(String name, int VIP, String problem){
	int a = (int) (Math.random() * 1000); 
	ticket newTicket = new ticket(a, VIP, problem, name);
	System.out.println("Your ticket number is: " + a + "! Don't forget it!");
    }
    private void place(Ticket x){
	ticketQ.add(x, x.VIP);
    }
    private void solveNext(){
	if (SolvedTickets.contains(ticketQ.peekMin())){
	    solveOld();
	}
	else{
	    solveNew();
	}
    }
    private void solveNew(){
	ticket workOnNow = ticketQ.peekMin();
	//Deal with problem here
	ticketQ.removeMin();
	SolvedTickets.add(workOnNow);
    }
    private void solveOld(Ticket y){
	
    }
}

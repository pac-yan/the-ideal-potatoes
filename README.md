# the-ideal-potatoes By Daniel Ju, Shakil Rafi, and Pacy Yan


We decided to create a ticket class with the attributes VIP level, roster number, name, problem, and solution. The VIP number became our metric for determining a ticket's place in the arrayPriorityQueue. 

The way our Help Desk operates is as follows:

Once someone approaches the HelpDesk, they are asked for their name and problem. Then, a ticket will be created containing the relevant inputs and the randomly generated roster number will be printed for the user's benefit. 

"Solving the problem" was a rather vague concept, because we had no idea which types of problems to anticipate and how to generate solutions to all of them. Ultimately, we decided that the default solution to any problem would be to tell the user to reboot the computer and try again. 

Once a problem is solved, the solution instance variable in the ticket class will be updated, and the ticket will be added to an arrayList of already resolved tickets. The reason we decided to implement such a feature is to streamline the problem solving process: if we see that a problem already exists inside the arrayList of tickets with solutions, then we can just use that solution for the identical problem and save time.

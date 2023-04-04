import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {

        // YOUR CODE HERE
        // String response="Hello,"+name+"Lovely to see you.";
        //  String response = String.format("Hello,"+name+"Lovely to see you.");
        String response = String.format("Hi %s, Lovely to see you.", name);
         
        return response;
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date today =  new Date();
        String response = String.format("It is currently %s ", today);
        return response;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE

        if (conversation.contains("Alexis")) {
           return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } 
        else if (conversation.contains("Alfred"))
         
         {
            return "At your service. As you wish, naturally.";
        }
             return "Right. And with that I shall retire";

	// NINJA BONUS
	// See the specs to overload the guestGreeting method
        // SENSEI BONUS
        // Write your own AlfredQuote method using any of the String methods you have learned!
}
}


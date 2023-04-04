
import java.util.ArrayList;

public class CafeUtil {

    public double getOrderTotal(double[] prices){
        double totalPrice = 0;
          for(double p : prices){
            totalPrice+=p;
        }
        return totalPrice;
    }


     public int getStreakGoal(){
          int sum = 0;
        for (int i = 1; i <= 10; i++) {
        sum += i;
}
    return sum;
     }

    public void addCustomer(ArrayList<String> customers){

        System.out.println("please enter your name here");
        String userName = System.console().readLine();

        customers.add(userName); // to add an item to an ArrayList
        System.out.println("Hello, " + userName + "!");
        System.out.println("There are "+ (customers.size() - 1) + " people ahead of you!");
        System.out.println("Customers List:" + customers);

    }


     public void displayMenu(ArrayList<String> menu){
              for(String m : menu){
            System.out.println(m);
        }
    }

   
}
public class CafeJava {
        public static void main(String[] args) {
            // APP VARIABLES
            
            // Lines of text that will appear in the app. 
            String generalGreeting = "Welcome to Cafe Java, ";
            String pendingMessage = ", your order will be ready shortly";
            String readyMessage = ", your order is ready";
            String displayTotalMessage = "Your total is $";
            
            // Menu variables (add yours below)
            double mochaPrice = 3.5;
            double dripCoffeePrice = 3.75;
            double lattePrice = 3.2;
            double cappuccinoPrice = 2.75;

        
            // Customer name variables (add yours below)
            String customer1 = "Cindhuri";
            String customer2 = "Sam";
            String customer3 = "Jimmy";
            String customer4 = "Noah";
        
            // Order completions (add yours below)
            boolean isReadyOrder1 = false;
            boolean isReadyOrder2 = true;
            boolean isReadyOrder3 = false;
            boolean isReadyOrder4 = true;
        
            // APP INTERACTION SIMULATION (Add your code for the challenges below)
            // Example:
            System.out.println(pendingMessage + customer1); // Displays "Welcome to Cafe Java, Cindhuri"

            // ** Your customer interaction print statements will go here ** //

            // Noah ordered a cappuccino, use if statement to check status of order, print out correct status message

            System.out.println(customer4 + cappuccinoPrice );
            if (isReadyOrder4) {
                System.out.println(readyMessage + cappuccinoPrice);
            } 
            else {
                System.out.println( customer4 + pendingMessage);
            }

            // Sam ordered 2 lattes, print message & display total, use if to print order status message, change is ready flag value to false or vice versa
          
            System.out.println( customer2 + lattePrice * 2);
            if (isReadyOrder2){
                System.out.println(readyMessage);
            }
            else {
                System.out.println(pendingMessage);
            }

            // Jimmy just realized he was charged for a coffee but ordered a latte. Print total message with new tota(he owes) to make up the difference.

            System.out.println( customer3 + lattePrice);
            if (dripCoffeePrice > lattePrice) {
                 System.out.println(dripCoffeePrice - lattePrice);
            }
            else { 
                System.out.println( customer3 + lattePrice);
            }

            

        }
    }
    
    
    


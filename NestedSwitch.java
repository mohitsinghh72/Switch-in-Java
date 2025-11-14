import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String state = sc.nextLine().toLowerCase();
        String capital = sc.nextLine().toLowerCase();
        switch(state){
            case "uttarpradesh" :
                switch(capital){
                    case "lucknow" :
                        System.out.println("You are in Capital of Uttar Pradesh");
                        break;
                    case "ghaziabad" :
                        System.out.println("You are in developing city of Uttar Pradesh");
                        break;
                    case "meerut" :
                        System.out.println("You are in middle of Uttar Pradesh");
                }
                break;
            case "jammu kashmir" :
                switch (capital){
                    case "sri nagar" :
                        System.out.println("Capital of jammu kashmir");
                        break;
                    case "srinagar" :
                        System.out.println("Capital of jammu kashmir Enjoy mountain");
                        break;
                }
                break;
            case "rajasthan" :
                switch(capital){
                    case "jaipur" :
                        System.out.println("You are in pink city of India");
                        break;
                    case "ajmer" :
                        System.out.println("You are in somewhere between castle");
                        break;
                    case "bikaner" :
                        System.out.println("Sweetest sweet");
                        break;
                }
                break;
            case "punjab":
                switch (capital){
                    case "chandigarh" :
                        System.out.println("Capital of punjab");
                        break;
                    case "amritsar" :
                        System.out.println("Welcome to Golden Temple");
                        break;
                    case "mansa" :
                        System.out.println("You are in mansa");
                        break;
                }
                break;
            default:
                System.out.println("Not in My list but somewhere in the World");
        }
    }
}
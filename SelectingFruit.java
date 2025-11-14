import java.util.Scanner;

public class SelectingFruit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fruit name : ");  // choose fruit name between apple,mango,Banana,Watermelon
        String fruits = sc.next();

        switch (fruits){
            case "apple" :
                System.out.println("Doctor's Enemy");
                break;
            case "mango" :
                System.out.println("Everyone's Favourite");
                break;
            case "Banana":
                System.out.println("Makes Strong");
                break;
            case "Watermelon" :
                System.out.println("Summer Fruit");
                break;
            default:
                System.out.println("You have Write different fruit than me");
        }
    }
}

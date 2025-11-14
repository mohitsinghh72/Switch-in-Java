import java.util.Scanner;

public class SelectingFruit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fruit name : ");  // choose fruit name between apple,mango,Banana,Watermelon
        String fruits = sc.next().toLowerCase();

        switch (fruits){
            case "apple" :
                System.out.println("Doctor's Enemy");
                break;
            case "mango" :
                System.out.println("Everyone's Favourite");
                break;
            case "banana":
                System.out.println("Makes Strong");
                break;
            case "watermelon" :
                System.out.println("Summer Fruit");
                break;
            default:
                System.out.println("You have written different fruit than me");
        }

// ------------------------------------------------------------------------------------------------------------------------ //

        //      Enhanced switch, Here No need to apply break condition

//        switch (fruits){
//            case "apple" -> System.out.println("Doctor's Enemy");
//            case "mango" -> System.out.println("Everyone's Favourite");
//            case "banana" -> System.out.println("Makes Strong");
//            case "watermelon" -> System.out.println("Summer Fruit");
//            default -> System.out.println("You have written different fruit than me");
//        }
    }
}

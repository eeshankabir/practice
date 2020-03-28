import java.util.Scanner;
public class myapp {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the row number: ");
        int rowNumber = scan.nextInt();

        for(int rowCount=1; rowCount<= rowNumber; rowCount++){
            for(int columnCount=1; columnCount<= rowCount; columnCount++){
                System.out.print(columnCount);
            }
            System.out.println();
        }

    }
}
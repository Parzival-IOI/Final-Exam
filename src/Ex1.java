import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    private final int initialNumber = 1;
    private int[] array = new int[initialNumber];
    private int count = 0;
    private int arraySize = initialNumber;

    public void menu() {
        Scanner scan = new Scanner(System.in);
        boolean exit = true;
        do {
            System.out.println("Enter The Numbers : ");
            System.out.println("\t1. Input the Number.");
            System.out.println("\t2. View the Number.");
            System.out.println("\t3. Exit.");
            System.out.print("Enter Number : ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1 : {
                    boolean out = true;
                    do {
                        System.out.print("Enter negative Number to exit : ");
                        int num = scan.nextInt();
                        if(num<0) {
                            out = false;
                        }else {
                            if(count >= arraySize-1) {
                                arraySize *= 2;
                                array = Arrays.copyOf(array, arraySize);
                            }
                            array[count] = num;
                            count++;
                        }
                    }while(out);
                    break;
                }
                case 2 : {
                    this.show();
                    break;
                }
                case 3 : {
                    exit = false;
                    break;
                }
                default: {
                        System.out.println("mtfker Wrong choice !");
                }
            }


        }while(exit);
    }

    private void show () {
        System.out.println(Arrays.toString(this.array));
    }
}

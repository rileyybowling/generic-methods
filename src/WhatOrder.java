import java.util.Scanner;

public class WhatOrder  {
    // TODO: Define a generic method called checkOrder() that
    //       takes in four variables of generic type as arguments.
    //       The return type of the method is integer

    public static <WhatOrder extends Comparable<WhatOrder>>
    int checkOrder(WhatOrder val1, WhatOrder val2, WhatOrder val3, WhatOrder val4){
        if ((val1.compareTo(val2) < 0) && (val2.compareTo(val3) < 0) && (val3.compareTo(val4) < 0)){
            return 1;
        } else if ((val1.compareTo(val2) > 0) && (val2.compareTo(val3) > 0) && (val3.compareTo(val4) > 0)){
            return -1;
        } else {
            return 0;
        }
    }

    // Check the order of the input: return -1 for ascending,
    // 0 for neither, 1 for descending



    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Check order of four strings
        System.out.println("Order: " + checkOrder(scnr.next(), scnr.next(), scnr.next(), scnr.next()));

        // Check order of four doubles
        System.out.println("Order: " + checkOrder(scnr.nextDouble(), scnr.nextDouble(), scnr.nextDouble(), scnr.nextDouble()));
    }
}

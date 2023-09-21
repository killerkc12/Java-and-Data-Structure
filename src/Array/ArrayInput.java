package Array;

import java.util.*;

public class ArrayInput {
    public  static void  main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        int[] rnos = new int[5];

//        for (int i = 0; i < rnos.length; i++) {
//            rnos[i] = scanner.nextInt();
//        }

//        for (int i = 0; i < rnos.length; i++) {
//            System.out.print(rnos[i] + " ");
//        }

        for(int item: rnos) {
            System.out.print(item + " ");
        }

        String[] names = new String[5];

        for (int i = 0; i < rnos.length; i++) {
            names[i] = scanner.next();
        }
//        for (String item: names) {
//            item = scanner.next();
//        }

        System.out.println(Arrays.toString(names));


    }
}

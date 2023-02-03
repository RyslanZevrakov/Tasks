package org.example;
import java.util.Scanner;

import static java.util.Collections.reverse;

public class Input {


    public void input() {
        Revers revers = new Revers();
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        revers.reverseString(text);
        System.out.println(revers.reverseString(text));


    }


}
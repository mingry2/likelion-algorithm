package babalion;

import javax.swing.*;
import java.util.Scanner;

public class SomePlus {
//    public int convertAlphabetToNum(char c){
//        int num = (int) c;
//        int result = num % 64;
//        return result;
//    }
    public int convertAlphabetToNum(char c) {
    return  (int)(c) - 64;
}

    public static void main(String[] args) {
        SomePlus sp = new SomePlus();
        sp.convertAlphabetToNum('A');
    }
}

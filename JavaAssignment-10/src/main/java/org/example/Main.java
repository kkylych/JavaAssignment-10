package org.example;

public class Main {
    public static void main(String args[]){
        StringProcessor processor = new StringProcessor();

        boolean testing1 = processor.isStrongPassword("Qwerty1234#");
        System.out.println(testing1);

        int testing2 = processor.calculateDigits("Hello 1 World 22323");
        System.out.println(testing2);

        int testing3 = processor.calculateWords("Hello world again");
        System.out.println(testing3);

        double testing4 = processor.calculateExpression("1 + 12212");
        System.out.println(testing4);

    }
}

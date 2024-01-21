package javaPrep;

public class PrimitiveDT {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        //byte b3 = 3000; b(-128, 127) x

        short s1 = 5;
        short s2 = -10;
        short s3 = 0;

        int i1 = 500;

        long l1 = 1000;
        long l2 = 10000000000L;

        //Чем шире диапазон тем больше места занимает в памяти и это влияет на производительность

        float f1 = 3.1F;
        float f2 = 2.51f;

        double d1 = 5.5;
        double d2 = 87.65;

        char c1 = 's';
        char c2 = 'a';
        char c3 = '1';

        char c4 = 500; // 300-ый код в юникоде
        char c5 = '\u12AB';

        System.out.println(c5);

        boolean bool1 = true;
        boolean bool2 = false;

        //Система счислений
        //2-ичная (0,1)
        //8-ричная(0-7)
        //10-ричная(0-9)
        //16-ричная(0-F)

        int a = 1_000_000;
        //underscore нельзя использовать в начале числа и в конце
        // до и после в дробных числах
        //до и после l f d
        //до и после 0X 0x 0B 0b
        //Можно исп после 0 в 8-системе
        System.out.println(a);
    }





    }

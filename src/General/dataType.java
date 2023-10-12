package General;

public class dataType {
    public static void main(String[] args) {

        // Data Type
        int a;
        a = 10;
        System.out.println(a);


        String name = "Akash";
        System.out.println(name);

        double b = 192.1;
        System.out.println(b);

        // Type casting
        // The conversion is done by JVM automatically so
        // it is known as Implicit type casting
        int i = 50;
        double d = i;
        System.out.println(i + " " + d);

        // In this exam doubl --> Int is done forcefully by using
        // (int) so this type of conversion is known as Explicit Type Casting
        double myval = 3345.333;
        int e = (int) myval;
        System.out.println(a );

        //How should we known when we can do which type of casting ?
        //Just check if our data losses or not
        //  int --> double    eg. 40  --> 40.0  No loss of data
        //  (Automatically type casting -Implicit type casting)
        //  double --> int    eg. 40.46 --> 40  Loss of data from 40.46 to 40
        //  (Forcefully type casting - Explicit type casting)


        //Java Operators

        int n1 = 10;
        int n2 = 20;

        int pre = ++n1;
        System.out.println(pre);
        int post = n2++;
        System.out.println(post);

        //Bitwise inclusive OR "|"
        /**
         * both bits 0 result 0 otherwise 1
         * bit pattern of a	0000000001011100
         * bit pattern of b	0000000000101110
         * bit pattern of a | b	0000000001111110**/
        //Bitwise exclusive OR "^"
        /**
         *Bitwise exclusive OR "^"
         * both bits 1 or 0 results 0 otherwise 1
         * bit pattern of a  	0000000001011100
         * bit pattern of b	    0000000000101110
         * bit pattern of a ^ b	0000000001110010
         * **/
        int x = -9;
        int y = 8;
        /**
         * x= 1100100
           y= 1100101
         x|y =1100101
         x^y =0000001 **/
        //System.out.println(Integer.toBinaryString(x));// can generate an execption o (signed vs unsigned)
        System.out.println(Integer.toString(x,2));//radix stand foe the format
        System.out.println(Integer.toString(y,2));
        System.out.println("Bitwise incluse OR result  " + (x|y));

//==========================================================================================================================

        // Shift operator in java
        // Signed Left shift and Signed Right shift
        /**
         * Signed left shift = <<
         * Syntax : left_operand << number
         * [a<<b ==>a * 2^b] eg. 2<<4 ==> 2* 2^4 ==>32
         * Signed Right Shift = >>
         * Syntax : right_operand >> number
         * [a>>b ==> a/2^b]
         * **/
        byte number = 2;
        int  lshift = number <<2;
        System.out.println("Number is :" +number);
        System.out.println("Convert to decimal : " + Integer.toString(number,2));
        System.out.println("Performing the left shift number<<2 :"+ lshift);
        System.out.println("Convert to decimal lshift: " + Integer.toString(lshift,2));


        // Unsigned Right shift and Unsigned Left shift






        /**TIPS:
         * 1.To solve problem when bit representation is required like
         *   integer to any other format (octal,binary,hex) can be done using
         *   Integer.toString(int,representation)
         *   **/










    }
}

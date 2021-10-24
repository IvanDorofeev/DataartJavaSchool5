package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 21
     * -2,147,483,648 -> exception and error message
     * If result (number in reversed order) is out of int range [-2,147,483,648,  2,147,483,647] throw custom
     * unchecked exception. In main method (Main class) if exception happened output message with problem to user.
     */
    public int reverse(int inputNumber) {
        //Task implementation
        java.lang.RuntimeException e=new java.lang.RuntimeException("Reverse integer is out of int range. ");
        int sign = (inputNumber > 0) ? 1 : -1;
        inputNumber *= sign;
        if (inputNumber < 0) {
            System.out.println(e.getMessage());
            throw e;
        }
        int result = 0;
        for (long divisor = 1; divisor <= inputNumber; ) {
            divisor *= 10;
            result *= 10;
            if (result < 0) {
                System.out.println(e.getMessage());
                throw e;
            }
            result += (inputNumber % divisor) / (divisor / 10);
        }
        result *= sign;
        return result;
    }
}

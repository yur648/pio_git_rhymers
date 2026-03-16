package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUMBER_TWELVE = 12;
    public static final int NUMBER_MINUS_ONE = -1;
    private final int[] numbers = new int[NUMBER_TWELVE];

    public int total = NUMBER_MINUS_ONE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == NUMBER_MINUS_ONE;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}

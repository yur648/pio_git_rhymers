package edu.kis.vh.nursery;

/**
 * Klasa implementująca podstawowy mechanizm wyliczanki (stos).
 * Pozwala na dodawanie elementów (countIn) i ich pobieranie (countOut).
 * Działa na zasadzie LIFO (Last In, First Out).
 */
public class DefaultCountingOutRhymer {

    public static final int STACK_CAPACITY = 12;
    public static final int EMPTY_STACK_INDICATOR  = -1;
    public static final int ERROR_RETURN_VALUE = -1;
    private final int[] numbers = new int[STACK_CAPACITY];

    private int total = EMPTY_STACK_INDICATOR ;

    /**
     * Zwraca aktualną wartość wskaźnika stosu.
     *
     * @return bieżąca wartość total
     */
    public int getTotal() {
        return total;
    }

    /**
     * Dodaje element na szczyt stosu, jeśli stos nie jest pełny.
     *
     * @param in element do dodania
     */
    // TODO: dodać obsługę wyjątku dla przepełnienia stosu zamiast cichego ignorowania
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy stos jest pusty.
     *
     * @return true jeśli stos jest pusty, false w przeciwnym razie
     */
    public boolean callCheck() {
        return total == EMPTY_STACK_INDICATOR ;
    }

    /**
     * Sprawdza, czy stos jest pełny.
     *
     * @return true jeśli stos jest pełny, false w przeciwnym razie
     */
    public boolean isFull() {
        return total == STACK_CAPACITY - 1;
    }

    /**
     * Podgląda element na szczycie stosu bez jego usuwania.
     *
     * @return wartość na szczycie stosu lub ERROR_RETURN_VALUE jeśli stos jest pusty
     */
    protected int peekaboo() {
        if (callCheck())
            return ERROR_RETURN_VALUE;
        return numbers[total];
    }

    /**
     * Usuwa i zwraca element ze szczytu stosu.
     *
     * @return usunięty element lub ERROR_RETURN_VALUE jeśli stos jest pusty
     */
    public int countOut() {
        if (callCheck())
            return ERROR_RETURN_VALUE;
        return numbers[total--];
    }

}

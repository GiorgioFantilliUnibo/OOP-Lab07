package it.unibo.oop.lab.nesting2;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * Represent a list of {@link Acceptable} elements.
 * 
 * @param <T>
 *             specific elements type.
 */
public class OneListAcceptable<T> implements Acceptable<T> {

    private final List<T> elements;

    /**
     * Builds a new {@link OneListAcceptable}.
     * 
     * @param list
     *          sequence of elements to accept
     */
    public OneListAcceptable(final List<T> list) {
        this.elements = new LinkedList(Objects.requireNonNull(list));
    }

    /**
     *{@inheritDoc}
     */
    @Override
    public Acceptor<T> acceptor() {
        // TODO Auto-generated method stub
        return null;
    }

}

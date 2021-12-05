package it.unibo.oop.lab.nesting2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
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
        final Iterator<T> iterator = this.elements.iterator();
        return new Acceptor<T>() {

            /**
             *{@inheritDoc}
             */
            @Override
            public void accept(final T newElement) throws ElementNotAcceptedException {
                if (!iterator.hasNext() || !newElement.equals(iterator.next())) {
                    throw new ElementNotAcceptedException(newElement);
                }
            }

            /**
             *{@inheritDoc}
             */
            @Override
            public void end() throws EndNotAcceptedException {
                if (iterator.hasNext()) {
                    throw new EndNotAcceptedException();
                }
            }

        };
    }

}

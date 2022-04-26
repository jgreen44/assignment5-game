package treasure;

/**
 * The interface Iterator.
 *
 * @param <T> the type parameter
 */
public interface Iterator<T> {
  boolean hasNext();

  T next();

  void remove();
}

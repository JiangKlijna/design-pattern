/**
 * @author jiang
 */
import java.util.Arrays;
import java.util.Iterator;

class Repository<T> {
	private T[] array;

	public Repository(T[] array) {
		this.array = array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public T[] getArray() {
		return array;
	}

	protected final Iterator<T> getIterator() {
		return new NameIterator();
	}

	@Override
	public String toString() {
		return "Repository [array=" + Arrays.toString(array) + "]";
	}

	private final class NameIterator implements Iterator<T> {

		private int index;

		@Override
		public boolean hasNext() {
			return index < array.length && index >= 0;
		}

		@Override
		public T next() {
			return hasNext() ? (T) array[index++] : null;
		}
	}
}

public class IteratorPattern {

	public static void main(String[] args) {
		Repository<String> re = new Repository<String>(new String[] { "Robert", "John", "Julie", "Lora" });
		for (Iterator<String> it = re.getIterator(); it.hasNext();) {
			System.out.println(it.next());
		}
		System.out.println(re);
	}

}

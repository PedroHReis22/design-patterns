package curso.behavioral.nullObject;

public class FactorySort {

	public SortList getSort(String sortName) {
		
		try {
			if (Class.forName(sortName) != null)
				return (SortList) Class.forName(sortName).getConstructor(String.class).newInstance();
			else
				return new NullSort();
		} catch (Exception e) {
			return new NullSort();
		}
	}
}
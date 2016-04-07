package curso.behavioral.nullObject;

import java.util.List;

public class BubbleSort implements SortList {

	@Override
	public void sort(List<Integer> list) {
		bubbleSort(list);
	}

	public static void bubbleSort(List<Integer> list) {
		
		boolean sorted = false;

		for (int top = list.size() - 1; top > 0 && !sorted; top--) {
			
			sorted = true;
			
			for (int i = 0; i < top; i++) {
				
				if (list.get(i) > list.get(i + 1)) {
					
					sorted = false;

					int temp = list.get(i);
					list.add(i, list.get(i + 1));
					list.add(i + 1, temp);
				}
				
			}
		}
	}

}
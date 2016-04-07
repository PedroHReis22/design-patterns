package curso.behavioral.nullObject;

import java.util.List;

public class QuickSort implements SortList {

	@Override
	public void sort(List<Integer> list) {
		
		if (list == null || list.size() == 0) return;
		
		int start = 0, end = 0;
		
		for (int ele : list) {
			if (ele < start) start = ele;
			else if (ele > end) end = ele;
		}

		quicksort(list, start, end);
	}

	private void quicksort(List<Integer> list, int start, int end) {
		
		int i = start, j = end;
		
		int pivot = list.get(start + (end - start) / 2);
		
		while (i <= j) {
			
			while (list.get(i) < pivot) i++;
			while (list.get(j) > pivot) j--;

			if (i <= j) {
				exchange(list, i, j);
				i++;
				j--;
			}
		}

		if (start < j)
			quicksort(list, start, j);
		if (i < end)
			quicksort(list, i, end);
	}

	private void exchange(List<Integer> list, int i, int j) {
		int temp = list.get(i);
		list.add(i, list.get(j));
		list.add(j, temp);
	}
	
}

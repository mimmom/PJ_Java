/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 7 Programmer Exams 1Z0-804 and 1Z0-805: 
 * A Comprehensive OCPJP 7 Certification Guide
 * by SG Ganesh and Tushar Sharma
------------------------------------------------------------------------------*/

package chapter05_oodesignprinciplesandpatterns.listing_5_4;

import java.awt.List;

interface Sorting {
	List sort(List list);
}

class MergeSort implements Sorting {
	public List sort(List list) {
		// sort implementation
		return list;
	}
}

class QuickSort implements Sorting {
	public List sort(List list) {
		// sort implementation
		return list;
	}
}

class DynamicDataSet {
	Sorting sorting;

	public DynamicDataSet() {
		sorting = new MergeSort();
	}
	// DynamicDataSet implementation
}

class SnapshotDataSet {
	Sorting sorting;

	public SnapshotDataSet() {
		sorting = new QuickSort();
	}
	// SnapshotDataSet implementation
}

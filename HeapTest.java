
public class HeapTest {

	public static void main(String[] args) throws HeapException {

		/// Test 
		MaxIntHeap heap= new MaxIntHeap();
		System.out.println("Creating new heap with no set size");
		System.out.println(" ");
		System.out.println("Checking if Heap is Empty...");
		if(heap.isEmpty()==true)
			System.out.println("Heap is Empty");
		else
			System.out.println("Heap is NOT Empty");
		System.out.println(" ");
		System.out.println("Checking what Max is on Empty Array...");
		try {
			System.out.println("Max Value of array is "+heap.max());
		} catch (HeapException e1) {
			e1.printStackTrace();
		}
		System.out.println(" ");
		System.out.println("Removing max from empty array...");
		try {
			heap.removeMax();
		} catch (HeapException e1) {
			e1.printStackTrace();
		}
		System.out.println(" ");
		System.out.println("Added 15 values to array.");
		heap.heapInsert(0);
		heap.heapInsert(-2);
		heap.heapInsert(-6);
		heap.heapInsert(-4);
		heap.heapInsert(-8);
		heap.heapInsert(-10);
		heap.heapInsert(2);
		heap.heapInsert(6);
		heap.heapInsert(4);
		heap.heapInsert(8);
		heap.heapInsert(10);
		heap.heapInsert(12);
		heap.heapInsert(14);
		heap.heapInsert(16);
		heap.heapInsert(18);
		System.out.println(" ");
		System.out.println("Checking if heap is Empty");
		if(heap.isEmpty()==true)
			System.out.println("Heap is Empty");
		else
			System.out.println("Heap is NOT Empty");
		System.out.println(" ");
		int [] array = new int[20];
		array =heap.getHeapArray();
		int count=0;
		for(count=0;count<heap.size();count++)
			System.out.println(array[count]);
		System.out.println("Size of array is currently "+heap.size());
		System.out.println(" ");
		System.out.println("Adding 6 more values to array...");
		heap.heapInsert(10);
		heap.heapInsert(-20);
		heap.heapInsert(0);
		heap.heapInsert(40);
		heap.heapInsert(7);
		try {
			heap.heapInsert(7);
		} catch (HeapException e) {
			e.printStackTrace();
		}
		System.out.println(" ");
		System.out.println("Size of array is currently "+heap.size());
		System.out.println(" ");
		System.out.println("Checking what Max is in Array...");
		System.out.println("Max Value of array is "+heap.max());
		System.out.println(" ");
		array =heap.getHeapArray();
		for(count=0;count<heap.size();count++)
			System.out.println(array[count]);
		System.out.println(" ");
		System.out.println("Removing max from array...");
		heap.removeMax();
		array =heap.getHeapArray();
		for(count=0;count<heap.size();count++)
			System.out.println(array[count]);
		System.out.println(" ");
		System.out.println("Creating 3 new heaps with 0,-4, and 5 in parameter");
		MaxIntHeap heap2= new MaxIntHeap(0);
		MaxIntHeap heap3= new MaxIntHeap(-4);
		MaxIntHeap heap4= new MaxIntHeap(5);
		System.out.println(" ");
		System.out.println("Added 5 values to 3rd heap.");
		heap4.heapInsert(-10);
		heap4.heapInsert(2);
		heap4.heapInsert(6);
		heap4.heapInsert(4);
		heap4.heapInsert(8);
		array =heap4.getHeapArray();
		for(count=0;count<heap4.size();count++)
			System.out.println(array[count]);
		System.out.println(" ");
		System.out.println("Modifying heap by adding the value 5 to index 0");
		try {
			heap4.modifyHeap(0, 5);
		} catch (HeapException e) {
			e.printStackTrace();
		}
		System.out.println(" ");
		System.out.println("Modifying heap by adding the value 10 to last index");
		try {
			heap4.modifyHeap(4, 10);
		} catch (HeapException e) {
			e.printStackTrace();
		}
		System.out.println(" ");
		System.out.println("Modifying heap by adding the value 20 to index 2");
		heap4.modifyHeap(2, 20);
		array =heap4.getHeapArray();
		for(count=0;count<heap4.size();count++)
			System.out.println(array[count]);
		System.out.println(" ");
		System.out.println("Modifying heap by adding the value -50 to index 1");
		heap4.modifyHeap(1, -50);
		array =heap4.getHeapArray();
		for(count=0;count<heap4.size();count++)
			System.out.println(array[count]);
		
	
		
}
}

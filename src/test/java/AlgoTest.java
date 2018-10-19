package test.java;
import main.java.Item;
import main.java.SortAlgos;


import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class AlgoTest {
	
	
	private static void shuffle(Item[] array)
	{
	    Integer index,temp;
	    Random random = new Random();
	    for (Integer i = array.length - 1; i > 0; i--)
	    {
	        index = random.nextInt(i + 1);
	        temp = array[index].key;
	        array[index].key = array[i].key;
	        array[i].key = temp;
	    }
	}

	//test ramdon input
	@Test  //cover line 20 to 36 except 22
	public void case1bubbletest() {
		int M=5;
		Item[] T = new Item[M];
		for(int i=0;i<M;i++){
			Item tp=new Item(i);
	        T[i] = tp;
	    }
		shuffle(T);
		

		SortAlgos.bubbleSort(T);
		for(int i=1;i<M;i++){
		Item tp=new Item(i);
		assertEquals(tp.key,T[i].key);
		}
	}	
	
	      //test sorted input
	//cover line 20 to 36 except 22 and 29 to 33
	@Test
	public void case2test() {
		int M=5;
		Item[] T = new Item[M];
		for(int i=0;i<M;i++){
			Item tp=new Item(i);
	        T[i] = tp;
	    }
		
		

		SortAlgos.bubbleSort(T);
		for(int i=1;i<M;i++){
		Item tp=new Item(i);
		assertEquals(tp.key,T[i].key);
		}
		
	}
	
	//test sorted input with length=1
		//cover line 20 to 36 except 22 and 29 to 34 
	@Test
		public void case3test() {
			int M=1;
			Item[] T = new Item[M];
			for(int i=0;i<M;i++){
				Item tp=new Item(i);
		        T[i] = tp;
		    }
			
			

			SortAlgos.bubbleSort(T);
			for(int i=1;i<M;i++){
			Item tp=new Item(i);
			assertEquals(tp.key,T[i].key);
			}
		}
	


	    //cover line 20 to 22
	@Test(expected = NullPointerException.class)
	public void bublesortNullPointerException() {
		Item[] T = null;
		SortAlgos.bubbleSort(T);
	}
	
	@Test	
	public void case1selectiontest() {
		int M=5;
		Item[] T = new Item[M];
		for(int i=0;i<M;i++){
			Item tp=new Item(i);
	        T[i] = tp;
	    }
		shuffle(T);
		

		SortAlgos.selectionSort(T);
		for(int i=1;i<M;i++){
		Item tp=new Item(i);
		assertEquals(tp.key,T[i].key);
		}
	}
	
	
	
	@Test	
	public void case1insertiontest() {
		int M=5;
		Item[] T = new Item[M];
		for(int i=0;i<M;i++){
			Item tp=new Item(i);
	        T[i] = tp;
	    }
		shuffle(T);
		

		SortAlgos.insertionSort(T);
		for(int i=1;i<M;i++){
		Item tp=new Item(i);
		assertEquals(tp.key,T[i].key);
		}
	}
	
	
	@Test	
	public void case1mergetest() {
		int M=5;
		Item[] T = new Item[M];
		for(int i=0;i<M;i++){
			Item tp=new Item(i);
	        T[i] = tp;
	    }
		shuffle(T);
		

		SortAlgos.mergeSort(T);
		for(int i=1;i<M;i++){
		Item tp=new Item(i);
		assertEquals(tp.key,T[i].key);
		}
	}
	
	@Test	
	public void case1quicktest() {
		int M=5;
		Item[] T = new Item[M];
		for(int i=0;i<M;i++){
			Item tp=new Item(i);
	        T[i] = tp;
	    }
		shuffle(T);
		

		SortAlgos.quickSort(T);
		for(int i=1;i<M;i++){
		Item tp=new Item(i);
		assertEquals(tp.key,T[i].key);
		}
	}
	@Test	
	public void case1heaptest() {
		int M=5;
		Item[] T = new Item[M];
		for(int i=0;i<M;i++){
			Item tp=new Item(i);
	        T[i] = tp;
	    }
		shuffle(T);
		

		SortAlgos.heapSort(T);
		for(int i=1;i<M;i++){
		Item tp=new Item(i);
		assertEquals(tp.key,T[i].key);
		}
	}
	
	@Test(expected = NullPointerException.class)
	public void selectionSortNullPointerException() {
		Item[] T = null;
		SortAlgos.selectionSort(T);
	}
	@Test(expected = NullPointerException.class)
	public void insertionSortNullPointerException() {
		Item[] T = null;
		SortAlgos.insertionSort(T);
	}
	@Test(expected = NullPointerException.class)
	public void mergeSortNullPointerException() {
		Item[] T = null;
		SortAlgos.mergeSort(T);
	}
	@Test(expected = NullPointerException.class)
	public void quickNullPointerException() {
		Item[] T = null;
		SortAlgos.quickSort(T);
	}
	@Test(expected = NullPointerException.class)
	public void heapNullPointerException() {
		Item[] T = null;
		SortAlgos.heapSort(T);
	}
}

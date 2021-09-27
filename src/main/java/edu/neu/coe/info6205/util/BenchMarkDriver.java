package edu.neu.coe.info6205.util;
import java.util.*;

import com.google.common.base.Supplier;

import edu.neu.coe.info6205.sort.Helper;
import edu.neu.coe.info6205.sort.elementary.InsertionSort;

public class BenchMarkDriver {

	
	public static void main(String[] args) {
		
		
		int len = 1500;
		int rep = 500; 
		Random random = new Random();
		InsertionSort is = new InsertionSort();
		
		Integer[] sorted_ar = new Integer [len];
		Integer[] random_ar = new Integer [len];
		Integer[] reverse_ar = new Integer [len];
		Integer[] partial_ar= new Integer [len];

		
		for (int j = 0; j < len; j++) {
			random_ar[j] = random.nextInt(10000);
			sorted_ar[j] = random_ar[j];
			
		}

	
		is.sort(sorted_ar);
		
		for(int l = 0; l< sorted_ar.length;l++) {
			
			if(l <=len/2)
			{
				partial_ar[l]= sorted_ar[l];
				
			}
			else
				partial_ar[l] = random_ar[l];
				
			reverse_ar[len-l-1] = sorted_ar[l];
			
		}
		System.out.println(Arrays.toString(random_ar));
		System.out.println("");
		System.out.println(Arrays.toString(sorted_ar));
		System.out.println("");
		System.out.println(Arrays.toString(partial_ar));
		System.out.println("");
		System.out.println(Arrays.toString(reverse_ar));
		System.out.println("");

		
		Benchmark_Timer<Integer[]> timer_r = new Benchmark_Timer<>("Benchmarking",null,(x) -> is.sort(x,0,x.length), null);
				
				Supplier sup_reverse = () -> reverse_ar;
				Supplier sup_random = () -> random_ar;
				Supplier sup_partial = () -> partial_ar;
				Supplier sup_sorted = () -> sorted_ar;
				
				double time_reverse = timer_r.runFromSupplier(sup_reverse, rep);
				
				System.out.println("For reverse array of length n " +len+ " mean time is " +time_reverse);
				System.out.println();
				
				double time_random = timer_r.runFromSupplier(sup_random,rep);
				System.out.println("For random array of length n " +len+ " mean time is " +time_random);
				System.out.println();
				
				double time_sorted = timer_r.runFromSupplier(sup_sorted,rep);
				System.out.println("For sorted array of length n " +len+ " mean time is " +time_sorted);
				System.out.println();
				
				double time_partial = timer_r.runFromSupplier(sup_partial,rep);
				System.out.println("For partial array of length n " +len+ " mean time is" +time_partial);
				System.out.println();

				
				
			}

}
				
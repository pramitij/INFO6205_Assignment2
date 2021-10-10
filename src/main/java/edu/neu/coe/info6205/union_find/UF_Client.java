package edu.neu.coe.info6205.union_find;
import java.util.Random;

	public class UF_Client {
	    public static int count(int n) {
	    	
	        int con = 0;
	        
	        UF_HWQUPC uf_obj = new UF_HWQUPC(n);
	       
	        
	        for(con =0;uf_obj.components()>1;con++){
	            Random random = new Random();
	            int a = random.nextInt(n);
	            int b = random.nextInt(n);
	            uf_obj.connect(a,b);
	        }
	        return con;
	    }

	    public static void main(String[] args) {
	        for(int i = 2500;i<=100000;i=i+2500){
	            int total = 0;
	            for(int j=0;j<100;j++){
	                int operation = count(i);
	                total +=operation;
	            }
	            int avg = total/100;
	            System.out.println("Number of count sites: "+i+",\t Number of runs: "+avg);
	        }
	    }
	}

	

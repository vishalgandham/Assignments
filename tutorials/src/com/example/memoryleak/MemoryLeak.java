package com.example.memoryleak;

import java.util.HashMap;
import java.util.Map;
import java.util.*;


public class MemoryLeak {
	   private Map cache = new HashMap();
	   public int square(int i) {
	      int result = i * i;
	      cache.put(i, result);
	      return result;
	   }
	   public static void main(String[] args) throws Exception {
	      MemoryLeak MemoryLeak = new MemoryLeak();
	      int i=0;
	      
	      while (true) 
	      {
	    	  i=i+1;
		         System.out.println("Answer " + MemoryLeak.square(i));

	    	  
	      }
	      }
	   }
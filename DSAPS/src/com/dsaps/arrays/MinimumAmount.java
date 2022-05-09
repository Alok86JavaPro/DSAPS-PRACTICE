package com.dsaps.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Alex has a list of items to purchase at a market. 
 * The owner offers to discount each item after the first one by the lowest marked price among the prior items. 
 * No items price can be discounted below 0, and the list of items may not be reordered. Calculate the payable amount.
 * 
 * For example: A list of items with price 2, 5, 1, and 4.
   Alex pays 2 for first item because there are no prior items bought. 
   The second item will cost 5-2 which is 3. So, his total cost is first item which is 2 now the 3 which is 5. 
   The 3rd item's actual price is 1. Now since he cannot pay 0, 
   he will say whatever the maximum of 1 - min of previous two items that he has bought which is 2 and 0. 
   So 1-2 is -1 and he cannot pay negative therefore he pays 0 cost for that. Then the 4th item cost is 4$. 
   The min among all items he has bought previously is 1$. So, 4-1 = 3. 
   Total he paid 2 +3 + 0 + 3 = 8 
   https://www.chegg.com/homework-help/questions-and-answers/def-calculateamount-prices-write-code-name-main-fptr-open-osenviron-outputpath-w-pricescou-q87819651
 */
public class MinimumAmount {
	
	public static void main(String[] args) {
		calculateAmount();
	}
	
	private static void calculateAmount() {
		List<Integer> prices = new ArrayList<Integer>();
//		prices.add(2);  // 2
//		prices.add(5); // 3  = 5 -2
//		prices.add(1); // 0 = 1-2 = -1 ==> 0
//		prices.add(4); // 3 = 4 -1 
		
		prices.add(10);  //10
        prices.add(18);//8         
        prices.add(1);//0
        prices.add(1);//0
        prices.add(16);//15
        prices.add(12);//11
        prices.add(10);//9
        prices.add(18);//17
        prices.add(19);//18
        prices.add(6);//5
        prices.add(6);//5
		
		int sum = prices.get(0);
		
		for(int i = 1; i <prices.size();i++) {
			List<Integer> mins = new ArrayList<Integer>();
			int j = 0;
			while(j < i) {
				int curMin = Math.min(prices.get(j), prices.get(j+1));
				mins.add(curMin);
				j++;
			}
			
			int min = Collections.min(mins);
			if(min > 0) {
				int price = prices.get(i) - min;
				sum+=price;
			}
		}
		System.out.println("TotalAmount: "+sum);
		
	}

}

package Java03.sec01;

import java.util.Scanner;

public class BubbleSort
{
    public static void getNumber(int[] num)
    {
        //입력 
    	Scanner sc = new Scanner(System.in);
    	
    	for(int i = 0; i < num.length; i++) {
    		num[i] = sc.nextInt();
    	}
    }
    
    public static void bubbleSort(int[] num)
    {
    	int empty;
         //정렬
    	for(int i = 0; i < num.length - 1; i++) {
    		for(int j = 0; j < num.length - 1 - i; j++) {
    			if(num[j] > num[j + 1]) {
        			empty = num[j + 1];
        			num[j + 1] = num[j];
        			num[j] = empty;
        		}
    		}
    	}
    }
    
    public static void main(String[] args)
    {
    	System.out.println("10개의 정수를 무작위로 입력하세요.");
    	
        int[] num = new int[10];

        getNumber(num);
        
        bubbleSort(num);
        
        //결과 출력 
        for(int i = 0; i < num.length; i++) {
        	System.out.printf("%d ", num[i]);
        }
        
    }
}

package Java03.sec02;

public class InsertSort
{
    public static void insertSort(int[] num)
    {	
       //삽입정렬 알고리즘 구현
    	int empty;
    	
    	for(int i = 0; i < num.length - 1; i++) {
    		for(int j = i + 1; j > 0; j--) {
    			if(num[j - 1] > num[j]) {
    				empty = num[j];
    				num[j] = num[j - 1];
    				num[j - 1] = empty;
    			}
    		}
    	}
    }

    public static void main(String[] args)
    {
        int num[] = {5, 3, 1, 4, 2};
        
        insertSort(num);
        
        //출력
        for(int i = 0; i < num.length; i++) {
        	System.out.printf("%d ", num[i]);
        }
    }
}

import java.util.Arrays;

public class program4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] firstArray = {2,5,8,9};        
	int[] secondArray = {15,3,7,12};   
	int fal = firstArray.length;         
	int sal = secondArray.length;   
	int[] result = new int[fal + sal];  
	System.arraycopy(firstArray, 0, result, 0, fal);  
	System.arraycopy(secondArray, 0, result, fal, sal);  
	System.out.println(Arrays.toString(result)); 
	}

}

package PractiseCode;

public class ContainerWithMostWater {

	//In this case, we will simply consider the area
	// for every possible pair of the
	// lines and find out the maximum area out of those.
	public static int maxArea(int[] height) {
		int maxarea = 0;
		for (int i = 0; i < height.length; i++)
			for (int j = i + 1; j < height.length; j++)
				maxarea = Math.max(maxarea, Math.min(height[i], height[j]) * (j - i));
		return maxarea;
	}

	public static void main(String [] args){
		int a[]={1,1};
		System.out.println(maxArea(a));
	}
}

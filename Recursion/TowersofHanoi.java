package Recursion;

public class TowersofHanoi {

	//Towers of Hanoi: In the classic problem of the Towers of Hanoi, you have 3 towers and N disks of
	//different sizes which can slide onto any tower. The puzzle starts with disks sorted in ascending order
	//of size from top to bottom (i.e., each disk sits on top of an even larger one). You have the following
	//constraints:
	//(1) Only one disk can be moved at a time.
	//(2) A disk is slid off the top of one tower onto another tower.
	//(3) A disk cannot be placed on top of a smaller disk.
	//Write a program to move the disks from the first tower to the last using stacks.

	//Take an example for 2 disks :
	//Let rod 1 = 'A', rod 2 = 'B', rod 3 = 'C'.
	//
	//Step 1 : Shift first disk from 'A' to 'B'.
	//Step 2 : Shift second disk from 'A' to 'C'.
	//Step 3 : Shift first disk from 'B' to 'C'.
	//
	//The pattern here is :
	//Shift 'n-1' disks from 'A' to 'B'.
	//Shift last disk from 'A' to 'C'.
	//Shift 'n-1' disks from 'B' to 'C'.

	static void towerOfHanoi(int n, char from_rod,
							 char to_rod, char aux_rod)
	{
		if (n == 1)
		{
			System.out.println("Move disk 1 from  "+
					from_rod+" to  "+to_rod);
			return;
		}
		towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
		System.out.println("Move disk "+ n + " from  " +
				from_rod +" to  " + to_rod );
		towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
	}

	// Driver code
	public static void  main(String args[])
	{
		int n = 2; // Number of disks
		towerOfHanoi(n, 'A', 'C', 'B'); // A, B and C are names of rods
	}
}


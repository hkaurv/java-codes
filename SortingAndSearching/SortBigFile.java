package SortingAndSearching;

public class SortBigFile {

	//Sort Big File: Imagine you have a 20 GB file with one string per line. Explain how you would sort
	//the file.


	//Solution: Divide the file into N chunks which are x megabytes each, where x
	// * is the amount of memory we have available. Each chunk is sorted separately
	// * and then saved back to the file system. Once all the chunks are sorted, we
	// * then merge the chunks according to the following algorithm:
	// *
	// * 1. Divide your memory into (N+1) parts. First N parts are used to read data
	// * from N chunks, the last one is used as a buffer.
	// *
	// * 2. Load data to fill the first N data parts from N chunks respectively,
	// * perform an N-way merge sort to the buffer.
	// *
	// * 3. While any data part is not empty, perform sort to the buffer.
	// *
	// * 4. If any data part is empty, load new content from the corresponding chunk.
	// *
	// * 5. If the buffer is full, write buffer to the disk as output file, clear
	// * buffer.
	// *
	// * 6. Repeat step 4-5 until all N chunks and buffer are empty.
	// *
	// * At the end, we have output that is fully sorted on the disk. This algorithm
	// * is known as external sort.
}

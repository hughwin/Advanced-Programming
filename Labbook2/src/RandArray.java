
public class RandArray {

	private Double[][] randArray;
	private int nCols;
	private int nRows;

	public RandArray(int nRows, int nCols) {

		this.nRows = nRows;
		this.nCols = nCols;
		randArray = new Double[nRows][nCols];

		for (int r = 0; r < nRows; r++) {
			for (int c = 0; c < nCols; c++) {
				randArray[r][c] = Math.random();
			}
		}

	}

	public double findLargest() {
		double largest = 0.0;
		
		for(int r=0;r<nRows;r++) {
			for(int c=0;c<nCols;c++) {
				if(randArray[r][c] > largest) {
					largest = randArray[r][c];
				}
			}
		
	}
		return largest; 
	}
	
	
	
}

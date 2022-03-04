import edu.princeton.cs.algs4.WeightedQuickUnionUF;

/* *****************************************************************************
 *  Name:              Maximus Boxill
 *  Coursera User ID:
 *  Last modified:
 **************************************************************************** */
public class Percolation {
    private static final int T = 0;
    private boolean[][] open;
    private int size;
    private int b;
    private int openSites;
    private WeightedQuickUnionUF quickFind;


    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        else {
            size = n;
            b = (size * size) + 1;
            quickFind = new WeightedQuickUnionUF((size * size) + 2);
            open = new boolean[size][size];
            openSites = 0;
        }
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        check(row, col);
        openSites++;
        open[row - 1][col - 1] = true;

        if (row == 1) {
            quickFind.union(indexPosition(row, col), T);
        }

        if (row == size) {
            quickFind.union(indexPosition(row, col), b);
        }
        if (row > 1 && isOpen(row - 1, col)) {
            quickFind.union(indexPosition(row, col), indexPosition(row - 1, col));
        }

        if (row < size && isOpen(row + 1, col)) {
            quickFind.union(indexPosition(row, col), indexPosition(row + 1, col));
        }

        if (col > 1 && isOpen(row, col - 1)) {
            quickFind.union(indexPosition(row, col), indexPosition(row, col - 1));
        }

        if (col < size && isOpen(row, col + 1)) {
            quickFind.union(indexPosition(row, col), indexPosition(row, col + 1));
        }
    }


    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        check(row, col);
        return open[row - 1][col - 1];
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
            check(row, col);
            // return quickFind.connected(t, indexPosition(row, col));
            return quickFind.find(T) == quickFind.find(indexPosition(row, col));

    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        return openSites;

    }

    // does the system percolate?
    public boolean percolates() {
        return quickFind.find(T) == quickFind.find(b);

    }


    private int indexPosition(int row, int col) {
        return size * (row - 1) + col;
    }

    private void check(int row, int col) {
       if (row <= 0 || row > size || col <= 0 || col > size) {
           throw new IllegalArgumentException();
       }
    }


    // test client (optional)
   /* public static void main(String[] args) {
    }
} */
}

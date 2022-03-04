import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

/*************************************
Author: Maximus Boxill
**************************************/
public class PercolationStats {
    private static final double S = 1.96;
    private final int count;
    private final double []avg;

    public PercolationStats(int n, int trials) {
        if (n <= 0 || trials <= 0) {
            throw new IllegalArgumentException("Wrong values :(");
        }
        count = trials;
        avg = new double[count];

        for (int i = 0; i < count; i++) {
            Percolation p = new Percolation(n);
            int open = 0;

            while (!p.percolates()) {
                int x = StdRandom.uniform(1, n + 1);
                int y = StdRandom.uniform(1, n + 1);

                if (!p.isOpen(x, y)) {
                    p.open(x, y);
                    open++;
                }
            }
            double average = (double) open / (n * n);
            avg[i] = average;
        }
    }

    public double mean() {
        return StdStats.mean(avg);
    }

    public double stddev() {
        return StdStats.stddev(avg);
    }

    public double confidenceLo() {
        return mean() - ((S * stddev()) / Math.sqrt(count));
    }

    public double confidenceHi() {
        return mean() + ((S * stddev()) / Math.sqrt(count));
    }


    public static void main(String []args) {
        int n = Integer.parseInt(args[0]);
        int t = Integer.parseInt(args[1]);
        PercolationStats p = new PercolationStats(n, t);

        String confidenceInterval = "[" + p.confidenceLo() + ", " + p.confidenceHi() + "]";
        System.out.println("mean                    = " + p.mean());
        System.out.println("stddev                  = " + p.stddev());
        System.out.println("95% confidence interval = " + confidenceInterval);

    }

}

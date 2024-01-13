package Collections_Generics_and_Stream_API.Quick_Compute_TreeSet;

import java.util.TreeSet;

// NumAvg class with numSet, addNum, and calAvg methods
class NumAvg {
    private TreeSet<Integer> numSet;

    public NumAvg() {
        this.numSet = new TreeSet<>();
    }

    public TreeSet<Integer> getNumSet() {
        return numSet;
    }

    public void setNumSet(TreeSet<Integer> numSet) {
        this.numSet = numSet;
    }

    public void addNum(int num) {
        if (num % 5 != 0 && num % 6 != 0) {
            numSet.add(num);
        }
    }

    public double calAvg() {
        if (numSet.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int num : numSet) {
            sum += num;
        }

        return (double) sum / numSet.size();
    }
}



import java.util.Comparator;
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        int difference = 0;
        nums.sort((a,b) -> a.compareTo(b));
        difference = nums.get(nums.size() - 1) - nums.get(0);
        return difference;
    }
}

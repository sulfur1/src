package algorithms;
//Бинарный поиск

import java.util.*;

public class Search {
    private int min;
    private int max;
    private  int mid;

    public Search() {
        this.min = 0;
        this.max = 0;
        this.mid = 0;
    }

    public int binarySearch(int[] nums, int target) {
        this.min = 0;
        this.max = nums.length - 1;

        while (min <= max) {
            this.mid = Math.round(((max - min)/2) + min);
            if (target == nums[mid]) return mid;
            else if (target < nums[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return -1;
    }
    public Integer binarySearch(List<Integer> nums, Integer target) {
        this.min = 0;
        this.max = nums.size() - 1;

        while (min <= max) {
            this.mid = Math.round(((max - min)/2) + min);
            if (target.equals(nums.get(mid))) return mid;
            else if (target.compareTo(nums.get(mid)) < 0) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] array = {-1, 2, 6, 7, 19, 20, 30};
        Integer[] integers = {-1, 2, 6, 7, 19, 20, 30};
        List<Integer> integerList = new ArrayList<>(Arrays.asList(integers));
        Search search = new Search();
        int target = search.binarySearch(array, 19);
        System.out.println(target);
        int targetTwo = search.binarySearch(integerList, 2);
        System.out.println(targetTwo);
        //System.out.println(Math.round((5-0)/2 + 0));
    }
}

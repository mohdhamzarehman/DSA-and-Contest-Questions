class Solution {
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length == 0) return 0; // Agar array empty ya null hai toh koi pairs nahi honge.
        return mergeSort(nums, 0, nums.length - 1); // Merge sort start karo pura array pe.
    }

    private int mergeSort(int[] nums, int low, int high) {
        if (low >= high) return 0; // Agar ek hi element ya invalid range hai toh pairs nahi honge.
        int mid = low + (high - low) / 2; // Array ko beech mein tod do.

        // Dono halves ke pairs count kar lo.
        int count = mergeSort(nums, low, mid) + mergeSort(nums, mid + 1, high);

        // Reverse pairs ko count karte hain.
        int j = mid + 1;
        for (int i = low; i <= mid; i++) {
            while (j <= high && nums[i] > 2L * nums[j]) {
                j++;
            }
            count += (j - mid - 1);
        }

        // Sorted merge karte hain.
        merge(nums, low, mid, high);
        return count; // Total reverse pairs return karo.
    }

    private void merge(int[] nums, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // Temporary sorted array.
        int left = low, right = mid + 1;

        // Dono sorted halves ko merge karte hain.
        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left++;
            } else {
                temp.add(nums[right]);
                right++;
            }
        }

        // Jo elements left array mein reh gaye unko add karo.
        while (left <= mid) {
            temp.add(nums[left]);
            left++;
        }

        // Jo elements right array mein reh gaye unko add karo.
        while (right <= high) {
            temp.add(nums[right]);
            right++;
        }

        // Original array mein sorted values copy kar lo.
        for (int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }
    }
}

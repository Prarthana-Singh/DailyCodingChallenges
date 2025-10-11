// Upper Bound
class Solution {
    int upperBound(int[] arr, int target) {
        int s = 0, e = arr.length - 1, res = arr.length;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] > target) {
                res = mid;
                e = mid - 1;
            } else s = mid + 1;
        }
        return res;
    }
}

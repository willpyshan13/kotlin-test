class Solution {
    fun peakIndexInMountainArray(arr: IntArray): Int {
        var left = 1;
        var right = arr.size -2
        var pos = 0
        while (left <= right){
            var mid = (left+ right) /2
            if (arr[mid] > arr[left]){
                pos = mid
                left = mid-1
            }else{
                right = mid+1
            }
        }
        return pos
    }
}

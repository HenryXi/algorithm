# Median of Two Sorted Arrays
[Problem Description](https://leetcode.com/problems/median-of-two-sorted-arrays/)

```
public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int length1 = nums1.length;
    int length2 = nums2.length;
    int left = (length1+length2+1)/2;
    int right = (length1+length2+2)/2;
    return (findKth(nums1,0,nums2,0,left)+findKth(nums1,0,nums2,0,right))/2.0;
}

private static int findKth(int[] nums1,int index1,int[] nums2,int index2,int k){
    if(index1>=nums1.length){
        return nums2[index2+k-1];
    }
    if(index2>=nums2.length){
        return nums1[index1+k-1];
    }
    if(k==1){
        int val1 = nums1[index1];
        int val2 = nums2[index2];
        if(val1<val2){
            return val1;
        }else{
            return val2;
        }
    }
    int midVal1 = (index1+k/2-1)<nums1.length?nums1[index1+k/2-1]:Integer.MAX_VALUE;
    int midVal2 = (index2+k/2-1)<nums2.length?nums2[index2+k/2-1]:Integer.MAX_VALUE;
    if(midVal1<midVal2){
        return findKth(nums1,index1+k/2,nums2,index2,k-k/2);
    }else{
        return findKth(nums1,index1,nums2,index2+k/2,k-k/2);
    }
}
```

| Runtime       | Memory     | 
| :------------- | :---------- |
| 2 ms | 39.9 MB	   |


[henryxi leetcode list](http://www.henryxi.com/leetcode)

EOF
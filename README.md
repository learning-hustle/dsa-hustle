# dsa-hustle
Learning Hustle for Data Structure and Algorithms

## Algorithms

### Arrays

#### - Merge

##### 1. Variation-1
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
and two integers m and n, representing the number of elements in nums1 and nums2.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function,
but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n,
where the first m elements denote the elements that should be merged,
and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
```
Input: 
nums1 = [1,2,3,0,0,0], m = 3, 
nums2 = [2,5,6], n = 3

Output: 
[1,2,2,3,5,6]
```

#### - Remove

##### 1. Variation-1
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
Consider the number of elements in nums which are not equal to val be k, To get accepted, you need to do the following things:
Change the array nums such that The first k elements of nums contain the elements which are not equal to val.
The remaining elements of nums are not important as well as the size of nums. Return k.
```
Input:
nums = [3, 2, 2, 3], val = 3
Output: 
2, nums = [2, 2, .., ..]
```

##### 2. Variation-2
   Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
   The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
   Consider the number of unique elements of nums to be k. To get accepted, you need to do the following things:
   Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially.
   The remaining elements of nums are not important as well as the size of nums. Return k.
```
Input:
nums = [0,0,1,1,1,2,2,3,3,4]
Output:
5, nums = [0,1,2,3,4,_,_,_,_,_]
```
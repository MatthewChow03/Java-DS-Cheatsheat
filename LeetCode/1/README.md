# [Problem 1](https://leetcode.com/problems/two-sum/)

## Problem Summary

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

## My Solution

Take advantage of the complement which is (target - currentValue). If target = 9, currentValue = 7, use a hashmap to search for the value 2.

Hashmap is <number, index>

Each time you do not find the complement, add the currentValue and index to the hashmap.

Since there is always a solution, the complement will always exist in the hashmap at some point in the looping process.

There exists two points in the array where the two complements are, and one of them will be put into the hashmap before the other has been reached.

### Thought Process

Another idea was to copy all of the values from the array into the hashmap before searching for the complement. 
There are edge cases where this doesn't work and would require extra logic.
For example, target = 4, currentValue = 2 could match with itself in the hashmap, so you would need to compare the index in the hashmap and the index of the currentValue and omit the currentValue if those two indexes are equal.

### Time Complexity

O(n) because the solution is found with 1 loop through array of given numbers

### Space Complexity

O(n) because a hashmap is created and may store all the numbers from the given array
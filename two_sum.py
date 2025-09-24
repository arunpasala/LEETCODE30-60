def two_sum(nums, target):
    num_map = {}  # Dictionary to store number and its index
    for i, num in enumerate(nums):
        complement = target - num
        if complement in num_map:
            return [num_map[complement], i]
        num_map[num] = i
    return []  # Return empty if no solution is found

print(two_sum([2, 7, 11, 15], 9))
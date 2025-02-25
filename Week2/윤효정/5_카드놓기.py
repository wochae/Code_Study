from itertools import permutations

n = int(input())
k = int(input())
nums = []

for i in range(n) :
    num = input()
    nums.append(num)

num_sets = set()

for c in permutations(nums, k): 
   num_sets.add("".join(c))
print(len(num_sets))
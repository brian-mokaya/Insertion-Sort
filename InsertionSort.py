nums =  [5,6,8,3,1,6]
n = len(nums)
for i in range(1, n):
    temp = nums[i]
    j=i-1
    while j>=0 and nums[j]>temp:
        nums[j+1] = nums[j]
        j-=1

    nums[j+1] = temp
    print(nums)
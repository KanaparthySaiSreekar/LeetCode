class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        list=[]
        for i in nums1:
            for j in nums2:
                if(i==j):
                    list.append(j)
                    nums2.remove(j)
                    break
        return list
        
class Solution:
    def findKthPositive(self, arr: List[int], k: int) -> int:
        final=[]

        for i in range(0,arr[len(arr)-1]+k+1):
            if i not in arr:
                final.append(i)
        return final[k]




        
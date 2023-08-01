
class Solution:
    def sortByBits(self, arr: List[int]) -> List[int]:
        def bits(x):
            return(bin(x).count('1'),x)

        arr.sort(key=bits)

        return arr
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res=defaultdict(list)
        for s in strs:
            sorts = ''.join(sorted(s))
            res[sorts].append(s)
        return list(res.values())
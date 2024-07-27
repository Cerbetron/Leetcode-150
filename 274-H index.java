class Solution {
    public int hIndex(int[] citations) {
        
        Arrays.sort(citations);       
        int n = citations.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            int hIndexCandidate = Math.min(citations[i], n - i);
            res = Math.max(res, hIndexCandidate);
        }
        return res;
    
    }
}
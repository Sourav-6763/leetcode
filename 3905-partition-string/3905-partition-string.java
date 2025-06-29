class Solution {
    public List<String> partitionString(String s) {
        Set<String> seen = new HashSet<>();
        List<String> result = new ArrayList<>();
        
        int start = 0;
        for (int end = 1; end <= s.length(); end++) {
            String segment = s.substring(start, end);
            if (!seen.contains(segment)) {
                result.add(segment);
                seen.add(segment);
                start = end;
            }
        }
        
        return result;
    }
}

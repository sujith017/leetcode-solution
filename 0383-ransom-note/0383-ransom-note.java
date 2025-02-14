class Solution {
    public boolean canConstruct(String r, String m) {
        if(r.length() > m.length())
        {
            return false;
        }
        int[] arr = new int[26];

        for(char rm : m.toCharArray())
        {
            arr[rm - 'a']++;
        }

        for(char rm : r.toCharArray())
        {
            if(arr[rm - 'a']==0) return false;

            arr[rm- 'a']--;
        }
        return true;
    }
}
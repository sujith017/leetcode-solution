class Solution {
    public List<String> stringMatching(String[] w) {
        List<String> st = new ArrayList<>();
        int n = w.length;
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(w[j].contains(w[i]) && i!=j)
                {
                    st.add(w[i]);
                    break;
                }
            }
        }
        return st;
    }
}
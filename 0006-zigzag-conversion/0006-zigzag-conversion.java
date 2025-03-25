class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows>s.length())
        {
            return s;
        }

        List<Character>[] rows = new ArrayList[numRows];

        for(int i = 0;i<numRows;i++)
        {
            rows[i] = new ArrayList<>();
        }
        int idx = 0;
        int d = 1;

        for(char a : s.toCharArray())
        {
            rows[idx].add(a);
            if(idx==0)
            {
                d = 1;
            }
            else if( idx == numRows -1)
            {
                d = -1;
            }
            idx+=d;
        }
        String str = "";
        for(List<Character> row : rows)
        {
            for(char c : row)
            {
                str = str+c;
            }
        }
        return str;
    }
}
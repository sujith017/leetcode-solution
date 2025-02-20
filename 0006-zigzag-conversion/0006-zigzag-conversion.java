class Solution {
    public String convert(String s, int numRows) {
        if(s.length() == 1 || numRows == 1)
        {
            return s;
        }
        List<Character>[] arr = new ArrayList[numRows];

        for(int i = 0;i< numRows;i++)
        {
            arr[i] = new ArrayList<>();
        }

        int d = 1;
        int idx = 0;

        for(char a : s.toCharArray())
        {
            arr[idx].add(a);

            if(idx == 0)
            {
                d = 1;
            }
            else if(idx == numRows - 1)
            {
                d = -1;
            }
            idx+=d;
        }
        String str = "";

        for(List<Character> a : arr)
        {
            for(char p : a)
            {
                str = str+p;
            }
        }
        return str;
    }
}
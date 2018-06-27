class Solution {
    public int numJewelsInStones(String J, String S) {
        
        char[] stonesIHave = S.toCharArray();   // convert String of stones I have into a character array
        char[] jewelsList = J.toCharArray();
        int jewelsCounter = 0;
        
        // go through distinct jewels list and increment counter every time you come across a jewel in the stones list
        for(char jewel : jewelsList){
            for (char stone : stonesIHave){
                if(jewel == stone){
                    jewelsCounter++;
                }    
            }
        }
        
        return jewelsCounter;
    }
}
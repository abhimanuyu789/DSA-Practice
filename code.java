class Solution {
    public boolean isBalanced(String num) {
        int evenSum=0;
        int oddSum=0;
        for(int i=0;i<num.length();i++){
            //Convert char into int:
            int digit=num.charAt(i) - '0';
            //Check Even or Odd:
            if(i%2==0){
                evenSum+=digit;
            }else{
                oddSum+=digit;
            }
        }
         return evenSum == oddSum;
    }
}
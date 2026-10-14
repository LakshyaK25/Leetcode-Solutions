class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb = new StringBuilder();
        if( sum > num*9) return "";
        for(int i=0; i<num; i++){
            if(sum >= 9){
                sb.append(9);
                sum -= 9;
            }
            else {
                sb.append(sum);
                sum = 0;
            }
        }
        return sb.toString();
    }
}
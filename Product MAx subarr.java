class Solution {
    public int maxProduct(int[] nums) {
        int pro = 1, max = nums [0];
        for (int i = 0 ; i < nums.length ; i++){
                pro = pro * nums [i];
                if (max < pro )   max = pro;
                if (max < nums [i]) max = nums [i] ;
                if (pro ==0)     pro = 1 ; 
        }
        pro =1;
        for (int i = nums.length-1; i >= 0  ; i--){
                pro = pro * nums [i];
                if (max < pro )   max = pro;
                if (max < nums [i]) max = nums [i] ;
                if (pro ==0)     pro = 1 ; 
        }
        return max ;
    }
}

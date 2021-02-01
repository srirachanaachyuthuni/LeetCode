class robber {
    public int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int choose = nums[0];
        int dontChoose = 0;
        int prev_choose = nums[0];

        for(int i=1; i<nums.length;i++){
            choose = dontChoose + nums[i];
            dontChoose = Math.max(prev_choose, dontChoose);
            prev_choose = choose;
        }
        return Math.max(choose, dontChoose);
    }
    public static void main(String[] args){
        robber r = new robber();
        System.out.println(r.rob(new int[]{1,2,3,1}));
    }
}
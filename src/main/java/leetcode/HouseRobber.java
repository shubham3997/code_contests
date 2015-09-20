package leetcode;

import learning.dp.BadNeighbours;

/**
 * Created by Chethan on 9/19/15.
 */
//https://leetcode.com/problems/house-robber/
public class HouseRobber {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        BadNeighbours badNeighbours = new BadNeighbours();
        return badNeighbours.maxDonations(nums);
    }
}

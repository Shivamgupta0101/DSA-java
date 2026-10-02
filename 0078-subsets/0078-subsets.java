class Solution {
    List<List<Integer>> res= new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        findSubset(nums,0,new ArrayList<>());
        return res;
        
    }

    public void findSubset(int[] nums, int index, List<Integer> sublist){
        if(index == nums.length){
            res.add(new ArrayList<>(sublist));
            return;
        }

        // pick
        sublist.add(nums[index]);
        findSubset(nums, index+1, sublist);

        //backtracking
        sublist.remove(sublist.size()-1);

        //No pick
        findSubset(nums,index+1, sublist);

    }
}
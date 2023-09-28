class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
          int max=0;
          List<Boolean> list = new ArrayList<>();

          for(int temp : candies){
                max = Math.max(max,temp);
          }
          for(int op : candies){
                if(op+extraCandies >= max)
                    list.add(true);
                else
                    list.add(false);
          }
      
      return list;
    }
}

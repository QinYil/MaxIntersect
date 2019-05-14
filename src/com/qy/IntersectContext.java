package com.qy;

public class IntersectContext {
    private int[][] regions;
    IntersectContext(int[][] regions){
        this.regions = regions;
        quickSort(regions);
    }
    int maxIntersect(){
        int max = -1;
      for (int i=0;i<regions.length-1;i++){
          System.out.println(regions[i][0]);
          Region var1 = new Region(this.regions[i]);
          Region var2 = new Region(this.regions[i+1]);
          while (var1.isContanin(var2)){
              Integer maxIntesect = var1.MaxIntesect(var2);
              max = max> maxIntesect ?max:maxIntesect;
              int index = ++i + 1;
              if (index>regions.length-1)
                  return max;
              var2 = new Region(this.regions[index]);
          }
          Integer maxIntesect = var1.MaxIntesect(var2);
          max = max> maxIntesect ?max:maxIntesect;
      }
      return max;
    }
    int[][] quickSort(int[][] sources){
        return quickSort(sources,0,sources.length-1);
    }
    int[][] quickSort(int[][] sources,int low,int high){
        if (low>=high){
            return null;
        }
        int[] key = sources[low];
        int i = low;
        int j = high;
        System.err.println(low+":"+high);
        while (low<high){
            while (low<high&&sources[high][0]>=key[0]){
                    high--;
            }
            if (low<high){
                    swap(sources,low,high);
                    low++;
            }
            while (low<high&&sources[low][0]<=key[0]){
                low++;
            }
            if (low<high){
                swap(sources,low,high);
                high--;
            }
        }
        //System.out.println(low+":"+high);
        quickSort(sources,i,low-1);
        quickSort(sources,low+1,j);
        return sources;
    }
  int[][] swap(int[][] sources,int from,int target){
        int[] temp =sources[target];
        sources[target] = sources[from];
        sources[from] = temp;
        return sources;
  }

}

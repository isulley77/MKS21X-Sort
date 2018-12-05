public class Sorts{

  public static void selectionSort(int[] ary){

    int[] sortedAry = new int[ary.length];
    int smallest = ary[1];

    for(int j = 0; j < ary.length; j++){

      for(int i = 0; i < ary.length; i++){
          if(ary[i] < smallest){
            smallest = ary[i];
            ary[i] = null;
          }
      }
      sortedary[j] = smallest;
    }

  }
}

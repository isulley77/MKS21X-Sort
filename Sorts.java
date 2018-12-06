public class Sorts{

  public static void selectionSort(int[] ary){

    int smallest = ary[0];

    for(int i = 0; i < ary.length; i++){
      for(int j = i ; j < ary.length; j++){
        if(ary[j] < smallest){
          smallest = ary[j];
          ary[j] = ary[i];
        }
      }
      ary[i] = smallest;
    }
  }
}

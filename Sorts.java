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

  public static void bubbleSort(int[] ary){
    if(!correct()){
      int holder = 0;
      for(int i = 0; i < ary.length; i++){

        for(int j = 1; j < ary.length; j++){
          if(ary[j] < ary[j-1]){

            holder = ary[j-1];
            ary[j-1] = ary[j];
            ary[j] = holder;
          }
        }
      }
    }
  }
}

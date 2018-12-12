public class Sorts{

  public static void selectionSort(int[] ary){



    for(int i = 0; i < ary.length -1; i++){
            int smallest = ary[i];
            
      for(int j = i + 1 ; j < ary.length; j++){
        if(ary[j] < smallest){
          smallest = ary[j];
          ary[j] = ary[i];
          ary[i] = smallest;
        }
      }
      
    }
  }

  public static void bubbleSort(int[] ary){
  
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
  public static void insertionSort(int[] ary){
    

  
    for(int i = 1; i < ary.length; i++){
        int current = ary[i];
        /*
      if(ary[i] < ary[i-1]){
        
        for(int j = ary.length - 1; j > -1; j--){
          if(current < ary[j]){
            ary[j+1] = ary[j];
            }
        }
            */
        int j = i - 1;
        while(j>= 0 && ary[j] > current){
            ary[j + 1] =ary[j];
            j--;
            }
        
        ary[j + 1] = current;
        }
    }
}


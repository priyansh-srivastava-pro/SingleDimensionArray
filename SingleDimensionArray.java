public class SingleDimensionArray{
  int arr[] = null;

  public SingleDimensionArray(int sizeOfArray){
    arr = new int[sizeOfArray];
    for(int i=0; i< arr.length;i++){
      arr[i] = Integer.MIN_VALUE;
    }
  }
  public void insert(int location, int valueToBeInserted)
  {
    try{
      if(arr[location] == Integer.MIN_VALUE){
        arr[location] = valueToBeInserted;
        System.out.println("Succesfully Inserted");
      }
      else{
        System.out.println("This cell is occupied");
      }
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("Invalid index to access array");
    }
  }

  public void traverseArray() {
    for(int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public void searchInArray(int valueToSearch) {
    for(int i = 0; i < arr.length; i++) {
      if(arr[i] == valueToSearch) {
        System.out.println("Value found at index no " +i);
        return;
      }
    }
    System.out.println(valueToSearch + "is not found");
  }

  public void deleteInArray(int deleteValue) {
    try{
      arr[deleteValue] = Integer.MIN_VALUE;
      System.out.println("The value to be deleted is deleted successfully");
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("the value you provided is not in the range of array");
    }
  }
}
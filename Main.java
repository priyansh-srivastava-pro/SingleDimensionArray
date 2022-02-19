class Main {
  public static void main(String[] args) {
    SingleDimensionArray sda = new SingleDimensionArray(10);
    sda.insert(0,0);
    sda.insert(1,10);
    sda.insert(2,20);
    sda.insert(1,30);
    sda.insert(12,25);

    System.out.println("Array Traversal");

    sda.traverseArray();

    sda.searchInArray(20);
    sda.searchInArray(10);

    sda.deleteInArray(8);
    System.out.print(sda.arr[8]);
  }
}
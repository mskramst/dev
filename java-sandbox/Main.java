class Main {

  public static void main(String[] args) {
    Item[] items = new Item[3];
    items[0] = new Item("Pencils", 1.99, 25);
    items[1] = new Item("Glue", 2.99, 9);
    items[2] = new Item("Notebook", 5.25, 2);
    for (int i = 0; i < items.length; i++) {
      System.out.println(items[i]);
    }
  }

}
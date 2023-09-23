class Item {
  private String name;
  private double price;
  private int quantity;

  public Item(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQuantity() {
    return this.quantity;
  }

  @Override
  public String toString() {
    return "{" +
        " name='" + getName() + "'" +
        ", price='" + getPrice() + "'" +
        ", quantity='" + getQuantity() + "'" +
        "}";
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

}

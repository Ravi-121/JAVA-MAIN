class Product {

  int item_no;
  String name;
  int price;
  int qty;

  public int getItem_On() {
    return item_no;
  }

  // we need just one item number we are not going to change it anyway..
  // public void setItem_On(int item_no){
  // if(item_no > 0 && no < 5760){
  // item_no = item_no;
  // }
  // else{
  // item_no = 0;
  // }
  // }
  public String getName() {
    return name;
  }

  // public void setName(String name){
  // if(name.matches("[A-Za-z]+")){
  // this.name = name;
  // }
  // else{
  // name = null;
  // }
  // }
  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    if (price < 0) {
      this.price = 0;
    } else {
      this.price = price;
    }
  }

  public int getQunt() {
    return qty;
  }

  public void setQunt(int qty) {
    if (qty < 0) {
      this.qty = 0;
    } else {
      this.qty = qty;
    }
  }

  Product(int item_no, String name, int price, int qty) {

    // Hard way..??
    if (item_no > 0 && item_no < 10000) {
      this.item_no = item_no;
    } else {
      item_no = 0;
    }
    if (name.matches("[A-Za-z]*")) {
      this.name = name;
    } else {
      name = null;
    }
    if (price < 0) {
      this.price = 0;
    } else {
      this.price = price;
    }
    if (qty < 0) {
      this.qty = 0;
    } else {
      this.qty = qty;
    }

    // Easy way..??
    // just call the set methos .
  }
}

// Note:- Our custemers are very good at filling their details..

class Customer {

  int cust_id;
  String cust_name;
  String address;
  long phone_no;

  public int getId() {
    return cust_id;
  }
  // ID will intialis at start like in constructor..

  public String getName() {
    return cust_name;
  }

  public void setName(String cust_name) {

    if (cust_name.matches("[A-Za-z]*")) {
      this.cust_name = cust_name;
    } else {
      this.cust_name = null;
    }
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public long getPhone_No() {
    return phone_no;
  }

  public void setPhone_No(long phone_no) {
    // We can only use .match on Strings..
    this.phone_no = phone_no;
  }

  Customer(int cust_id, String cust_name, String address, long phone_no) {

    this.cust_id = cust_id;
    setName(cust_name);
    setAddress(address);
    setPhone_No(phone_no);
  }

}

public class MainPro {

  public static void main(String[] args) {

    Product p1 = new Product(101, "Ravi", 10, 1);
    Customer c1 = new Customer(1, "Rv", "Open_Close", 90909090);

    p1.setPrice(1000);
    int x = p1.getItem_On();
    System.out.println("The Item number is:" + x);

    c1.setAddress("Close_Open");

  }
}
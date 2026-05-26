interface Member {
  void CallBack();
}

class Customer implements Member {
  String name;

  Customer(String name) {

    this.name = name;

  }

  @Override
  public void CallBack() {
    System.out.println("OK, I will visit, " + name);
  }

}

class Store {
  Member mem[] = new Member[10];
  int count = 0;

  void Register(Member M) {
    mem[count++] = M;
  }

  void inviteSale() {
    for (int i = 0; i < count; i++) {
      mem[i].CallBack();
    }
  }

}

public class MainApplication {
  public static void main(String[] args) {

    Store s = new Store();

    Customer c1 = new Customer("RV");
    Customer c2 = new Customer("VR");

    s.Register(c1);
    s.Register(c2);
    s.inviteSale();

  }
}

import java.util.*;

class Student {

  String rollNo;
  private static int count = 1;

  private String generateRollNo() {
    Calendar cal = Calendar.getInstance();
    int year = cal.get(Calendar.YEAR);

    String rollNo = "IT" + (year + "_" + count);

    count++;
    return rollNo;
  }

  public Student() {
    rollNo = generateRollNo();
  }
}

class Account {

  String account_No;
  private static int count = 1;

  private String generateAccountNo() {
    Calendar cal = Calendar.getInstance();
    int year = cal.get(Calendar.YEAR);

    String account_No = "BOB" + (year + "_" + count);

    count++;
    return account_No;
  }

  public Account() {
    account_No = generateAccountNo();
  }

}

class Custemmer {

  String custemmer_ID;

  private String generateCustemmerID(String name) {

    Date v = new Date();

    String custemmer_No = "Will" + (v.getTime() + "_By" + name);

    return custemmer_No;

  }

  public Custemmer(String custemmer_ID) {
    this.custemmer_ID = generateCustemmerID(custemmer_ID);
  }

}

public class MainSTUACCCUST {
  public static void main(String[] args) {

  }
}

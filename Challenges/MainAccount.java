class Account {

  long account_no;
  String name;
  String adderss;
  long phone_no;
  String date_of_birth;
  double balance;

  Account() {
  }

  Account(long account_no, String name, String address, long phone_no, String date_of_birth, double balance) {

    this.account_no = account_no;
    this.name = name;
    this.adderss = address;
    setPhone_No(phone_no);
    this.date_of_birth = date_of_birth;
    setBalence(balance);

  }

  public long getAccount_No() {
    return account_no;
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return adderss;
  }

  public long getPhone_No() {
    return phone_no;
  }

  public void setPhone_No(long phone_no) {
    String strPhone_no = phone_no + "";

    if (strPhone_no.matches("[0-9]*")) {
      this.phone_no = phone_no;
    } else {
      System.out.println("wrong number!!");
    }
  }

  public String getDOB() {
    return date_of_birth;
  }

  public double getBalence() {
    return balance;
  }

  public void setBalence(double balence) {
    String strBlance = balence + "";

    if (strBlance.matches("[0-9]*")) {
      this.balance = balence;
    } else {
      System.out.println("wrong entryy!!");
    }

  }

}

class SavingAccount extends Account {

  long fixedDeposit;
  long liquidate;

  public double Deposit(long deposite) {

    balance += deposite;
    return balance;
  }

  public double Withdraw(long withdraw) {
    balance -= withdraw;
    return balance;
  }

}

class LoanAccount extends Account {

  double lone;
  double repayMent;

  public double PayEMI(int EMI) {
    lone -= EMI;
    return lone;
  }

  public double TopUpLone(long topUpLoan) {
    lone += topUpLoan;
    return lone;
  }

}

public class MainAccount {
  public static void main(String[] args) {

    Account a1 = new Account();
    a1.setBalence(1000000);

    SavingAccount s1 = new SavingAccount();
    s1.Deposit(2000);

    LoanAccount l1 = new LoanAccount();
    l1.PayEMI(200);

  }

}

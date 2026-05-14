class Subject {

  int subject_id;
  String subject_name;
  int totalMarks;
  int obtainedMarks;

  Subject(int subject_id, String subject_name, int totalmarsk, int obtainedMarks) {
    this.subject_id = subject_id;
    this.subject_name = subject_name;
    setTotalMarks(totalmarsk);
    setObtainedMarks(obtainedMarks);
  }

  public int getSubjecctId() {
    return subject_id;
  }

  public String getSubjectName() {
    return subject_name;
  }

  public int getTotalMarks() {
    return totalMarks;
  }

  public void setTotalMarks(int totalMarks) {
    String markss = totalMarks + "";

    if (markss.matches("[0-9]*")) {
      this.totalMarks = totalMarks;
    }

    else {
      System.out.println("wrong thing man");
    }
  }

  public int getObtainedMarks() {
    return obtainedMarks;
  }

  public void setObtainedMarks(int obtainedMarks) {

    if (obtainedMarks >= 0 && obtainedMarks <= 100) {
      this.obtainedMarks = obtainedMarks;
    } else {
      System.out.println("wrong input man!");
    }
  }

}

class Student {

  int rollNo;
  String name;
  String department;
  String[] subject;

  public int getRollNo() {
    return rollNo;
  }

  public String getName() {
    return name;
  }

  public String getDepartment() {
    return department;
  }

  public String[] getSubject() {
    return subject;
  }

  public void setSubject(String... subject) {

    if (subject.length == 3) {
      this.subject = subject;
    } else {
      System.out.println("only 3 sub are needed");
    }
  }

}

public class MainSUBSTU {
  public static void main(String[] args) {

    Subject[] sub = new Subject[2];

    sub[0] = new Subject(101, "IT", 0, -1);
    sub[0].setTotalMarks(100);
    sub[0].setObtainedMarks(0);

    Student s1 = new Student();
    s1.setSubject("IT", "CS", "AL/ML");

  }

}

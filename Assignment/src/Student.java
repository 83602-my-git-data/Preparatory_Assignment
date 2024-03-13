
public class Student {
	    private String studentName;
	    private String rollNo;
	    private int totalMarks;

	    public Student(String studentName, String rollNo, int totalMarks) {
	        this.studentName = studentName;
	        this.rollNo = rollNo;
	        this.totalMarks = totalMarks;
	    }

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public String getRollNo() {
			return rollNo;
		}

		public void setRollNo(String rollNo) {
			this.rollNo = rollNo;
		}

		public int getTotalMarks() {
			return totalMarks;
		}

		public void setTotalMarks(int totalMarks) {
			this.totalMarks = totalMarks;
		}

		@Override
		public String toString() {
			return "Student [studentName=" + studentName + ", rollNo=" + rollNo + ", totalMarks=" + totalMarks + "]";
		}
         
}

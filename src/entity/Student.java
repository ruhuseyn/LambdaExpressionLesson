package entity;

    public class Student extends User{
        private String major;
        private String email;
        private Integer gpa;

        public Student(String fullName, int age, int id, String major, String email, Integer gpa) {
            super(fullName, age, id);
            this.major = major;
            this.email = email;
            this.gpa = gpa;
        }

        public Student() {
        }

        public String getMajor() {
            return major;
        }

        public void setMajor(String major) {
            this.major = major;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Integer getGpa() {
            return gpa;
        }

        public void setGpa(Integer gpa) {
            this.gpa = gpa;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "major='" + major + '\'' +
                    ", email='" + email + '\'' +
                    ", gpa=" + gpa +
                    '}';
        }
    }

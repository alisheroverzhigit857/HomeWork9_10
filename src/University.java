public class University {
    private String universityName;
   private int student ;
   private String course;

   public void setUniversityName (String universityName) {
       this.universityName=universityName;
   }
   public String getUniversityName () {
       return universityName;
   }
    public void setStudent (int student) {
        this.student=student;
    }
    public int getStudent () {
       return student;
    }
    public void setCourse (String course) {
       this.course=course;
    }
    public String getCourse () {
       return course;
    }


    @Override
    public String toString() {
        return
                " \nUniversity Name: '" + universityName +
                "'\nStudent: " + student +
                "\nCourse: " + course  ;
    }
}

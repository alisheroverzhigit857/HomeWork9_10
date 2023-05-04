public class School {
    private String schoolName;
    private int studentSchool;
    private String schoolAdress;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getStudentSchool() {
        return studentSchool;
    }

    public void setStudentSchool(int studentSchool) {
        this.studentSchool = studentSchool;
    }

    public String getSchoolAdress() {
        return schoolAdress;
    }

    public void setSchoolAdress(String schoolAdress) {
        this.schoolAdress = schoolAdress;
    }

    @Override
    public String toString() {
        return
                "\nSchool Name: '" + schoolName +
                "'\nStudent School: " + studentSchool +
                "\n SchoolAdress: " + schoolAdress ;
    }
}

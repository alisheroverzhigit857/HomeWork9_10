public class Main {
    public static void main(String[] args) {
        University university = new University();
        university.setUniversityName("Manas University ");
        university.setStudent(2000);
        university.setCourse("4 Course okuit");

        University university1 = new University();
        university1.setUniversityName("Jusup Balasagyn University ");
        university1.setStudent(3000);
        university1.setCourse("Max 5 course okuit ");

        University university2 = new University();
        university2.setUniversityName("OshMU ");
        university2.setStudent(4000);
        university2.setCourse("Max 6 course okuit ");

        University[] universities = {university, university1, university2};
        for (University u:universities) {
            System.out.println(u.toString());
        }
        System.out.println("-----------------------------------------------");

        School school = new School();
        school.setSchoolName("B.Sadykov N:19 ");
        school.setStudentSchool(1500);
        school.setSchoolAdress("region Batken, Aidarken Shaary ");

        School school1 = new School();
        school1.setSchoolName("Bakir Bainazarov");
        school1.setStudentSchool(2000);
        school1.setSchoolAdress("region Batken, Village Kara-Bak");

        School [] schools = {school,school};
        for (School s : schools) {
            System.out.println(s.toString());
        }
        System.out.println("----------------------------------------------");

        Car car = new Car();
        car.setCarName("BMW X7");
        car.setOldYear(2023);
        car.setCountry("Kyrgyzstan");

        Car car1 = new Car();
        car1.setCarName("Mersedes");
        car1.setOldYear(1984);
        car1.setCountry("Germany ");

        Car car2 = new Car();
        car2.setCarName("Audi A6");
        car2.setOldYear(2000);
        car2.setCountry("Germany");

        Car [] cars = {car,car1,car2};
        for (Car c : cars) {
            System.out.println(c.toString());
        }
        System.out.println("----------------------------------------------");

        Person person = new Person();
        person.setPersonName("Bilal");
        person.setBirthOfYear(2005);
        person.setCountryOfBrith("Kyrgyzstan");

        Person person1 = new Person();
        person1.setPersonName("Abdumalik");
        person1.setBirthOfYear(2004);
        person1.setCountryOfBrith("Kyrgyzstan");

        Person person2 = new Person();
        person2.setPersonName("Ronaldo");
        person2.setBirthOfYear(1985);
        person2.setCountryOfBrith("Portugal");

        Person [] people = {person,person1,person2};
        for (Person p : people) {
            System.out.println(p.toString());
        }
    }
}
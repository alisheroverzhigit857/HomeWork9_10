public class Person {
   private String personName;
   private int birthOfYear;
   private String countryOfBrith;

   public String getPersonName () {
      return personName;
   }
   public void setPersonName (String personName){
      this.personName=personName;
   }

   public int getBirthOfYear() {
      return birthOfYear;
   }

   public void setBirthOfYear(int birthOfYear) {
      this.birthOfYear = birthOfYear;
   }

   public String getCountryOfBrith() {
      return countryOfBrith;
   }

   public void setCountryOfBrith(String countryOfBrith) {
      this.countryOfBrith = countryOfBrith;
   }

   @Override
   public String toString() {
      return
              "\nPerson Name: " + personName +
              "\nBirth Of Year: " + birthOfYear +
              "\n Country Of Brith: " + countryOfBrith ;
   }
}

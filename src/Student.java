public class Student {

    // fields declaration
    private String registrationNumber;
    private int credits;
    private int levelOfStudies;



    // methods
    public void updateCredits(int numberOfCredits) {
        credits = credits + numberOfCredits;
    }

   public boolean progress(){
//        if (credits >= 120) {
//            return true;
//        }
//        return false;

//        return credits >= 120 ? true : false;

       return credits >= 120;
   }


    // --- setter getters
    public void setRegistrationNumber(String rn){
        registrationNumber = rn;
    }

    public void setCredits(int c) {
        credits = c;
    }

    public void setLevelOfStudies(int ls){
        levelOfStudies = ls;
    }

    public String getRegistrationNumber(){
        return registrationNumber;
    }

    public int getCredits(){
        return credits;
    }

    public int getLevelOfStudies(){
        return levelOfStudies;
    }

}

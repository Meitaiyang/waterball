import java.util.List;

public class Individual {

    private int id;
    private String gender;
    private int age;
    private String introduction;
    private List<String> habbits;
    private Coordicate coordicate;

    public void setId(int id) throws IllegalArgumentException {
        if (id < 0) {
            throw new IllegalArgumentException("Id must be greater than 0");
        }
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setGender(String gender) throws IllegalArgumentException{
        if (!"Female".equalsIgnoreCase(gender) && !"Male".equalsIgnoreCase(gender)) {
            throw new IllegalArgumentException("Gender must be either 'Female' or 'Male'");
        }
        this.gender = gender;
    }

    public String getGender(){
        return this.gender;
    }

    public void setAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be greater than 18");
        }
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setIntroduction(String introduction) throws IllegalArgumentException {
        int sentenceLength = introduction.length();
        if( sentenceLength < 0 || sentenceLength > 200) {
            throw new IllegalArgumentException("Introduction must be between 0 and 200 characters");
        }
        this.introduction = introduction;
    }

    public String getIntroduction() {
        return this.introduction;
    }

    public void setHabbits(List<String> habbits) throws IllegalArgumentException {
        for (String habbit : habbits) {
            if (habbit.length() < 1 || habbit.length() > 20) {
                throw new IllegalArgumentException("Habbit" + habbit + "Habbit must be between 1 and 20 characters");
            }
        }
        this.habbits = habbits;
    }


}
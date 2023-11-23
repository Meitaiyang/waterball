import static java.util.Objects.requireNonNull;

import java.util.List;

public class Individual {

    private int id;
    private String gender;
    private int age;
    private String introduction;
    private List<String> habits;
    private Coordicate coordicate;
    private Individual matchIndividual;

    public Individual(int id, String gender, int age, String intro, List<String> habits, Coordicate coordicate) throws Exception{
        setId(id);
        setGender(gender);
        setAge(age);
        setIntroduction(intro);
        sethabits(habits);
        setCoordicate(coordicate);
    }

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

    public void setAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be greater than 18");
        }
        this.age = age;
    }

    public void setIntroduction(String introduction) throws IllegalArgumentException {
        int sentenceLength = introduction.length();
        if( sentenceLength < 0 || sentenceLength > 200) {
            throw new IllegalArgumentException("Introduction must be between 0 and 200 characters");
        }
        this.introduction = introduction;
    }

    public void sethabits(List<String> habits) throws IllegalArgumentException {
        for (String habit : habits) {
            if (habit.length() < 1 || habit.length() > 20) {
                throw new IllegalArgumentException("habit" + habit + "habit must be between 1 and 20 characters");
            }
        }
        this.habits = habits;
    }

    public List<String> getHabits() {
        return this.habits;
    }

    public void setCoordicate(Coordicate coordicate) {
        this.coordicate = requireNonNull(coordicate, "Coordicate must not be null");
    }

    public Coordicate getCoordicate() {
        return this.coordicate;
    }

    public void setIndividual(Individual matchIndividual) {
        this.matchIndividual = requireNonNull(matchIndividual, "MatchIndividual must not be null");
    }

    public Individual getIndividual() {
        return this.matchIndividual;
    }

}

public class Slizaren extends Hogwarts {
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slizaren(String name, int skillMagic, int transgression, int trick, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, skillMagic, transgression);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getTrick() {
        return trick;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public void comparisonOfStudentsSlizaren(Slizaren[] students) {
        int sumSkill = this.trick() + this.determination() + this.ambition() + this.resourcefulness() + this.lustForPower();
        int sumSkillStudent = students.trick() + students.determination() + students.ambition() + students.resourcefulness() + students.lustForPower();
        if (sumSkill > sumSkillStudent) {
            System.out.println("Студент Слизарен " + this.getName() + " сильнее студента " + students.getName());
        } else if (sumSkill < sumSkillStudent) {
            System.out.println("Студент Слизарен " + students.getName() + " сильнее студента " + this.getName());
        } else {
            System.out.println("Силы студентов равны");
        }
    }
}
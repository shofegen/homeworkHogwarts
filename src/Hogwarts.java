public class Hogwarts {
    public String name;
    public int skillMagic;
    int transgression;

    @Override
    public String toString() {
        return "Студенты школы: " +
                "Студент: " + name +
                "Сила магии: " + skillMagic +
                "Расстояние трансгрессирования: " + transgression;
    }

    public Hogwarts(String name, int skillMagic, int transgression) {
        this.name = name;
        this.skillMagic = skillMagic;
        this.transgression = transgression;
    }
    public String getName() {
        return name;
    }

    public int getSkillMagic() {
        return skillMagic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setSkillMagic(int skillMagic) {
        this.skillMagic = skillMagic;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
    public void comparisonOfStudentsGriffindor(Griffindor[] students) {
        if (this.getSkillMagic() + this.transgression + this.nob)
    }

}
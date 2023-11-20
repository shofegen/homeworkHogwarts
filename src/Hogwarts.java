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
    public void comparisonOfStudentsHogwarts(Hogwarts students) {
        int sumSkill = skillMagic + transgression;
        int sumSkillStudent = students.skillMagic + students.transgression;
        if (sumSkill > sumSkillStudent) {
            System.out.println("Студент Хогвартс  " + this.getName() + " сильнее студента " + students.getName());
        } else if (sumSkill < sumSkillStudent) {
            System.out.println("Студент Хогвартс " + students.getName() + " сильнее студента " + this.getName());
        } else {
            System.out.println("Силы студентов равны");
        }
    }


}
public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

        public Hufflepuff(String name, int skillMagic, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, skillMagic, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public void comparisonOfStudentsHufflepuff(Hufflepuff students) {
        int sumSkill = industriousness + loyalty + honesty;
        int sumSkillStudent = students.industriousness + students.loyalty + students.honesty;
        if (sumSkill > sumSkillStudent) {
            System.out.println("Студент Пуффендуй " + this.getName() + " сильнее студента " + students.getName());
        } else if (sumSkill < sumSkillStudent) {
            System.out.println("Студент Пуффендуй " + students.getName() + " сильнее студента " + this.getName());
        } else {
            System.out.println("Силы студентов равны");
        }
    }
}


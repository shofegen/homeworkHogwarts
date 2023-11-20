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
    public void comparisonOfStudentsHufflepuff(Slizaren[] students) {
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


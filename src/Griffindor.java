public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

        public Griffindor(String name, int skillMagic, int transgression, int nobility, int honor, int bravery) {
        super(name, skillMagic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }
    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    public void comparisonOfStudentsGriffindor(Griffindor[] students) {
            int sumSkill = this.getNobility() + this.getHonor() + this.getBravery();
        int sumSkillStudent = students.getNobility() + students.getHonor() + students.getBravery();
        if (sumSkill > sumSkillStudent) {
            System.out.println("Студент Гриффиндора " + this.getName() + " сильнее студента " + students.getName());
        } else if (sumSkill<sumSkillStudent) {
            System.out.println("Студент Гриффиндора " + students.getName() + " сильнее студента " + this.getName());
        } else {
            System.out.println("Силы студентов равны");
    }
    }
}


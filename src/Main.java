public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.setCredits(120);
        student2.setCredits(50);

        student2.updateCredits(10);

        System.out.println("Maria's Credits:" + student1.getCredits());
        System.out.println("Nik's Credits:" + student2.getCredits());

        System.out.println("Maria's progress: " + student1.progress());

    }
}

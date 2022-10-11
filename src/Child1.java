public class Child1 {
    // Fields
    public String name;
    public int age;
    public String gender;
    // public static Child child = new Child("Bernard Sapida", 19, "Male");
    // public static Child3 parent = new Child3();

    // Constructors
    // Child1(String name1, int age1, String gender1) {
    //     name = name1;
    //     age = age1;
    //     gender = gender1;
    //     System.out.println(name + " " + age + " " + gender);
    // }
    
    // Main
    public static void main(String[] args) throws Exception {
        Child2 child2 = new Child2();
        Child3 child3 = new Child3();
        // child2.talent = "Dancing";

        // System.out.println(child2.talent);
        // System.out.println(child3.talent); // Dancing
        // Child3 child3 = new Child3();
        // Child2 child4 = new Child4();

        System.out.println(child2.childVoice("Child 2 Voice"));;
        System.out.println(child3.childVoice("Child 3 Voice"));;
        // child4.childVoice();
    }

    // Methods
    public static void startApp() {
        // Parent.printChildInformation();
        // parent.printChildInformation();
        // System.out.println(child.getName());
        // System.out.println(child.getAge());
        // System.out.println(child.getGender());
    }

    // Static => Acccessible to main method / Part of main method
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    // Method Overloading => arguments lengths and data types
    // public int addMoney(int money1, int money2) {
    //     return money1 + money2;
    // }

    // public double addMoney(double money1, double money2, double money3) {
    //     return money1 + money2 + money3;
    // }
}
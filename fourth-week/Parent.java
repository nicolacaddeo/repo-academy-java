public class Parent {
    void show() {
        System.out.println("Parent's show()");
    }
}

class Child extends Parent {
    @Override
    void show() {
        super.show();
        System.out.println("Childe show()");
    }
}

class Main {
    public static void main(String[] args) {
        Parent object = new Child();
        object.show();
    }
}

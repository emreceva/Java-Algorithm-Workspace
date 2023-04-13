public class Inheritance {

    class Animal {
        String color;
    }


    class Cat extends Animal {
        void meow() {
            System.out.println("Meow");
        }
    }

    interface I {
        void foo();
    }

    class A implements I {

        @Override
        public void foo() {

        }
    }
    class B implements I {

        @Override
        public void foo() {

        }
    }
}

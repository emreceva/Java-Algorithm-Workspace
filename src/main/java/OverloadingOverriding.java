public class OverloadingOverriding {
    class Foo{
        void print(String s){
            System.out.println(s);
        }

        void print(String s, int count){
            while(count>0){
                System.out.println(s);
                count--;
            }
        }
    }


    class Base {
        void printName(){
            System.out.println("Base Class");
        }
    }

    class Child extends Base {
        @Override
        void printName() {
            System.out.println("Child Class");
        }
    }
}

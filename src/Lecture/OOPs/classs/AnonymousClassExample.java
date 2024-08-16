package Lecture.OOPs.classs;

public class AnonymousClassExample {
    interface HelloWorld{
        public void greet();
        public void greetSomeone(String someone);
    }

    public void sayHello(String country){
        class EnglishGreeting implements HelloWorld{
            String name="World";
            @Override
            public void greet(){
                greetSomeone("world");
            }

            @Override
            public void greetSomeone(String someone) {
                name=someone;
                System.out.println("Hello "+name+" :"+country);
            }
        }
        HelloWorld englishGreeting = new EnglishGreeting();

        // Anonymous Class:- an anonymous class is an expression
        HelloWorld frenchFrenchGreeting = new HelloWorld(){
            String name="tout le monde";
            public void greet(){
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone){
                name=someone;
                System.out.println("Sault "+name);
            }
        };

        //Anonymous Class.
        HelloWorld  spanishGreeting= new HelloWorld() {
            @Override
            public void greet() {
                greetSomeone("mundo");
            }

            @Override
            public void greetSomeone(String someone) {
                String name=someone;
                System.out.println("Hola, "+name);
            }
        };
        englishGreeting.greet();
        frenchFrenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }

    public static void main(String[] args) {
        AnonymousClassExample myApp= new AnonymousClassExample();
        myApp.sayHello("India");
    }
}

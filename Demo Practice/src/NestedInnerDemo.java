// File: NestedInnerDemo.java
public class NestedInnerDemo {
    public String outerField = "outer";

    // Static nested
    public static class StaticNested
    {
        public void show() {
            System.out.println("StaticNested: no access to outerField");
        }
    }

    // Inner (non-static)
    public class Inner {
        public void show() {
            System.out.println("Inner: can access outerField => " + outerField);
        }
    }

    public void localAndAnonymous() {
        final String localVar = "local";
        class LocalClass {
            void show()
            { System.out.println("LocalClass: localVar = " + localVar); }
        }
        LocalClass lc = new LocalClass();
        lc.show();

        Runnable anon = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hi");
            }
        };
        anon.run();
    }

    public static void main(String[] args) {
        // static nested
        NestedInnerDemo.StaticNested sn = new NestedInnerDemo.StaticNested();
        sn.show();

        // inner requires outer instance
        NestedInnerDemo outer = new NestedInnerDemo();
        NestedInnerDemo.Inner inner = outer.new Inner();
        inner.show();

        // local and anonymous
        outer.localAndAnonymous();

        // Anonymous Class
        MyInterface my = new MyInterface() {
            @Override
            public void showing() {
                System.out.println("Showing");
            }
        };
        my.showing();
    }
}

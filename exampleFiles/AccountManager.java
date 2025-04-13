public class AccountManager {
    public String n;
    public int a;

    public AccountManager(String name, int age) {
        this.n = name;
        this.a = age;
    }

    public void d() {
        if (a < 18) {
            System.out.println("No access");
        } else {
            System.out.println("Welcome " + n);
        }
    }

    public void p() {
        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.println("Checking " + i);
            }
        }
    }

    public void x(int y) {
        if (y == 1234) {
            System.out.println("Access granted");
        } else {
            System.out.println("Denied");
        }
    }
}


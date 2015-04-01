import java.util.regex.Pattern;

public class Username {

    // Potentially useless note: (int) '0' == 48, (int) 'a' == 97

    // Instance Variables (remember, they should be private!)
    // YOUR CODE HERE
    String name;

    public Username() {
        char c1 = (char) (Math.random() * 11)
        char c2 = (char) (97 + (int) (Math.random() * 26))
        char c3 = (char) (97 + (int) (Math.random() * 26))
        return ("" + c1) + c2 + c3;
    }

    public Username(String reqName) {
        if (reqName == null) {
            String msg = "Your name is null";
            throw new NullPointerException(msg);
        }

        // Check for length
        if (reqName.length() != 3) {
            String msg = "Your name isn't of length 3";
            throw new IllegalArgumentException(msg);
        }

        // Check for illegal characters
        if (!Pattern.matches("[0-9][a-zA-z][a-zA-z]", reqName)) {
            String msg = "Your name does not match the required format";
            throw new IllegalArgumentException(msg);
        }

        // The input is good. Let's roll.
        this.name = reqName;
    }

    @Override
    public boolean equals(Object o) {
        // YOUR CODE HERE
        //
        if (o != null && o instanceof Username) {
            Username u = (username) o;
            char c1 = 
        }
        return false;
    }

    @Override
    public int hashCode() { 
        // YOUR CODE HERE
        return 0;
    }

    public static void main(String[] args) {
        // You can put some simple testing here.
    }
}

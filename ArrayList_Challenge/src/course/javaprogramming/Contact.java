package course.javaprogramming;

public class Contact {
    private String name;
    private int mobileNumber;

    public Contact( String name, int mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }
}

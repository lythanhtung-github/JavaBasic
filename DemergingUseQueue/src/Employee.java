public class Employee {
    private String fullName;
    private boolean gender;
    private String dateOfBirth;

    public Employee(String fullName, boolean gender, String dateOfBirth) {
        this.fullName = fullName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", gender=" + gender +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}

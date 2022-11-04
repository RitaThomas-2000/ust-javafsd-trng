import java.util.Objects;

/**
 * The type Student.
 */
public class Student {
    /**
     * The Name.
     */
    String name;
    /**
     * The Age.
     */
    int age, /**
     * The rollNo.
     */
    rollNo;

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Gets rollNo.
     *
     * @return the rollNo
     */
    public int getrollNo() {
        return rollNo;
    }


    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && rollNo == student.rollNo && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, rollNo);
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Sets rollNo.
     *
     * @param rollNo the rollNo
     */
    public void setrollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}

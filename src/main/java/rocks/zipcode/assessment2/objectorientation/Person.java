package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    private Long id;
    private String name;
    private Address address;
    public Person(Long id, String name, Address address) {
    }

    public Person() {
        this.id = 0L;
        this.name = "";
        this.address = new Address();
    }

    public Long getId() {

        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {

        return this.address;
    }

    public void setAddress(Address address) {
        //Person person = new Person();
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        Person person = (Person) o;
        if(getId().equals(((Person) o).getId()) && getName().equals(((Person) o).getName()) && getAddress().equals(((Person) o).getAddress()) ) {
            return true;

        }

        return false;
    }
    public String toString() {
        return "Person{id="+getId()+", name='"+getName()+"', address= "+getAddress()+"}";

    }
}
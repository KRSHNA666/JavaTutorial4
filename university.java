class University {
    String universityName;

    // Constructor
    University(String name) {
        this.universityName = name;
    }

    // Static Nested Class (Library)
    static class Library {
        String libraryName;

        Library(String name) {
            this.libraryName = name;
        }

        void displayLibrary() {
            System.out.println("Library Name: " + libraryName);
        }
    }

    // Inner Class (Department)
    class Department {
        String departmentName;

        Department(String name) {
            this.departmentName = name;
        }

        void displayDepartment() {
            System.out.println("Department Name: " + departmentName);
            System.out.println("University Name: " + universityName);
        }
    }

    public static void main(String[] args) {
        // Creating Library Object (Static Nested Class)
        University.Library lib = new University.Library("Central Library");
        lib.displayLibrary();

        // Creating University Object
        University uni = new University("ABC University");

        // Creating Department Object (Inner Class)
        University.Department dept = uni.new Department("Computer Science");
        dept.displayDepartment();
    }
}

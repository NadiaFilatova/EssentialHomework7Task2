package homework;

public class Worker implements Comparable<Worker> {
    private final String surname;
    private final String nameWork;
    private final int year;

    public Worker(String surname, String nameWork, int year) {
        this.surname = surname;
        this.nameWork = nameWork;
        this.year = year;

    }


    @Override
    public int compareTo(Worker worker) {
        return this.surname.compareTo(worker.surname);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "surname='" + surname + '\'' +
                ", nameWork='" + nameWork + '\'' +
                ", year=" + year +
                '}';
    }
}

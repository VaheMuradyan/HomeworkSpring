public class Bank {
    private double cahsh;
    private Human director;

    public Bank(double cahsh) {
        this.cahsh = cahsh;
    }

    public double getCahsh() {
        return cahsh;
    }

    public Human getDirector() {
        return director;
    }

    public void setDirector(Human director) {
        this.director = director;
    }
}

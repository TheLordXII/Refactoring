package classes;

class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public double getCharge() {
        double result = 0;
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (getDaysRented() > 2)
                    result += (getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                result += getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (rental.getDaysRented() > 3)
                    result += (getDaysRented() - 3) * 1.5;
                break;
            default:
                System.out.println("No price category found.");
                break;
        }
        return result;
    }

    public int getFrequentRenterPoints(){
        if((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1){
            return 2;
        }
        return 1;
    }
}
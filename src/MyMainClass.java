import love.programming.Book;
import love.programming.Country;

public class MyMainClass {

    public static void main(String[] args) {

        Book bookobj1 = new Book();
        Book bookobj2 = new Book("Genre:Romantic");
        Book bookobj3 = new Book("Genre:Comedy"+",","Name:Three Men In A Boat");
        Book bookobj4 = new Book("Genre:Thriller"+",","Name:Last Breath"+",","pages:126");
        Book bookobj5 = new Book("Genre:Fantasy"+",","Name:Harry Potter"+",",
                "Pages:180"+",","Author:J K Rowling");


        
        Country countryobj1 = new Country();
        Country countryobj2 = new Country("country india");
        Country countryobj3 = new Country("country uk" +", ", "population 66.96 million");
        Country countryobj4 = new Country("country egypt"+",", "population 97 million"+",",
                "continent Africa");
        Country countryobj5 = new Country("country Jamaica"+",", "population 2.9 million"+",",
                "continent North America"+",", "gdpvalue $15.42 billion USD");
    }
}







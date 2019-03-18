package love.programming;

public class Country {
    private String countryName;
    private String noOfPopulation;
    private String continentName;
    private String gdpValueOfCountry;

    public Country() {
        this("defaultcountryName",  "defaultnoOfPopulation" , "defaultcontinentName",
                 "defaultgdpValueOfCountry");
    }

    public Country(String countryName) {
        countryName = countryName;
        System.out.println(countryName);
    }

    public Country(String countryName, String noOfPopulation) {
        this.countryName = countryName;
        this.noOfPopulation = noOfPopulation;
        System.out.println(countryName +" " +noOfPopulation);
    }

    public Country(String countryName, String noOfPopulation, String continentName) {
        this.countryName = countryName;
        this.noOfPopulation = noOfPopulation;
        this.continentName = continentName;
        System.out.println(countryName +" " +noOfPopulation +" "+ continentName);
    }

    public Country(String countryName, String noOfPopulation, String continentName, String gdpValueOfCountry) {
        this.countryName = countryName;
        this.noOfPopulation = noOfPopulation;
        this.continentName = continentName;
        this.gdpValueOfCountry = gdpValueOfCountry;
        System.out.println(countryName+" " + noOfPopulation+" " + continentName+" " + gdpValueOfCountry);
    }
}

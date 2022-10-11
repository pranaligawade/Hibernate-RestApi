package Jsondemo;

public class Address {
     private  int add_id;
     private  String street;
     private String city;
     private  String state;
     private  String  zip;
     private  String country;
    private  String[] languages;

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Address() {
    }

    public Address(int add_id, String street, String city) {
        this.add_id = add_id;
        this.street = street;
        this.city = city;
    }

    public int getAdd_id() {
        return add_id;
    }

    public void setAdd_id(int add_id) {
        this.add_id = add_id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

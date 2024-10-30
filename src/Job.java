class Job {
    private String street;
    private String city;
    private String zipCode;
    private String country;

    public Job(String street, String city, String zipCode, String country) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
    }

    public String getAddress() {
        return street + ", " + city + ", " + zipCode;
    }

    public boolean isLocal() {
        return country.equals("USA");
    }
}

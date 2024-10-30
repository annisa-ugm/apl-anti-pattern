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

    public Job address() {
        return this;
    }

    public String street() {
        return street;
    }

    public String city() {
        return city;
    }

    public String zipCode() {
        return zipCode;
    }

    public String country() {
        return country;
    }
}

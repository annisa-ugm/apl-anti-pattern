//Class ini dipake untuk save detail alamat dulu
class Address {
    private String street;
    private String city;
    private String zipCode;
    private String country;

    public Address(String street, String city, String zipCode, String country) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
    }

    public String street() { //sebenarnya gausah pake method2 ini gpp karena bisa pake method toString aja
        return street;       //kecuali kalo nanti perlu akses ke alamat tsb secara spesifik di tempat lain
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

    // Method ini memberikan representasi lengkap alamat sebagai satu string
    @Override
    public String toString() {
        return street + ", " + city + ", " + zipCode + ", " + country;
    }
}
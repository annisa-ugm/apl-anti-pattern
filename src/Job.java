//class Job {
//    private String street;
//    private String city;
//    private String zipCode;
//    private String country;
//
//    public Job(String street, String city, String zipCode, String country) {
//        this.street = street;
//        this.city = city;
//        this.zipCode = zipCode;
//        this.country = country;
//    }
//
//    public String getAddress() {
//        return street + ", " + city + ", " + zipCode;
//    }
//
//    public boolean isLocal() {
//        return country.equals("USA");
//    }
//}


//class job diubah biar bisa nyimpan objek address dan nampilin alamat tanpa
//memaparkan detail Address langsung ke Candidate

//class ini juga bertanggung jawab untuk kasih info alamat secara keseluruhan
//dan nentuin apakah pekerjaan bersifat lokal
class Job {
    private Address address;

    public Job(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    // Menyediakan method untuk mengecek apakah pekerjaan lokal atau tidak
    public boolean isLocalJob() {
        return address.country().equals("USA"); // contoh: "USA" sebagai negara kandidat
    }

    // Method untuk mendapatkan representasi alamat sebagai teks
    public String getAddressInfo() {
        return address.toString();
    }
}
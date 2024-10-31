//class Candidate {
//    void printJobAddress(Job job) {
//        System.out.println("This is your position address");
//        System.out.println(job.getAddress());
//
//        if (job.isLocal()) {
//            System.out.println("It is a local job");
//        }
//    }
//}

//Candidate tidak lagi mengetahui detail internal Job atau Address kaya street,
//city, zipcode. Gantinya, hanya manggil getAddressInfo() dan isLocalJob() dari Job

//jadi Candidate hanya bertugas mencetak alamat pekerjaan tanpa mengakses detail alamat
//secara langsung
class Candidate {
    void printJobAddress(Job job) {
        System.out.println("This is your position address:");
        System.out.println(job.getAddressInfo()); // Menggunakan method getAddressInfo dari Job

        if (job.isLocalJob()) { // Menggunakan method isLocalJob
            System.out.println("It is a local job");
        }
    }
}
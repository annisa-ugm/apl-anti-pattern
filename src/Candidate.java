class Candidate {
    void printJobAddress(Job job) {
        System.out.println("This is your position address");

        // Inappropriate intimacy: Candidate langsung mengakses method street(), city(), dan zipCode() dari Job.
        // Hal ini membuat Candidate terlalu tahu detail internal Job, melanggar prinsip encapsulation.
        System.out.println(job.address().street());
        System.out.println(job.address().city());
        System.out.println(job.address().zipCode());

        // Inappropriate intimacy: Candidate mengetahui dan membandingkan detail negara dari Job.
        // Hal ini seharusnya menjadi tanggung jawab Job untuk menentukan apakah lokasi adalah "local job".
        if (job.address().country().equals(job.country())) {
            System.out.println("It is a local job");
        }
    }
}

//di method printJobAddress, akses langsung ke job.address().street(), dll
//itu yg mengindikasikan inappropriate intimacy. Seharusnya class job sendiri
//yang bertanggung jawab menyajikan detail alamat dalam bentuk yg lbh
//terenkapsulasi, misalnya pake 1 method yang ngembaliin alamat scr lengkap

//candicate jg mengecek apakah job.address().country() == job.country, nah disini
//juga inappropriate karena candidate punya akses langsung ke detail negara di Job,
//yang seharusnya menjadi tanggung jawab Job utk menentukan apakah pekerjaan
//tersebut adl pekerjaan lokal
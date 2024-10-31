//public class Main {
//    public static void main(String[] args) {
//        Job job = new Job("123 Main St", "Springfield", "12345", "USA");
//        Candidate candidate = new Candidate();
//        candidate.printJobAddress(job);
//    }
//}

public class Main {
    public static void main(String[] args) { //jadi bikin objek Address dulu baru di assign ke objek Job
        Address address = new Address("123 Main St", "Springfield", "12345", "USA");
        Job job = new Job(address);
        Candidate candidate = new Candidate();
        candidate.printJobAddress(job);
    }
}
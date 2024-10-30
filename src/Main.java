public class Main {
    public static void main(String[] args) {
        Job job = new Job("123 Main St", "Springfield", "12345", "USA");
        Candidate candidate = new Candidate();
        candidate.printJobAddress(job);
    }
}

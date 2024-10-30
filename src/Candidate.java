class Candidate {
    void printJobAddress(Job job) {
        System.out.println("This is your position address");
        System.out.println(job.getAddress());

        if (job.isLocal()) {
            System.out.println("It is a local job");
        }
    }
}

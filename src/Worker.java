
public class Worker {

    private int phone;
    Job job;
    private int rate;
    private String name;

   
    public void worker(String name, int phone, Job job) {
        name = this.name;
        phone = this.phone;
        job = this.job;
    }

    public String inputExpertiese(int x) {
        String s = " ";
        switch (x) {
            case 1 -> s = "0 years";
            case 2 -> s = "1-2 years";
            case 3 -> s = "more than 2 years";
        }

        return s;
    }

    public String editInfo() {

        return "";
    }

    public boolean contactCustomer() {

        return true;
    }

    public boolean rateWorker(int rate) {
        rate = this.rate;
        String r = Integer.toString(rate);
        boolean a = false;
        if (r != null) {
            a = true;
        }
        return a;
    }

    public boolean contactWorker() {

        return true;
    }

}

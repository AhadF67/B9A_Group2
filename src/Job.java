
public class Job {

    private String jobType;
    
     public String Type(int x) {
        String s = " ";
        switch(x){
            case 1 -> s= "Plumber";
            case 2 -> s= "Construction";
            case 3 -> s= "Electricity";
        }
        this.jobType= s;
        return s;
    }

}

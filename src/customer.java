
import java.util.Scanner;

public class customer {
      
    private int PhoneNumber=0;
    private String address=null;
   private  int chooseService=0;
    private  int selectWorker=0;
     private  String searchService=null;
 
    public customer(){
        
    }
    private String []Service={"plumbrs","construction","electricity"};
    private String []NameW={"salem","awad","mazen","Mohammed","Ali","Ahmed","Fars","Anas","Saif"};
          Scanner input=new Scanner(System.in);
     public boolean chooseService(){
        chooseService=this.chooseService;
        String c=Integer.toString(chooseService);
     if ( chooseService>Service.length-1)
          return false;
     else
          return true;
         
         
        }
         public boolean searchService(){
             for (int i=0;i<Service.length;i++){
          if (searchService.matches(Service[i]))
                return true;
              }
            
          return false;
            
        }

    public String getSearchService() {
        return searchService;
    }

    public void setSearchService(String searchService) {
        this.searchService = searchService;
    }
            public boolean selectWorker(){
                
                if (selectWorker>NameW.length-1)
                 return false;
                else
                  return true;   
        }
       public boolean contactSupport(){
            return true;
            
        }
          public void setChooseService(int chooseService) {
        this.chooseService = chooseService;
    }

    public void setSelectWorker(int selectWorker) {
        this.selectWorker = selectWorker;
    }

    public int getChooseService() {
        return chooseService;
    }

    public int getSelectWorker() {
        return selectWorker;
    }
}

    


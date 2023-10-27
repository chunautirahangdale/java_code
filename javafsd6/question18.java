public class question18 {
  
    
  public static void main(String[] args) {
    int cp=15200;
    int sp=17500;
    int p,l;
    if (sp>cp){
        p=sp-cp;
        System.out.println("profile:"+p);
    }
    else if (sp<cp){
        l=cp-sp;
        System.out.println("loss:"+l);
    }
    else{
      System.out.println("no profile no less");  
    }
  }  
}

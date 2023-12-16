public class Person {
    public static void main(String[] args) {
        Person p = new Person(-5);
        p.amIOld();
        p.yearPassed();
        p.amIOld();
    }

    
       private  int age;

        Person (int inital_age){
            if(inital_age>0){
                this.age=inital_age;
            }else{
                this.age=0;
                System.out.println("Age is Not Valid!!");
                
            }
          
        }

        public void yearPassed(){
            age++;
        }   

        public void amIOld(){
            if(age < 0){
                return;
            }
            if(age<13){
                System.out.println("Your Young !!");
            }else if (age>=13 && age<18){
                System.out.println("Your a teenager !!");
            }else{
                System.out.println("Your Old!!");
            }
        }   
    
    
    
}

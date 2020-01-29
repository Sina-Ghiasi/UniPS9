public class Main {
    private static boolean checkStr(String temp){
        return !temp.matches ("[a-z&A-Z]+");
    }
    private static boolean numberChecker(String temp){
        return !temp.matches ("[0-9]+");
    }

    public static void Controller(String fullName,String age,String workExp,String telephone,String email,String address ,boolean confirm)throws Exception{
            if(fullName.trim().length()==0 ||checkStr(fullName)){
                throw new Exception("* Invalid full name ");
            }

            if(age.trim().length()==0 || numberChecker(age)){
                throw new Exception("* Invalid age ");
            }

            if(workExp.trim().length()==0 || checkStr(workExp)){
                throw new Exception("* Empty or invalid work excperience");
            }

            if(telephone.trim().length()==0||numberChecker(telephone)){
                throw new Exception("* Invalid telephone");
            }

             if(email.trim().length()==0){
                throw new Exception("* Invalid email");
            }

            if(address.trim().length()==0){
                throw new Exception("* Invalid address");
            }
            if(!confirm){
                throw  new Exception("* You should Confirm the data");
            }
    }
    public static void main(String[] args) {
        EmploymentForm employmentForm = new EmploymentForm();
        employmentForm.setVisible(true);

    }
}

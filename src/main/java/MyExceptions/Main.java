package MyExceptions;

public class Main {

    static void ageValidation(int age) throws UserException{
        if(age > 18){
            System.out.println("Eligible for voting");
        }else{
            throw new UserException("Not Eligible for voting");
        }
    }

    static void main(String[] args) {
        try{
            ageValidation(16);
        }catch(UserException e){
            System.out.println(e.getMessage());
        }
//        try{
//            int[] nums = {1,2,3,4,5};
//
//            System.out.println(nums[10]);
//
//            int a = 5;
//            int result =  a/2;
//            System.out.println(result);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("Done");
//        }
    }
}

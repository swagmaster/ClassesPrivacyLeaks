/**
 * DateWeightYoungHumanDriver class:
 * This is used to test the Date, Weight, and YoungHuman classes
 *
 * @author David Nixon
 * @version 2021
 */
public class DateWeightYoungHumanDriver
{
    public static void main(String [] args){
        /* *** DATE TESTS:  *** */
        System.out.println("Date tests:");
        System.out.println("-----------");
        // construct some date objects and do some tests:
        Date d1 = new Date(6,7,2005);
        System.out.println("Testing getMonth(). Should print 6:  " + d1.getMonth());
        // now add many more tests!
        d1.setDay(9);
        System.out.println("Testing new day. Should print 9: " + d1.getDay());
        System.out.println("DATE: " + d1.toString());
        
        System.out.println(d1.getDate());
        
        Date d2 = new Date(7, 3, 2022);
        System.out.println("Testing getDay(). Should be 3: " + d2.getDay());
        System.out.println(d2.getDate());
        
        
        /* *** WEIGHT TESTS:  *** */
        System.out.println();
        System.out.println("Weight tests:");
        System.out.println("-------------");
        // construct some Weight objects and do some tests:
        Weight w1 = new Weight(14,8);
        System.out.println("Testing getWeight(). Should print 14.5: " + w1.getWeight());
        // now add many more tests!
        
        Weight w2 = new Weight(8);
        System.out.println("Testing getWeight(). Should print 8.0: " + w2.getWeight());
        w2.add(4, 2);
        System.out.println("Adding 4 pounds and 2 ounces to w2. Should print 12.125: " + w2.getWeight());
        w2.add(10);
        System.out.println("Adding 10 more pound. Should print 22.125: " + w2.getWeight());
        w2.add(-4);
        System.out.println("Adding negative 4 to pounds. Should print error above: " + w2.getWeight());
        
        /* *** YOUNGHUMAN TESTS:  ***/
        System.out.println();
        System.out.println("YoungHuman tests:");
        System.out.println("-----------------");
        // construct some YoungHuman objects and do some tests:
        YoungHuman y1 = new YoungHuman(w1, d1, "Homer", "Simpson");
        System.out.print("Testing getName(): ");
        if (y1.getName().equals("Homer Simpson"))
            System.out.println(" TEST PASSED! :) ");
        else System.out.println(" TEST FAILED!  :( ");
        // now add many more tests!
         
        YoungHuman y2 = new YoungHuman(w2, d2, "Lebron", "James");
        Date checkUp = new Date (8, 14, 2020);
        y2.setCheckUp(checkUp);
        
        System.out.println("Getting birthdate: " + y2.getBirthDate());
        System.out.println("Getting weight: "+ y2.getWeight());        
        System.out.println("Getting name: " + y2.getName());
        System.out.println(y2.toString());
        
    }
}

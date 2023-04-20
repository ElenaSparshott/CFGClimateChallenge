//import java.util.ArrayList;
//    /*CarbonFootprintInterfaceTest.java: testing the interface*/
//
//
//public class CarbonFootprintInterfaceTest {
//        public static void main( String[] args ){
//
//            ArrayList<Double> categories = new ArrayList<>();//creates array of objects of type CarbonFootprint
//            //categories[0] = new Bike( 200.00 );
//            //categories[1] = new Building( 4000.52 );
//            //categories[2] = new Car( 5845.25, 20.5 );
//            categories.add(new Bike (200.00).getCarbonFootprint());
//            categories.add(new Building (4000.52).getCarbonFootprint());
//            categories.add(new Car (5845.25, 20.5).getCarbonFootprint());
//            System.out.println(" Data of each object:\n ");
//
//            for( Double currentObject : categories ){
//                System.out.printf("%s \n%s: %.2f\n",
//                        categories.toString(),
//                        "Carbon footprint is ", currentObject);
//            }//end for loop
//        }//end of main
//    }//end of CarbonFootprintInterfaceTest

import java.util.ArrayList;
import java.util.List;
public class CarbonFootprintInterfaceTest{
    public static void main( String[] args ){
        List< CarbonFootprint > categories = new ArrayList< CarbonFootprint >();//creates array of objects of type CarbonFootprint
        categories.add(new Bike( 200.00 ));
        categories.add(new Building( 4000.52 ));
        categories.add(new Car( 5845.25, 20.5 ));
        System.out.println(" Data of each object:\n ");
        for( CarbonFootprint currentObject : categories ){
            System.out.printf("%s %s: %.2f",
                    currentObject.toString(),
                    "\nCarbon footprint is ", currentObject.getCarbonFootprint());
            System.out.print("\n\n");
        }  //end for loop
    }//end of main
}//end of CarbonFootprintInterfaceTest


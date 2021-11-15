/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlesoapclient;

import java.util.Scanner;

/**
 *
 * @author macintoch
 */
public class CircleSoapClient {

    /**
     * @param args the command line arguments
     */
    public static int main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("put radian");
        double r = inp.nextDouble();
        System.out.println(" พื้นที่ = "+ cal(r));
        System.out.println(" เส้นรอบวง = "+ cal2(r));
    }
    
     private static cal(double radian){
          circlewebservice.CircleWebService_Service service = new circlewebservice.CircleWebService_Service();
          circlewebservice.CircleWebService port = service.getCircleWebServicePort();
          return port.cal(radian);
        }
    
     private static cal2(double radian){
          circlewebservice.CircleWebService_Service service = new circlewebservice.CircleWebService_Service();
          circlewebservice.CircleWebService port = service.getCircleWebServicePort();
          return port.cal2(radian);
        }
}

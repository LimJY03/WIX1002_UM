public class L1Q2 {

    public static void main(String[] args) {

        // Create Myself as Object
        JY my = new JY();
        
        // Display Personal Details
        System.out.printf("My name is %s and my matric number is %s.\nI live in %s.\nIf you wish to contact me, my email is %s and my phone number is %s.", 
            my.name, my.mtno, my.addr, my.mail, my.cntc
        );
    }
}

// Define Details Data
class JY {
    String name = "LIM JUN YI", 
           mtno = "22004811/1", 
           addr = "ZAN PAVILLON, 11900 PENANG", 
           mail = "22004811@siswa.um.edu.my", 
           cntc = "+60123681620";
}
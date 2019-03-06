
package cod.singleton;

/**
 *
 * @author User
 */
public class CODSingleton {

    
    public static void main(String[] args) {
        //creaamos el nuevo objecto
        ClaseSingleton obx1 = ClaseSingleton.getInstance("Iago","Fernandez");
        System.out.println(obx1.toString());
    }
    
}

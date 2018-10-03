/*
 * Shawn Phung
 * October 3, 2018
 * To calculate the cost of the user's USB devices and tax
 */

package usbshopping;
    import java.util.Scanner;
/**
 *
 * @author shphu0697
 */
public class USBShopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        // Variable and Constant Declaration
        int usb, keyboard, mouse;
        
        final double TAX_RATE;
        TAX_RATE = 1.13;
        
        //Flat Cost of Items
        final double USB_Cost;
        USB_Cost = 19.99;
        final double Keyboard_Cost;
        Keyboard_Cost = 49.99;
        final double Mouse_Cost;
        Mouse_Cost = 25.99;
        
        
        //Input and Output
        System.out.println ("Insert the number of USB storage devices you are buying");
        usb = keyedInput.nextInt ();
        System.out.println ("Insert the number of keyboards you are buying");
        keyboard = keyedInput.nextInt ();
        System.out.println ("Insert the number of computer mice you are buying");
        mouse = keyedInput.nextInt ();
        
        //Total Cost of Devices
        double totalUSB = USB_Cost * usb;
        double totalKeyboard = Keyboard_Cost * keyboard;
        double totalMouse = (double) (Mouse_Cost * mouse);
        double totalPrice = ((totalUSB + totalKeyboard + totalMouse) * TAX_RATE);
        totalPrice = totalPrice * 100;
        totalPrice = Math.round(totalPrice);
        totalPrice = totalPrice / 100;
        
        System.out.println ("Total Cost of USB storage devices = $" + totalUSB);
        System.out.println ("Total Cost of keyboards = $" + totalKeyboard);
        System.out.println ("Total Cost of computer mice = $" + totalMouse);
        
        System.out.println ("Final Cost (Tax Included) = $" + totalPrice);
    }
    
}

package structural.adapter;

public class Runner {
    public static void main(String[] args) {
        MiniUsb miniUsb = new AdapterMiniUsbToUsbC();
        miniUsb.readMiniUsb();
        miniUsb.writeMiniUsb();
    }


}

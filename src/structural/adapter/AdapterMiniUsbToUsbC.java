package structural.adapter;

public class AdapterMiniUsbToUsbC extends UsbC implements MiniUsb {

    @Override
    public void readMiniUsb() {
        readUsbC();
    }

    @Override
    public void writeMiniUsb() {
        writeUsbC();
    }
}

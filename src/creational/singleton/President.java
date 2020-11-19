package creational.singleton;

public class President {
    private static President putin;
    private static Integer putinTerm = 1;

    public static synchronized President getPresident() {
        if (putin == null) {
            putin = new President();
        }

        return putin;
    }

    private President() {

    }

    public void addPutinTerm(Integer term) {
        putinTerm += term;
    }

    public void costPutinTerms() {
        System.out.println("Сроков у Путина: " + putinTerm);
    }


}

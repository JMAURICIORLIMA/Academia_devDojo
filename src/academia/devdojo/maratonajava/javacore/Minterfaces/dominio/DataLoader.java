package academia.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;

    public void load();

    public default void checkPermission() {
        System.out.println("Checando Permissões... ");
    }

    public static void retriveMaxDataSize() {
        System.out.println("Dentro do retribeMaxDataSite na interface");
    }
}

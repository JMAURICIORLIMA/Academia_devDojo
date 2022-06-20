package academia.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    public void load();

    public default void checkPermission() {
        System.out.println("Checando Permissões... ");
    }
}

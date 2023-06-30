public class Main {
    public static void main(String[] args) {
        DataAktivitas data = new DataAktivitas(20);
        TampilanMenu menu = new TampilanMenu(data);
        menu.tampilanMenu();
    }
}
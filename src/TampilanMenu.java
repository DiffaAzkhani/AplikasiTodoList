public class TampilanMenu {
    private final TampilData tampilData;
    private final TambahData tambahData;
    private final DeleteData deleteData;
    private DataAktivitas data;

    public TampilanMenu(DataAktivitas data) {
        this.data = data;
        this.tampilData = new TampilData(data);
        this.tambahData = new TambahData(data);
        this.deleteData = new DeleteData(data);
    }

    InputUser inputUser = new InputUser();
    public boolean tampilanMenu(){
        while(true){
            System.out.println(" --== Menu ==-- ");
            System.out.println("(Maks 20 list data)");
            System.out.println("1. Tampil Data");
            System.out.println("2. Tambah Data");
            System.out.println("3. Delete Data");
            System.out.println("4. Keluar");
            String pilih = inputUser.inputUser("Pilih [1 - 4]");
            switch (pilih){
                case "1":
                    tampilData.viewMenuTampilData();
                    break;
                case "2":
                    tambahData.viewMenuTambahData();
                    break;
                case "3":
                    deleteData.viewMenuDeleteData();
                    break;
                case "4":
                    System.out.println("Sampai jumpa kembali!");
                    return false;
                default:
                    System.out.println("Pilihan Anda Salah");
            }
        }
    }
}

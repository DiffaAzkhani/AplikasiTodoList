public class TambahData {
    private DataAktivitas data;
    public TambahData(DataAktivitas data) {
        this.data = data;
    }

    InputUser inputUser = new InputUser();
    public void viewMenuTambahData(){
        System.out.println("--== Tambah Data ==-- ");
        tambahDataTodo(inputUser.inputUser("Tambah Data"));
    }

    public void tambahDataTodo(String todo) {
        for (int i = 0; i < data.getDataLength(); i++) {
            if (data.getData(i) == null) {
                data.setData(i, todo);
                System.out.println("Data Berhasil Ditambahkan");
                break;
            }
        }
    }
}

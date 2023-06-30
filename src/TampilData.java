public class TampilData {
    private DataAktivitas data;
    public TampilData(DataAktivitas data) {
        this.data = data;
    }

    public void viewMenuTampilData(){
        System.out.println(" --== Data Todo List ==-- ");
        for (int i = 0; i < data.getDataLength(); i++) {
            if(data.getData(i) == null){
                System.out.println("Data Kosong");
            }else{
                tampilDataTodo();
            }
            break;
        }

        if(dataTersimpan() == data.getDataLength()){
            System.out.println("Jumlah Data Tersimpan : " + dataTersimpan() + "(PENUH)");
        }else{
            System.out.println("Jumlah Data Tersimpan : " + dataTersimpan());
        }
    }
    public void tampilDataTodo(){
        int no = 1;
        for (int i = 0; i < data.getDataLength() ; i++) {
            if(data.getData(i) == null){
                break;
            }else{
                System.out.println(no + " . " + data.getData(i));
                no++;
            }
        }
    }

    public int dataTersimpan(){
        int total = 0;
        for (int i = 0; i < data.getDataLength(); i++) {
            if(data.getData(i) != null){
                total = total + 1;
            }
        }
        return total;
    }
}

public class DeleteData {

    DataAktivitas data;

    public DeleteData(DataAktivitas data) {
        this.data = data;
    }

    InputUser inputUser = new InputUser();
    public void viewMenuDeleteData(){
        System.out.println(" --== Delete Data ==-- ");
        deleteDataTodo(Integer.parseInt(inputUser.inputUser("Data Todo")));
    }

    public boolean deleteDataTodo(int angka){
        if(angka > data.getDataLength()){
            return false;
        }else if(data.getData(angka - 1) == null){
            return false;
        }else{
            for (int i = (angka - 1); i < data.getDataLength(); i++) {
                if(data.getData(i) == null){
                    data.setData(i, null);
                }else{
                    data.setData(i, data.getData(i + 1));
                }
            }
            return true;
        }
    }
}

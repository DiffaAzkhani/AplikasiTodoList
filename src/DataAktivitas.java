public class DataAktivitas {
    private String[] data;

    public DataAktivitas(int size) {
        data = new String[size];
    }

    public int getDataLength() {
        return data.length;
    }

    public String getData(int index) {
        if (index >= 0 && index < data.length) {
            return data[index];
        } else {
            System.out.println("Invalid index!");
            return null;
        }
    }

    public void setData(int index, String value) {
        if (index >= 0 && index < data.length) {
            data[index] = value;
        } else {
            System.out.println("Invalid index!");
        }
    }
}

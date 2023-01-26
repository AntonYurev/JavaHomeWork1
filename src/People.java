public class People {
    private String name, secondName, surname, gender;
    private int id, birthday, idParent;
    int[] child = new int[100];
    int[] parent = new int[2];


    public People(int id1, String name1, String secondName1, String surname1, String gender1, int birthday1,
                  int idParent1) {
        id = id1;
        name = name1;
        secondName = secondName1;
        surname = surname1;
        gender = gender1;
        birthday = birthday1;
        idParent = idParent1;
    }

    private int getNextId() { // Получаем следующее id
        id += id;
        return id;
    }

    public int getId() {
        return id;
    }

    public int getIdParent() {
        return idParent;
    }

    public String getFio() {
        String fio = secondName + " " + name + " " + surname;
        return fio;
    }

    public String getGender() {
        return gender;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setChelovek(String secondName, String name, String surname, String gender, int birthday) {
        this.secondName = secondName;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthday = birthday;
        getId(); // Записываем в файл
        getNextId();
    }

    public void setParent(int id, int id1) {
        for (int i = 0; i < 2; i++) {
            if (parent[i] == 0) {
                parent[i] = id1;
            }
        }
        // Записываем в файл к человеку с id родителя id1
    }

    public int[] getParent(int id, int i) {
        return new int[]{parent[i]}; // Возвращаем первого или второго родителя
    }

    public void setChild(int id, int id1) {
        for (int i = 0; i < 100; i++) {
            if (child[i] == 0) {
                child[i] = id1;
            }
        }
        // Записываем в файл к человеку с id в массив ребенка id1
    }
    public int[] getChild(int id, int i) {
        return new int[]{parent[i]}; // Возвращаем ребенка
    }
}
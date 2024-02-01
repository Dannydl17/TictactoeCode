package players;

import enumCell.CellValue;

public class Player {
    private String name;
    private CellValue value;


    public Player(String name, CellValue value){
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CellValue getValue() {
        return value;
    }

    public void setValue(CellValue value) {
        this.value = value;
    }

}

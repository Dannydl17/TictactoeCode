package board;

import enumCell.CellValue;

import java.util.Arrays;


public class Board {
    private final CellValue[][] cellValues;

    public Board(){
        cellValues = new CellValue[3][3];
        for (CellValue[] cellValue : cellValues) {
            Arrays.fill(cellValue, CellValue.EMPTY);
        }
    }

    public CellValue[][] getCellValues(){
        return cellValues;
    }


    public String toString(){
        StringBuilder builder = new StringBuilder();
        for (int row = 0; row < cellValues.length; row++) {
            for (int column = 0; column < row; column++) {
                builder.append("\t|")
                       .append("\t")
                       .append("\t|")
                       .append("\t").append("\n")
                       .append("---- ").append("------- ").append("---------").append("\n");
            }
        }
        return builder.toString();
    }
}

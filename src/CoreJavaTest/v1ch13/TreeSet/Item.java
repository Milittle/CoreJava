package CoreJavaTest.v1ch13.TreeSet;

import java.util.Objects;

/**
 * Created by mizeshuang on 2016/5/27.
 */
public class Item implements Comparable {
    private String description;
    private int partNumber;

    public Item(String description, int partNumber) {
        this.description = description;
        this.partNumber = partNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    @Override
    public String toString() {
        return "Item{" +
                "description='" + description + '\'' +
                ", partNumber=" + partNumber +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare(partNumber,((Item)o).partNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        Item other = (Item) o;
        return description.equals(((Item) o).description) && partNumber == ((Item) o).partNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, partNumber);
    }

}

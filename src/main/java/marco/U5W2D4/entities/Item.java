package marco.U5W2D4.entities;

import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Item {
    @Id
    @GeneratedValue
    protected long id;

    protected int calories;
    protected double price;

    public Item(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }

}

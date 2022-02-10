package peaksoft;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter

public class Cat {

    @Value("${cat.name}")
    private String name;
    @Value("${cat.colour}")
    private String colour;

    public Cat() {
    }

    public Cat(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

}

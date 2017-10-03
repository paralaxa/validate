package sk.stopangin.validate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by stopangin on 10/3/2017.
 */
public class Dummy {
    @NotNull
    private String d1;

    @Size(min = 2)
    private String d2;

    public String getD1() {
        return d1;
    }

    public void setD1(String d1) {
        this.d1 = d1;
    }

    public String getD2() {
        return d2;
    }

    public void setD2(String d2) {
        this.d2 = d2;
    }

    @Override
    public String toString() {
        return "Dummy{" +
                "d1='" + d1 + '\'' +
                ", d2='" + d2 + '\'' +
                '}';
    }
}

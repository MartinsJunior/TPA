import java.util.Objects;

/**
 * Created by JjMacbook on 13/10/16.
 */
public interface HashEngine {

    boolean equals(Object b1, Objects b2);
    long hashFunction(Object obj,int parameter); //Parameters should be 33,35 or 37
}

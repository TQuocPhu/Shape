package shape;

import javax.lang.model.util.SimpleElementVisitor14;
import java.util.Comparator;

public class SquareComparator implements Comparator<Square> {
    @Override
    public int compare(Square s1, Square s2){
        if(s1.getSide() > s2.getSide()) return 1;
        else if(s1.getSide() < s2.getSide()) return -1;
        else return 0;
    }
}

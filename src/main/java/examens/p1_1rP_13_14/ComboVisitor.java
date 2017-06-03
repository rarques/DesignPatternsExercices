package examens.p1_1rP_13_14;

import java.util.ArrayList;
import java.util.List;

public class ComboVisitor implements TreeVisitor {

    private List<TreeVisitor> visitors = new ArrayList<>();

    @Override
    public void visit(LeafNode leafNode) {
        for (TreeVisitor visitor : visitors) {
            visitor.visit(leafNode);
        }
    }

    @Override
    public void visit(CompositeNode compositeNode) {
        for (TreeVisitor visitor : visitors) {
            visitor.visit(compositeNode);
        }
    }

    public void addVisitor(TreeVisitor visitor) {
        visitors.add(visitor);
    }

}

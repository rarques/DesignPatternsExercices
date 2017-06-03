package examens.p1_1rP_13_14;

public interface TreeVisitor {

    void visit(LeafNode leafNode);

    void visit(CompositeNode compositeNode);

}

package examens.p1_1rP_13_14;

public class LeafNode implements DiskTreeNode {
    @Override
    public void operation() {
        // Do something
    }

    @Override
    public void accept(TreeVisitor treeVisitor) {
        treeVisitor.visit(this);
    }
}

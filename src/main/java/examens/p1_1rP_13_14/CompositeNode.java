package examens.p1_1rP_13_14;

import java.util.ArrayList;
import java.util.List;

public class CompositeNode implements DiskTreeNode {

    private List<DiskTreeNode> children = new ArrayList<>();

    @Override
    public void operation() {
        // Do something
    }

    @Override
    public void accept(TreeVisitor treeVisitor) {
        for (DiskTreeNode node : children) {
            node.accept(treeVisitor);
        }
    }

    public List<DiskTreeNode> getChildren() {
        return children;
    }

}

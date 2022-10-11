package AST.Node;

import AST.ASTVisitor;

public abstract class Node {
    public abstract <U,T> T accept(U param, ASTVisitor<U,T> visitor);
}

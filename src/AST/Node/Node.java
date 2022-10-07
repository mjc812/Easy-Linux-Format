package AST.Node;

import AST.ASTVisitor;

public abstract class Node {
    abstract public <U,T> T accept(U param, ASTVisitor<T,U> visitor);
}

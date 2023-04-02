package prototype;

public interface AbstractPrototype extends Cloneable{
    public AbstractPrototype createCopy() throws CloneNotSupportedException;
}

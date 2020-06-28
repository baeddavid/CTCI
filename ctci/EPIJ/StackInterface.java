interface IStack <T> {
    public boolean push(T value);

    public T pop();

    public boolean contains(T value);

    public int size();

    public void clear();

    public boolean isEmpty();
}

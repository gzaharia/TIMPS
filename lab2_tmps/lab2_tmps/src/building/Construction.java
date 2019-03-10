package building;

public interface Construction {
    public void build();

    public void add(Construction construction);

    public void remove(Construction construction);

    public void clear();
}

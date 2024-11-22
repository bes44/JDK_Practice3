import java.util.List;

public interface DatabaseOperations<T> {
    void save(T entity);
    void delete(T entity);
    T findById(Long id);
    List<T> findAll();
}

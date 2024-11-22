import java.util.ArrayList;
import java.util.List;


/**
 * Создайте интерфейс, который определяет набор методов для работы с базой данных (например, сохранение, удаление, получение данных). Реализуйте этот интерфейс в конкретном классе.
 */

public class PersonDatabase implements DatabaseOperations<Person> {
    private List<Person> people = new ArrayList<>();

    @Override
    public void save(Person person) {
        people.add(person);
        System.out.println("Сохранен: " + person);
    }

    @Override
    public void delete(Person person) {
        people.remove(person);
        System.out.println("Удален: " + person);
    }

    @Override
    public Person findById(Long id) {
        return people.stream()
                .filter(person -> person.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Person> findAll() {
        return new ArrayList<>(people);
    }

    public static void main(String[] args) {
        PersonDatabase db = new PersonDatabase();


        Person person1 = new Person(1L, "Иван", 30);
        Person person2 = new Person(2L, "Анна", 25);


        db.save(person1);
        db.save(person2);

        System.out.println("Все объекты: " + db.findAll());

        System.out.println("Найден по ID 1: " + db.findById(1L));

        db.delete(person1);
        System.out.println("Все объекты после удаления: " + db.findAll());
    }
}

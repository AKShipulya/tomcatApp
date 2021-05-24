package app.model;

import app.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Model {

    private static Model instance = new Model();

    private List<User> model;

    public static Model getInstance() {
        return instance;
    }

    private Model() {
        model = new ArrayList<User>();
    }

    public void add(User user) {
        model.add(user);
    }

    public List<String> list() {
        return model.stream()
                .map(User::getName)
                .collect(Collectors.toList());
    }

    public void update(String OldName, String newName) {

    }

    public Optional<User> getByName(String name) {
        return model.stream()
                .filter(p -> p.getName().equals(name))
                .findFirst();
    }

    public void delete(String name) {
        model.stream()
        .filter(p -> p.getName().equals(name))
        .findFirst();
    }

}

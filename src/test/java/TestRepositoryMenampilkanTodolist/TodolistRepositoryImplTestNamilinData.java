package TestRepositoryMenampilkanTodolist;

import MembuatKoneksiDatabase.DatabaseUtil;
import com.zaxxer.hikari.HikariDataSource;
import entity.Todolist;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;

public class TodolistRepositoryImplTestNamilinData {

    private HikariDataSource dataSource;

    private TodoListRepository todoListRepository;

    @BeforeEach
    void setUp() {
        dataSource = DatabaseUtil.getDataSource();
        todoListRepository = new TodoListRepositoryImpl(dataSource);
    }


    @Test
    void testGetAll() {
        todoListRepository.add(new Todolist("EKo"));
        todoListRepository.add(new Todolist("Kurniawan"));
        todoListRepository.add(new Todolist("Khannedy"));

        Todolist[] todolists = todoListRepository.getAll();
        for (var todo : todolists) {
            System.out.println(todo.getId() + " : " + todo.getTodo());
        }
    }

    @AfterEach
    void tearDown() {
        dataSource.close();
    }
}
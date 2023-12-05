package test.services;

import entity.TodoList;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {

    public static void main(String[] args) {
        testRemmoveTodoList();
    }

    public static void testShowTodoList(){
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        todoListRepository.data[0] = new TodoList("Belajar java dasar");
        todoListRepository.data[1] = new TodoList("Belajar java OOOP");
        todoListRepository.data[2] = new TodoList("Belajar java Standard Classes");

        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.showTodoList();
    }
    public static void  testAddTodoList(){
       TodoListRepository todolistRepository = new TodoListRepositoryImpl();

       TodoListService todoListService = new TodoListServiceImpl(todolistRepository);
       todoListService.addTodoList("Belajar java Dasar Wlee");
       todoListService.addTodoList("Belajar java OOP");
       todoListService.addTodoList("Belajar java Standard classes");

       todoListService.showTodoList();
    }

    public static void testRemmoveTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Belajar java Dasar Wlee");
        todoListService.addTodoList("Belajar java OOP");
        todoListService.addTodoList("Belajar java Standard classes");

        todoListService.showTodoList();

        todoListService.removeTodoList(2);

        todoListService.showTodoList();
        todoListService.removeTodoList(2);
        todoListService.showTodoList();
        todoListService.removeTodoList(2);
        todoListService.showTodoList();
        todoListService.removeTodoList(1);
        todoListService.showTodoList();


    }

}

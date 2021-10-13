package Repository;

import Entity.Person;

import java.util.ArrayList;

public class Repository {

    private static ArrayList<Person> list = new ArrayList<>();

    public static void add(Person person) {
        list.add(person);
    }

    public static void delete(Person person) {
        list.remove(person);
    }

    public static Person findById(int id) {
        Person rtn = new Person();
        for (Person tmp : list) {
            if (tmp.getId() == id) {
                rtn = tmp;
            }
        }
        return rtn;
    }

    public static void deleteById(int id) {
        list.removeIf(tmp -> tmp.getId() == id);
    }

    public static String showList(){
        StringBuilder sb = new StringBuilder();
        for(Person tmp: list){
            sb.append(tmp).append("\n");
        }
        return sb.toString();
    }
}
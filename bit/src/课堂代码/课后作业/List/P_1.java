package 课堂代码.课后作业.List;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};

public class P_1 {
    Map<Integer, Employee> map;

    public static void main(String[] args) {

    }

    public int getImportance(List<Employee> employees, int id) {
        map = new HashMap<>();
        for (Employee e : employees) {
            map.put(e.id, e);
        }
        return dfs(id);

    }

    private int dfs(int id) {
        Employee employee = map.get(id);
        int ans = employee.importance;
        for (Integer subid : employee.subordinates) {
            ans += dfs(subid);
        }
        return ans;
    }

}
/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    Map<Integer, Employee> map;

    public int getImportance(List<Employee> employees, int id) {
        map = new HashMap<>();
        for (Employee e : employees) {
            map.put(e.id, e);
        }
        return dfs(id);

    }

    private int dfs(int id) {
        Employee employee = map.get(id);
        int ans = employee.importance;
        for (Integer subid : employee.subordinates) {
            ans += dfs(subid);
        }
        return ans;
    }
}
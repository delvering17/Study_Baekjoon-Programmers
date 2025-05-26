import java.util.*;
import java.util.stream.Collectors;

class Solution {
        public String[] solution(String[] orders, int[] course) {
            List<Set<String>> orderList = Arrays.stream(orders)
                    .map(str ->
                            Arrays.stream(str.split(""))
                            .collect(Collectors.toSet())
                    )
                    .collect(Collectors.toList());

            Map<Integer, List<Course>> courses = new HashMap<>();
            for (int length : course) {
                List<Course> menuList = new ArrayList<>();
                menuList.add(new Course("", 0));
                courses.put(length, menuList);
            }

            getCourse('A', new HashSet<>(), orderList, courses);

            return courses.values().stream()
                .filter(list -> list.get(0).count > 0)
                .flatMap(List::stream)
                .map(c -> c.menu)
                .sorted()
                .toArray(String[]::new);
        }

        public void getCourse(char nextMenu, Set<String> currentMenu, List<Set<String>> orderList, Map<Integer, List<Course>> courses) {

            int count = (int) orderList.stream()
                    .filter(it -> it.containsAll(currentMenu))
                    .count();

            if (count < 2) {
                return;
            }

            int size = currentMenu.size();
            if (courses.containsKey(size)) {
                List<Course> courseList = courses.get(size);
                Course firstCourse = courseList.get(0);
                String currentMenuStr = currentMenu.stream()
                        .sorted()
                        .collect(Collectors.joining(""));
                Course currentCourse = new Course(currentMenuStr, count);
                if (firstCourse.count < currentCourse.count) {
                    courseList.clear();
                    courseList.add(currentCourse);
                } else if (firstCourse.count == currentCourse.count) {
                    courseList.add(currentCourse);
                }
            }

            if (size >= 10) {
                return;
            }

            for (char menu = nextMenu; menu <= 'Z'; menu++) {
                currentMenu.add(String.valueOf(menu));
                getCourse((char) (menu + 1), currentMenu, orderList, courses);
                currentMenu.remove(String.valueOf(menu));
            }
        }

        private static class Course {
            public final String menu;
            public final int count;

            public Course(String menu, int count) {
                this.menu = menu;
                this.count = count;
            }
        }
}
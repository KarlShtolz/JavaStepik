package b_object_class_package_3.class_decloration_pack;

/**
 * На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами: X и Y. Ось X смотрит слева направо, ось Y — снизу вверх. (Помните, как рисовали графики функций в школе?)
 * В начальный момент робот находится в некоторой позиции на поле. Также известно, куда робот смотрит: вверх, вниз, направо или налево. Ваша задача — привести робота в заданную точку игрового поля.
 * Робот описывается классом Robot. Вы можете пользоваться следующими его методами (реализация вам неизвестна):
 * public class Robot {
 *     public Direction getDirection() {
 *         // текущее направление взгляда
 *     }
 *     public int getX() {
 *         // текущая координата X
 *     }
 *     public int getY() {
 *         // текущая координата Y
 *     }
 *     public void turnLeft() {
 *         // повернуться на 90 градусов против часовой стрелки
 *     }
 *     public void turnRight() {
 *         // повернуться на 90 градусов по часовой стрелке
 *     }
 *     public void stepForward() {
 *         // шаг в направлении взгляда
 *         // за один шаг робот изменяет одну свою координату на единицу
 *     }
 * }
 * Пример
 * В метод передано: toX == 3, toY == 0; начальное состояние робота такое: robot.getX() == 0, robot.getY() == 0, robot.getDirection() == Direction.UP
 * Чтобы привести робота в указанную точку (3, 0), метод должен вызвать у робота следующие методы:
 * robot.turnRight();
 * robot.stepForward();
 * robot.stepForward();
 * robot.stepForward();
 *
 */
public class ClassDecloration_3_3_12 {
//    public static void moveRobot(Robot robot, int toX, int toY) {
//        int x = robot.getX();
//        int y = robot.getY();
//        Direction dir = robot.getDirection();
//        if(x < toX){
//            turnTo(robot, Direction.RIGHT);
//            while(x != toX){
//                robot.stepForward();
//                x = robot.getX();
//            }
//        }else if(x > toX){
//            turnTo(robot, Direction.LEFT);
//            while(x != toX){
//                robot.stepForward();
//                x = robot.getX();
//            }
//        }
//        if(y < toY){
//            turnTo(robot, Direction.UP);
//            while(y != toY){
//                robot.stepForward();
//                y = robot.getY();
//            }
//        }else if(y > toY){
//            turnTo(robot, Direction.DOWN);
//            while(y != toY){
//                robot.stepForward();
//                y = robot.getY();
//            }
//        }
//    }
//
//    public static void turnTo(Robot robot, Direction dir){
//        while(robot.getDirection() != dir)
//            robot.turnRight();
//    }
}

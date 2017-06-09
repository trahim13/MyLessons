//package JAVA9;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//
//public class java6 {
//    public static void main(String[] args) {
//        one().forEach(x -> System.out.println(x));
//
//    }
//
//    public static List<String> one() {
//        return two();
//    }
//
//    public static List<String> two() {
//        return StackWalker.getInstance().walk(s -> s.map(frame -> frame.getClassName() + "/" + frame.getMethodName()).collect(Collectors.toList()));
//    }
//
//}

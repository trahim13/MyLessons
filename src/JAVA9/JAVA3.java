//package JAVA9;
//
//
//
//import java.io.IOException;
//
//public class JAVA3 {
//    public static void main(String[] args) throws IOException, InterruptedException {
//        Process sleep = Runtime.getRuntime().exec("notepad");
//        System.out.println("current process id " + ProcessHandle.current().getPid());
//        System.out.println("sleep id " + sleep.getPid());
//
//        ProcessHandle processHandle = ProcessHandle.of(sleep.getPid()).orElseThrow(IllegalStateException::new);
//        Thread.sleep(4000);
//        processHandle.onExit().thenRun(() -> System.out.println("process has benn closed"));
//
//        System.out.println(processHandle.info().user().orElse("no user"));
//        System.out.println(processHandle.info().commandLine().orElse("empty"));
//
//    }
//}

package JavaFX;

import javafx.application.Application;
import javafx.concurrent.Worker;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import netscape.javascript.JSObject;


public class FX16 extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();

        webEngine.loadContent("" +
                "<div id = 'div'> hello word </div>" +

                "<script>document.getElementById('div').style.color='blue';" +

                        "function changeColor () {" +
                        "document.getElementById('div').style.color='green';" +
                "}"+

                "function changeString(){" +
                        "document.getElementById('div').innerHTML=nameClass.sayHello('Script');" +
                        "document.getElementById('div').style.color='red';" +
                        "}"+
                " </script>"

        );


        webEngine.getLoadWorker()
                .stateProperty()
                .addListener(((observable, oldValue, newValue) -> {
                    if (newValue == Worker.State.SUCCEEDED) {
                        JSObject jsObject = (JSObject) webEngine.executeScript("window");
                        jsObject.setMember("nameClass", new MyClass());
                        webEngine.executeScript("changeColor();");
                        webEngine.executeScript("changeString();");
                    }
                }));


        Group group = new Group();
        group.getChildren().addAll(webView);

        Scene scene = new Scene(group, 500, 500);

        primaryStage.setTitle("FX16");
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.show();
    }

    public class MyClass {
        public String sayHello(String name) {
            return "new hello " + name;

        }
    }

}


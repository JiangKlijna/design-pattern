
//服务端只能获得Result
class Server {
    public class Result {
        public String data;
    }

    //test
    public Result getData() {
        Result re = new Result();
        re.data = "red";
        return re;
    }
}

//屏幕只能显示Color
class Screen {
    public enum Color {
        red, green, blue
    }

    public void show(Color color) {
        System.out.println(color);
    }
}
//用于转换Server.Result到Screen.Color
class ConvertionAdaper {
    public static Screen.Color convert(Server.Result result) {
        switch (result.data) {
            case "red":
                return Screen.Color.red;
            case "green":
                return Screen.Color.green;
            case "blue":
                return Screen.Color.blue;
            default:
                return null;
        }
    }
}

public class Adapter {

    public static void main(String[] args) {
        Server server = new Server();
        Screen screen = new Screen();

        Server.Result re = server.getData();
        screen.show(ConvertionAdaper.convert(re));

    }
}

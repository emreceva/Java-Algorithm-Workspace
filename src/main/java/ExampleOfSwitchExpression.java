public class ExampleOfSwitchExpression {


    public void exampleOfSwitchExpression(){
        int choice = 2;
        int x = switch ( choice) {
            case 1, 2, 3 :
                yield choice;
            default:
                yield -1;
        };

        System.out.println("x = " + x );
    }

    public void exampleOfSwitchExpression1(){
        String day = "TH";
        String result = switch (day) {
            case "M", "W", "F" -> "MWF";
            case "T", "TH" ,"S" -> "TTS";

            default -> {
                if(day.isEmpty())
                    yield "Please insert a valid day.";
                else
                    yield "Looks like a sunday";
            }
        };

        System.out.println(result);
    }
}

package Controller;
import Model.Model;
import View.View;

public class Controller {
    public static void main(String[] args) {
        String str = "4+2+4^2";
        Model model = new Model();
        View view = new View();
        view.displayResult(str, model.Math(Model.infixToPostfix(str)));
    }
}

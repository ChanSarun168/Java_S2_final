
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                calculator calculator = new calculator();
                calculator.setVisible(true);
            }
        });
    }
}
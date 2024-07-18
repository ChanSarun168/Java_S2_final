
public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                calculator calculator = new calculator();
                calculator.setVisible(true);
            }
        });
    }
}
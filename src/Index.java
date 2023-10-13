import Obj.Database;
import Obj.Livro;

import javax.swing.*;

public class Index extends JFrame {

    private JLabel lbl_Title;
    private JPanel Index_Panel;

    public Index(){

        setContentPane(Index_Panel);

        setTitle("Biblioteca");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1080,720);
        setLocationRelativeTo(null);
        setVisible(true);
    }


    public static void main(String[] args) {

        Database database = new Database("Books.csv");
        Livro[] df = database.load_data();


        new Index();


    }


}

import Obj.Database;
import Obj.Livro;

import javax.swing.*;

public class Index extends JFrame {

    private JLabel lbl_Title;
    private JPanel Index_Panel;
    private JTextField txt_pesquisar;
    private JButton btn_pesquisar;
    private JList list1;
    private JLabel lbl_livrosCarregados;

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


        Index index = new Index();

        index.lbl_livrosCarregados.setText("Livros carregados: \n" + df.length);



    }


}

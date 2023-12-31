import Obj.Database;
import Obj.Livro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Index extends JFrame {

    private JLabel lbl_Title;
    private JPanel Index_Panel;
    private JTextField txt_pesquisar;
    private JButton btn_pesquisar;
    private JList list_pesquisar;
    private JLabel lbl_livrosCarregados;
    private JComboBox cb_pesquisar;

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

        index.btn_pesquisar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                pesquisar_livros(index.txt_pesquisar,index.list_pesquisar,df,index.cb_pesquisar);
            } // end actionPerformed
        }); // end addActionListener

        // ComboBox pesquisa
        for (String tipo : new String[] {"Título","Autor","Código"}){
            index.cb_pesquisar.addItem(tipo);
        }
    }



    public static void pesquisar_livros(JTextField txt, JList list,Livro[] df,JComboBox cb){

        String txtPesquisa, tipo,item = null;

        tipo = cb.getSelectedItem().toString();
        System.out.println(tipo);
        txtPesquisa = txt.getText();
        if (txtPesquisa.isEmpty()){return;}

        for (Livro livro : df){
            switch (tipo) {
                case "Título":
                    item = livro.getCodigo();
                    break;
                case "Autor":
                    item = livro.getAutor();
                    break;
                case "Código":
                    item = livro.getCodigo();
                    break;
            }

        if (txtPesquisa.indexOf(item)>0){
            System.out.println(item);

        }


        }


    }

}

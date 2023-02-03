import java.lang.runtime.*;
import javax.swing.*;
import java.awt.*;

class converter extends Frame implements ActionListener{
    public static void main(String[] args){
        try{

            JFrame frame = new JFrame("iConvert");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);
            
            JPanel panel = new JPanel();
            JButton pick = new JButton("Input file");
            pick.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){

                }
            });
            JButton convert = new JButton("Convert");

            panel.add(pick);
            panel.add(convert);

            frame.getContentPane().add(panel);

            frame.setVisible(true);

            
            String filename = "input.png";
            String filetype = "gif";

            Runtime rt = Runtime.getRuntime(); // getting runtime process
            rt.exec("magick/magick mogrify -format " + filetype + " " + filename); // running imagemagick command


        }
        catch(Exception e){
            e.getStackTrace();
        }

    }
}
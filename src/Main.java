import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        String[] resolutions = {"800x600", "1024x768", "1200x600", "1280x1024", "1680x1050", "1920x1080"};
        String selectedResolution = (String) JOptionPane.showInputDialog(null,"Выберите разрешение "
        ,"Выбор разрешения",JOptionPane.PLAIN_MESSAGE,null,resolutions,resolutions[0]);
        if (selectedResolution!=null){
            String[] resolution = selectedResolution.split("x");
            int width = Integer.parseInt(resolution[0]);
            int height = Integer.parseInt(resolution[1]);
            JFrame frame = new JFrame(selectedResolution);
            frame.setSize(width,height);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);

        } else {
            System.out.println("Операция была отменена");
        }

    }
}
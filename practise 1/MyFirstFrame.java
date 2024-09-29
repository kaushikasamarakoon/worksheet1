import javax.swing.JFrame;

public class MyFirstFrame {
    public static void main(String[] args){
        //create new frame
        JFrame frame = new JFrame("My First Frame");

        //set the size of the frame ( width, height )
        frame.setSize(300, 200);

        //set the location of the frame (x,y)
        frame.setLocation(100,50);

        //set the defaultclose operation( exit when closed)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Make the frame Visible
        frame.setVisible(true);
    }
}
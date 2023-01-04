import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;

class MyFrame extends JFrame implements Runnable{
    int x1 = 10, y1 = 300, x2 =470;

    public MyFrame(){

        setVisible(true);
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Simple Frame");
    }

    @Override
    public void paint(Graphics g){

        super.paint(g);
        g.setColor(Color.RED);
        g.setFont(new Font("Arial", Font.BOLD, 30));
        g.drawString("Hello", x1, y1);

        g.setColor(Color.RED);
        g.setFont(new Font("Arial", Font.BOLD, 30));
        g.drawString("World", x2, y1);
    }

    public void moveLeftToRight() throws InterruptedException{
        while (x1 <= 490){
            x1 = x1 + 30;
            Thread.sleep(500);
            repaint();
        }
    }

    public void moveRightToLeft () throws InterruptedException {
        while (x2 >= 38){
            x2 = x2 - 30;
            Thread.sleep(500);
            repaint();
        }
    }

    @Override
    public void run(){
        try {
            if (Thread.currentThread().getName().equals("Hello")){
                moveLeftToRight();
            }

            if (Thread.currentThread().getName().equals("World")){
                moveRightToLeft();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public class MovingThreadDemo{
        public static void main(String[] args) {
            MyFrame obj = new MyFrame();
            Thread t1 = new Thread(obj, "Hello");
            Thread t2 = new Thread(obj , "World");

            t1.start();
            t2.start();
        }
    }
}

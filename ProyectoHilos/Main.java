import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Carrera();
            }
        });
    }
}

class Hilos implements Runnable {

    Thread t;
    String name;
    JLabel character;
    JLabel endLabel;
    JButton btnIniciarCarrera;
    JButton btnPausarCarrera;
    JButton btnReanudarCarrera;
    public static int place;
    boolean pausado = false;

    public Hilos(String name, JLabel character, JLabel endLabel, JButton btnIniciarCarrera, JButton btnPausarCarrera, JButton btnReanudarCarrera) {
        this.name = name;
        this.character = character;
        this.endLabel = endLabel;
        this.btnIniciarCarrera = btnIniciarCarrera;
        this.btnPausarCarrera = btnPausarCarrera;
        this.btnReanudarCarrera = btnReanudarCarrera;
        t = new Thread(this,name);
        t.start();
    }

    @Override
    public void run(){

        int delay;

        try {
            place = 1;
            delay = (int)(Math.random() * 15) +1;
            endLabel.setVisible(false);
            character.setVisible(true);

            for  (int i = 150; i <= 500; i++){
                synchronized (this) {
                    while (pausado) {
                        wait();
                    }
                }
                character.setLocation(i,character.getY());
                Thread.sleep(delay);
            }
            synchronized (Hilos.class) {
                endLabel.setVisible(true);
                endLabel.setText(name + " ha llegado en la posición: " + place);
                place++;
                if (place > 4) {
                    btnIniciarCarrera.setEnabled(true);
                    btnPausarCarrera.setEnabled(false);
                    btnReanudarCarrera.setEnabled(false);
                    place = 1;
                }
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public synchronized void  pause(){
        pausado = true;
    }

    public synchronized void resume() {
        pausado = false;
        notify();
    }
}

class Carrera extends JFrame{

    private Hilos ThreadHallUno, ThreadHallDos,  ThreadHallTres;
    public Carrera (){
        super ("Competencia de cerreras");
        JLabel hallUno, hallDos,  hallTres, hallUno_pos, hallDos_pos,  hallTres_pos;
        JButton btnIniciarCarrera;
        JButton btnPausarCarrera;
        JButton btnReanudarCarrera;


        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);


        Image image_hallUno = new ImageIcon("src/img/corredorUno.gif").getImage();
        ImageIcon Icon_hallUno = new ImageIcon(image_hallUno.getScaledInstance(50,50,Image.SCALE_DEFAULT));
        hallUno= new JLabel();
        hallUno.setIcon(Icon_hallUno);
        hallUno.setBounds(50,50, 50, 50);

        Image image_hallDos = new ImageIcon("src/img/corredorDos.gif").getImage();
        ImageIcon Icon_hallDos = new ImageIcon(image_hallDos.getScaledInstance(50,50,Image.SCALE_DEFAULT));
        hallDos= new JLabel();
        hallDos.setIcon(Icon_hallDos);
        hallDos.setBounds(50,100, 50, 50);

        Image image_hallTres = new ImageIcon("src/img/corredorTres.gif").getImage();
        ImageIcon Icon_hallTres = new ImageIcon(image_hallTres.getScaledInstance(50,50,Image.SCALE_DEFAULT));
        hallTres= new JLabel();
        hallTres.setIcon(Icon_hallTres);
        hallTres.setBounds(50,150, 50, 50);

        hallUno_pos = new JLabel();
        hallUno_pos.setBounds(50, 50, 350, 50);

        hallDos_pos = new JLabel();
        hallDos_pos.setBounds(50, 100, 350, 50);

        hallTres_pos = new JLabel();
        hallTres_pos.setBounds(50, 150, 350, 50);

        btnIniciarCarrera = new JButton("Iniciar");
        btnIniciarCarrera.setBounds(100,300, 100, 50);

        btnPausarCarrera = new JButton("Pausar");
        btnPausarCarrera.setBounds(210,300, 100, 50);
        btnPausarCarrera.setEnabled(false);

        btnReanudarCarrera = new JButton("Reanudar");
        btnReanudarCarrera.setBounds(320,300, 100, 50);
        btnReanudarCarrera.setEnabled(false);

        btnIniciarCarrera.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                btnIniciarCarrera.setEnabled(false);
                btnPausarCarrera.setEnabled(true);
                btnReanudarCarrera.setEnabled(false);

                ThreadHallUno = new Hilos("Corredor Uno",hallUno,hallUno_pos, btnIniciarCarrera, btnPausarCarrera, btnReanudarCarrera);
                ThreadHallDos = new Hilos("Corredor Dos", hallDos, hallDos_pos, btnIniciarCarrera, btnPausarCarrera, btnReanudarCarrera);
                ThreadHallTres = new Hilos("Corredor Tres", hallTres, hallTres_pos, btnIniciarCarrera, btnPausarCarrera, btnReanudarCarrera);
            }
        });

        btnPausarCarrera.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (ThreadHallUno != null && ThreadHallDos != null && ThreadHallTres != null){
                    ThreadHallUno.pause();
                    ThreadHallDos.pause();
                    ThreadHallTres.pause();
                }
                btnPausarCarrera.setEnabled(false);
                btnReanudarCarrera.setEnabled(true);
            }
        });

        btnReanudarCarrera.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (ThreadHallUno != null && ThreadHallDos != null && ThreadHallTres != null){
                    ThreadHallUno.resume();
                    ThreadHallDos.resume();
                    ThreadHallTres.resume();
                }
                btnPausarCarrera.setEnabled(true);
                btnReanudarCarrera.setEnabled(false);
                btnIniciarCarrera.setEnabled(true);
            }
        });


        panel.add(hallUno);
        panel.add(hallUno_pos);
        panel.add(hallDos);
        panel.add(hallDos_pos);
        panel.add(hallTres);
        panel.add(hallTres_pos);
        panel.add(btnIniciarCarrera);
        panel.add(btnPausarCarrera);
        panel.add(btnReanudarCarrera);

        add(panel);
        setVisible(true);
    }

}
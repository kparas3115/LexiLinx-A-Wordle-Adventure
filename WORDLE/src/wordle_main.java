
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

    public class wordle_main extends JFrame implements ActionListener {
        JPanel p1,main;
        JLabel l1;

        JButton check ,clr;
        Font f1=new Font("Tahoma",Font.BOLD,18);
        int chances=5;
        boolean[] flag = new boolean[wordle_logic.wordsize];

        static ArrayList<JTextField> arr =new ArrayList<>();
        wordle_main()
        {
            setSize(500,500);
            setTitle("Wordle");
            main=new JPanel();
            setContentPane(main);
            main.setBackground(Color.decode("#1a1918"));

            p1=new JPanel();
            p1.setBounds(100,80,300,60);
            p1.setLayout(new BoxLayout(p1,BoxLayout.X_AXIS));
            add(p1);
            viewtf();

            l1=new JLabel("Chances remaining : "+chances);
            l1.setBounds(150,220,210,50);
            l1.setFont(f1);
            l1.setForeground(Color.white);
            add(l1);

            check=new JButton("Check");
            check.setBounds(100,350,100,50);
            check.setFont(f1);
            check.addActionListener(this);
            add(check);

            clr=new JButton("Clear");
            clr.setBounds(300,350,100,50);
            clr.setFont(f1);
            clr.addActionListener(this);
            add(clr);

            setLayout(null);
            setVisible(true);
            setLocationRelativeTo(null);
        }

        void viewtf() {
            for (int i = 0; i < wordle_logic.wordsize; i++) {
                arr.add(new JTextField());
                arr.get(i).setHorizontalAlignment(JTextField.CENTER);
                arr.get(i).setFont(f1);
                arr.get(i).setBackground(Color.decode("#3b3a39"));
                arr.get(i).setForeground(Color.white);

            }
            for (int i = 0; i < wordle_logic.wordsize; i++) {
                p1.add(arr.get(i));
            }
        }

        public void actionPerformed(ActionEvent ae)
        {
            UIManager.put("OptionPane.messageFont", f1);

            if (ae.getSource() == check)
            {
                if (chances > 0) {
                    //checking each textboxes loop
                    for (int i = 0; i < wordle_logic.wordsize; i++) {
                        if (wordle_logic.matchexactletter(i)) {
                            arr.get(i).setBackground(Color.decode("#2fa84f"));
                            flag[i] = true;
                        } else if (wordle_logic.containsletter(i)) {
                            arr.get(i).setBackground(Color.decode("#d1d424"));
                        } else {
                            arr.get(i).setBackground(Color.decode("#3b3a39"));
                        }
                    }
                    for (boolean ele : flag) {
                        if(ele==false){
                            break;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Baap Hai re Tu!");
                            System.exit(0);
                        }
                    }
                    chances--;

                    l1.setText("Chances remaining: "+chances);
                }
                else{
                    JOptionPane.showMessageDialog(null,"You are a noob!");
                    System.exit(0);
                }
            }

            if(ae.getSource()==clr){
                for (int i = 0; i < wordle_logic.wordsize; i++) {
                    arr.get(i).setText("");
                    arr.get(i).setBackground(Color.decode("#3b3a39"));
                    for(boolean ele: flag){
                        ele = false;
                    }
                }
            }
        }






        public static void main(String[] args) {
            new wordle_logic();
            new wordle_main();
        }
    }
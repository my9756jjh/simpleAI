package frame;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.util.*;

public class simpleAI {
    public static void main(String[] args) throws InterruptedException {
        Enumeration<Object> keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof FontUIResource)
                UIManager.put(key, new FontUIResource("굴림", Font.PLAIN, 14));
        }
        
        JFrame frm = new JFrame("simpleAI");
        frm.setSize(350, 600);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.getContentPane().setLayout(null);

        JButton btn1 = new JButton("Speak to simpleAI !");
        btn1.setBounds(79, 270, 180, 180);
        btn1.setHorizontalAlignment(JButton.CENTER);
        btn1.setOpaque(false);
        btn1.setFocusPainted(false);
        btn1.setBorderPainted(true);
        btn1.setContentAreaFilled(true);
        btn1.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        frm.getContentPane().add(btn1);

        JLabel output = new JLabel();
        output.setBounds(34, 150, 270, 50);
        output.setText("simpleAI's output will come out at here.");
        output.setHorizontalAlignment(JLabel.CENTER);

        JLabel logo = new JLabel();
        ImageIcon img = new ImageIcon(simpleAI.class.getResource("/frame/로고/log.png"));
        logo.setIcon(img);
        logo.setBounds(0, 30, 338, 100);
        logo.setHorizontalAlignment(JLabel.CENTER);
        frm.getContentPane().add(logo);

        frm.getContentPane().add(output);

        btn1.addActionListener(event ->{
            
        });
        JLabel container = new JLabel();
        container.setBounds(0, 500, 338, 50);
        container.setHorizontalAlignment(JLabel.CENTER);
        frm.getContentPane().add(container);

        JTextField field = new JTextField(10);
        container.add(field, BorderLayout.SOUTH);

        frm.setVisible(true);

        JOptionPane.showMessageDialog(logo, "simpleAI 사용을 환영합니다.", "사용 안내", 1);
    }
}
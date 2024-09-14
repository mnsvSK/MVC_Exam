import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class View extends JFrame {
    
    private JLabel text;
    private JTextField codeInput_TextField;
    private JButton submit_Button;
    private JTextArea status_TextArea;
    private JTextArea result_TextArea;

    public View(){
        JPanel panel = new JPanel();
        this.setSize(600,150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        text = new JLabel("Cow Code Input :");
        
        //ช่องสำหรับกรอกรหัสวัว
        codeInput_TextField = new JTextField(30);

        //ปุ่มกดส่ง input
        submit_Button = new JButton("submit");

        //แสดงสถานะของวัว
        status_TextArea = new JTextArea("Cow status :");
        status_TextArea.setEditable(false);

        //แสดงปริมาณนม และปริมาณนมทั้งหมด
        result_TextArea = new JTextArea("cow milk volume :"+"\nSum of milk volume : ");
        result_TextArea.setEditable(false);
        
        panel.add(text);
        panel.add(codeInput_TextField);
        panel.add(submit_Button);
        panel.add(status_TextArea);
        panel.add(result_TextArea);
        this.add(panel);
    }

    public void addButtonListener(ActionListener listener) {
        submit_Button.addActionListener(listener);
    }

    public int getinput() {
        //ถ้ารหัสน้อยกว่า 8 หลัก
        if (codeInput_TextField.getText().length()!=8){
            JOptionPane.showMessageDialog(this, "The code must be 8 digits long.");
        }
        //ถ้ารหัสเริ่มต้นด้วย 0
        else if(codeInput_TextField.getText().charAt(0)=='0'){
            JOptionPane.showMessageDialog(this, "The code must not begin with 0.");
        }
        return Integer.valueOf(codeInput_TextField.getText());
    }

    public void setStatusText(String text){
        status_TextArea.setText(text);
    }

    public void setResultText(String text) {
        result_TextArea.setText(text);
    }
    
}
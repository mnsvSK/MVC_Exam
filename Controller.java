import java.awt.event.*;
public class Controller {
    
    private View view;
    private Model model;
    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;

        this.view.addButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cowCode = view.getinput();
                view.setStatusText(model.cowCodeCheck(cowCode));
                view.setResultText("cow milk volume :"+model.getMilkVolume()+"\nSum of Farm's milk volume : "+ model.getSumVolume());
            }
        });
    } 
    
}
import java.awt.*;
import java.awt.event.*;

public class EmailRegistrationForm extends Frame {
    public EmailRegistrationForm() {
        setTitle("Email Registration Form");
        setSize(400, 500);
        setLayout(new FlowLayout());
        setBackground(Color.lightGray);

        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField(30);

        Label addressLabel = new Label("Address:");
        TextField addressField = new TextField(30);

        Label sexLabel = new Label("Sex:");
        Choice sexChoice = new Choice();
        sexChoice.add("Male");
        sexChoice.add("Female");
        sexChoice.add("Other");

        Label ageLabel = new Label("Age:");
        TextField ageField = new TextField(5);

        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField(30);

        Label contactLabel = new Label("Contact Number:");
        TextField contactField = new TextField(15);

        Button submitButton = new Button("Submit");

        add(nameLabel);
        add(nameField);
        add(addressLabel);
        add(addressField);
        add(sexLabel);
        add(sexChoice);
        add(ageLabel);
        add(ageField);
        add(emailLabel);
        add(emailField);
        add(contactLabel);
        add(contactField);
        add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Form Submitted");
                System.out.println("Name: " + nameField.getText());
                System.out.println("Address: " + addressField.getText());
                System.out.println("Sex: " + sexChoice.getSelectedItem());
                System.out.println("Age: " + ageField.getText());
                System.out.println("Email: " + emailField.getText());
                System.out.println("Contact Number: " + contactField.getText());
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        EmailRegistrationForm form = new EmailRegistrationForm();
        form.setVisible(true);
    }
}

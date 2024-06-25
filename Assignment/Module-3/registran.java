package Module3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class registran extends JFrame implements ActionListener {
  
	
    private static final String DB_URL = "jdbc:mysql://localhost:3306/registran";
    private static final String DB_USER = "your_username";
    private static final String DB_PASSWORD = "your_password";

    // GUI components
    private JLabel lblID, lblName, lblGender, lblAddress, lblContact;
    private JTextField txtID, txtName, txtAddress, txtContact;
    private JComboBox<String> cmbGender;
    private JButton btnRegister, btnExit, btnDelete, btnUpdate, btnReset;
    private JTable table;
    private JScrollPane scrollPane;
    private Connection connection;
    private Statement statement;

    // Constructor
    public registran() {
        super("Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLayout(new FlowLayout());

        connectToDatabase();

       
        lblID = new JLabel("ID:");
        txtID = new JTextField(10);
        lblName = new JLabel("Name:");
        txtName = new JTextField(15);
        lblGender = new JLabel("Gender:");
        cmbGender = new JComboBox<>(new String[]{"Male", "Female"});
        lblAddress = new JLabel("Address:");
        txtAddress = new JTextField(20);
        lblContact = new JLabel("Contact:");
        txtContact = new JTextField(15);

        btnRegister = new JButton("Register");
        btnExit = new JButton("Exit");
        btnDelete = new JButton("Delete");
        btnUpdate = new JButton("Update");
        btnReset = new JButton("Reset");


        btnRegister.addActionListener(this);
        btnExit.addActionListener(this);
        btnDelete.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnReset.addActionListener(this);

     
        add(lblID);
        add(txtID);
        add(lblName);
        add(txtName);
        add(lblGender);
        add(cmbGender);
        add(lblAddress);
        add(txtAddress);
        add(lblContact);
        add(txtContact);
        add(btnRegister);
        add(btnExit);
        add(btnDelete);
        add(btnUpdate);
        add(btnReset);

   
        setVisible(true);
    }

    // Connect to the database
    private void connectToDatabase() {
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            statement = connection.createStatement();
        } catch (SQLException e) {
            System.err.println("Error connecting to database: " + e.getMessage());
        }
    }

    // Register new user
    private void registerUser() {
        try {
            String id = txtID.getText();
            String name = txtName.getText();
            String gender = (String) cmbGender.getSelectedItem();
            String address = txtAddress.getText();
            String contact = txtContact.getText();

            // Insert new user into database
            String sql = "INSERT INTO users (id, name, gender, address, contact) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, gender);
            preparedStatement.setString(4, address);
            preparedStatement.setString(5, contact);
            preparedStatement.executeUpdate();

            // Display success message
            JOptionPane.showMessageDialog(this, "Registration successful!");
        } catch (SQLException e) {
            System.err.println("Error registering user: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "Registration failed!");
        }
    }

    private void deleteUser() {
        
    }

    private void updateUser() {
        
    }

    private void resetForm() {
        txtID.setText("");
        txtName.setText("");
        cmbGender.setSelectedIndex(0);
        txtAddress.setText("");
        txtContact.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRegister) {
            registerUser();
        } else if (e.getSource() == btnExit) {
            System.exit(0);
        } else if (e.getSource() == btnDelete) {
            deleteUser();
        } else if (e.getSource() == btnUpdate) {
            updateUser();
        } else if (e.getSource() == btnReset) {
            resetForm();
        }
    }

    // Main method
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new registran());
    }
}
package interfaz;

import servicios.CrewMember;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static servicios.Main.crew;

public class NuevoCrewMemberPanel extends JPanel {
    private JLabel newCrewMemberLabel;
    private JLabel nameLabel;
    private JTextField name;
    private JLabel surnameLabel;
    private JTextField surname;
    private JLabel ageLabel;
    private JTextField age;
    private JLabel genderLabel;
    private JTextField gender;
    private JLabel jobLabel;
    private JComboBox job;
    private String[] jobList = {"Ingeniero", "Piloto", "Fisico", "Storm Trooper"};
    private JButton newCrewMemberButton;

    public NuevoCrewMemberPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        newCrewMemberLabel = new JLabel("New Crew Member");
        c.gridx = 0;
        c.gridy = 0;
        add(newCrewMemberLabel, c);

        nameLabel = new JLabel("Name");
        c.gridx = 0;
        c.gridy = 1;
        add(nameLabel, c);

        name = new JTextField(15);
        c.gridx = 1;
        c.gridy = 1;
        add(name, c);

        surnameLabel = new JLabel("Surname");
        c.gridx = 0;
        c.gridy = 2;
        add(surnameLabel, c);

        surname = new JTextField(15);
        c.gridx = 1;
        c.gridy = 2;
        add(surname, c);

        ageLabel = new JLabel("Age");
        c.gridx = 0;
        c.gridy = 3;
        add(ageLabel, c);

        age = new JTextField(15);
        c.gridx = 1;
        c.gridy = 3;
        add(age, c);

        genderLabel = new JLabel("Gender");
        c.gridx = 0;
        c.gridy = 4;
        add(genderLabel, c);

        gender = new JTextField(15);
        c.gridx = 1;
        c.gridy = 4;
        add(gender, c);

        jobLabel = new JLabel("Job");
        c.gridx = 0;
        c.gridy = 5;
        add(jobLabel, c);

        job = new JComboBox(jobList);
        c.gridx = 1;
        c.gridy = 5;
        add(job, c);

        c.gridx = 0;
        c.gridy = 6;
        add(Box.createVerticalStrut(10), c);

        newCrewMemberButton = new JButton("New Crew Member");
        c.gridx = 0;
        c.gridy = 7;
        c.gridwidth = 2;
        add(newCrewMemberButton, c);

        newCrewMemberButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crew.getCrew().add(new CrewMember(name.getText(),
                        surname.getText(),
                        Integer.parseInt(age.getText().toString()),
                        gender.getText(),
                        job.getSelectedItem().toString()));
                name.setText("");
                surname.setText("");
                age.setText("");
                gender.setText("");

                JOptionPane.showMessageDialog(NuevoCrewMemberPanel.this, "Creado tripulante");
                crew.serializeCrewMemberList(crew);
            }
        });

    }
}

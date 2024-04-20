package interfaz;

import javax.swing.*;
import java.awt.*;

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

    public NuevoCrewMemberPanel() {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        newCrewMemberLabel = new JLabel("New Crew Member");

        name = new JTextField(15);
        c.gridx = 0;
        c.gridy = 0;
        add(newCrewMemberLabel, c);

        surnameLabel = new JLabel("Surname");
        c.gridx = 0;
        c.gridy = 1;
        add(surnameLabel, c);

        surname = new JTextField(15);
        c.gridx = 1;
        c.gridy = 1;
        add(surname, c);

        ageLabel = new JLabel("Age");
        c.gridx = 0;
        c.gridy = 2;
        add(ageLabel, c);

        age = new JTextField(15);
        c.gridx = 1;
        c.gridy = 2;
        add(age, c);

        genderLabel = new JLabel("Gender");
        c.gridx = 0;
        c.gridy = 3;
        add(genderLabel, c);

        gender = new JTextField(15);
        c.gridx = 1;
        c.gridy = 3;
        add(gender, c);

        jobLabel = new JLabel("Job");
        c.gridx = 0;
        c.gridy = 4;
        add(jobLabel, c);

        job = new JComboBox(jobList);
        c.gridx = 1;
        c.gridy = 4;
        add(job, c);



    }
}

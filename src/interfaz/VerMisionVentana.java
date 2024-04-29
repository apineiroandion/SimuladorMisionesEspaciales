package interfaz;

import servicios.Coordinate;
import servicios.Mission;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

import static servicios.Main.missions;

public class VerMisionVentana extends JFrame {
    JPanel panel;
    int id;
    Mission mision;
    DefaultTableModel modelo;
    JTable crewTable;
    JScrollPane crewScroll;
    ArrayList<Coordinate> coordinates;
    public VerMisionVentana(int id) {
        this.id = id;
        this.mision = missions.getMissions().get(id);
        this.coordinates = mision.getPosition();
        modelo = getModelo();
        crewTable = new JTable(modelo);
        crewScroll = new JScrollPane(crewTable);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(800, 600, 800, 600);
        setLocationRelativeTo(null);


        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.WHITE);
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));
        panel.setPreferredSize(new Dimension(600, 600));

        //NORTH
        JPanel titulo = new JPanel();
        titulo.setBackground(new Color(42, 113, 255));
        titulo.setLayout(new BorderLayout());
        JLabel nombre = new JLabel(mision.getName());
        nombre.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.add(nombre, BorderLayout.CENTER);

        panel.add(titulo, BorderLayout.NORTH);

        //CENTER GBL
        JPanel datos = new JPanel();
        panel.add(datos, BorderLayout.CENTER);
        datos.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;

        JLabel fecha = new JLabel(mision.getCreationDate().toString());
        fecha.setFont(new Font("Arial", Font.BOLD, 20));
        c.gridx = 0;
        c.gridy = 0;
        datos.add(fecha, c);

        JLabel objetivoMision = new JLabel("Objetivo Mision: "+mision.getObjectiveMission());
        c.gridx = 0;
        c.gridy = 1;
        datos.add(objetivoMision, c);

        drawGraph(coordinates);

        //WEST
        JPanel crew = new JPanel();
        panel.add(crew, BorderLayout.WEST);

        crew.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;

        JLabel crewNombre = new JLabel("Crew Members");
        crewNombre.setFont(new Font("Arial", Font.BOLD, 20));
        gbc.gridx = 0;
        gbc.gridy = 0;
        crew.add(crewNombre, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        crew.add(crewScroll, gbc);


        add(panel, BorderLayout.CENTER);

        panel.setVisible(true);
        datos.setVisible(true);
        crew.setVisible(true);


    }

    public DefaultTableModel getModelo() {
        String[] columnNames = {"Nombre", "Apellido", "Edad", "Género"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
        for (int i = 0; i < mision.getCrewMision().size(); i++){
            model.addRow(new Object[]{mision.getCrewMision().get(i).getName(), mision.getCrewMision().get(i).getSurname()
                    ,mision.getCrewMision().get(i).getAge(), mision.getCrewMision().get(i).getGender()});
        }
        return model;
    }

    // pruebas grafico
    public void drawGraph(ArrayList<Coordinate> coordinates) {
        // Creamos una serie XY para almacenar los puntos
        XYSeries series = new XYSeries("Coordenadas");

        // Agregamos los puntos del ArrayList a la serie XY
        for (Coordinate coord : coordinates) {
            series.add(coord.getX(), coord.getY());
        }

        // Creamos un conjunto de datos XY y agregamos la serie XY
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        // Creamos el gráfico XY
        JFreeChart chart = ChartFactory.createScatterPlot(
                "Gráfico de Coordenadas", // Título del gráfico
                "X", // Etiqueta del eje X
                "Y", // Etiqueta del eje Y
                dataset, // Conjunto de datos
                PlotOrientation.VERTICAL,
                true, // Incluir leyenda
                true, // Usar tooltips
                false // Usar URLs
        );
        // Configuramos el color de los puntos
        chart.getXYPlot().getRenderer().setSeriesPaint(0, Color.BLUE);

        // Creamos el panel del gráfico y lo mostramos en un JFrame
        ChartPanel chartPanel = new ChartPanel(chart);
        JFrame frame = new JFrame("Gráfico de Coordenadas");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(chartPanel, BorderLayout.CENTER);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}

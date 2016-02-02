package co.edu.uis.img;

/*************************************************************************
 *

 *  Clase para manejar un conjunto de pixeles en una imagen. La imagen
 *  original puede ser leida desde un archivo en formato jpg, png o gif.
 *  El usuario puede crear una imagen en blanco del tamaño deseado.
 *  Se incluyen metodos para modificar un pixel determinado de la imagen (x, y)
 *  con un Color.
 *  Se puede mostrar la imagen en una ventana o guardarla en un archivo.
 *  
 *
 *************************************************************************/

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 *  Esta clase provee metosos para manipular pixeles individuales de una
 *  imagen. La imagen original puede ser leida de un archivo en formato 
 *  JPEG, GIF o PNG, o el usuario puede crear una imagen en blanco de un 
 *  tamano dado. Esta clase incluye metodos parta mostrar la imagen en 
 *  una ventana en la pantalla y para guardarla en un archivo.
 *  <p>
 *  Por defecto, el pixel (x, y) corresponde a la columna x y fila y, la 
 *  coordenada (0,0) es la ezquina superior izquierda. 
 *  
 */
public class Imagen implements ActionListener {
    private BufferedImage imagenBG;               // the rasterized image
    private JFrame frame;                      // on-screen view
    private String nombreArchivo;                   // name of file
    private boolean isOriginUpperLeft = true;  // location of origin
    private int ancho, alto;                 // width and height

    /**
     * Create una imagen en blanco del ancho y alto indicados
     */
    public Imagen(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
        imagenBG = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_RGB);
        convertirABlanco();
        // set to TYPE_INT_ARGB to support transparency
        nombreArchivo = ancho + "-x-" + alto;
    }

    /**
     * Crea una imagen cargada a partir de un archivo de tipo .png, .gif o .jpg.
     * El nombre del archivo es pasado como parametro.
     */
    public Imagen(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        try {
            // try to read from file in working directory
            File file = new File(nombreArchivo);
            if (file.isFile()) {
                imagenBG = ImageIO.read(file);
            }

            // now try to read from file in same directory as this .class file
            else {
                URL url = getClass().getResource(nombreArchivo);
                if (url == null) { url = new URL(nombreArchivo); }
                imagenBG = ImageIO.read(url);
            }
            ancho  = imagenBG.getWidth(null);
            alto = imagenBG.getHeight(null);
        }
        catch (IOException e) {
            // e.printStackTrace();
            throw new RuntimeException("Could not open file: " + nombreArchivo);
        }
    }

    /**
     * Return a JLabel containing this Picture, for embedding in a JPanel,
     * JFrame or other GUI widget.
     */
    public JLabel getJLabel() {
        if (imagenBG == null) { return null; }         // no image available
        ImageIcon icon = new ImageIcon(imagenBG);
        return new JLabel(icon);
    }

    /**
     * Set the origin to be the upper left pixel.
     */
    public void setOriginUpperLeft() {
        isOriginUpperLeft = true;
    }

    /**
     * Set the origin to be the lower left pixel.
     */
    public void setOriginLowerLeft() {
        isOriginUpperLeft = false;
    }

    /**
     * Muestra la imagen en una ventana.
     */
    public void mostrar() {

        // create the GUI for viewing the image if needed
        if (frame == null) {
            frame = new JFrame();

            JMenuBar menuBar = new JMenuBar();
            JMenu menu = new JMenu("Archivo");
            menuBar.add(menu);
            JMenuItem menuItem1 = new JMenuItem(" Guardar ...   ");
            menuItem1.addActionListener(this);
            menuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,
                    Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
            menu.add(menuItem1);
            frame.setJMenuBar(menuBar);


            frame.setContentPane(getJLabel());
            // f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setTitle(nombreArchivo);
            frame.setResizable(false);
            frame.pack();
            frame.setVisible(true);
        }

        // draw
        frame.repaint();
    }

    /**
     * Retorna el alto de la imagen en pixeles
     */
    public int getAlto() {
        return alto;
    }

    /**
     * Retorna el ancho de la imagen
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * Return el color del pixel (i, j)
     */
    public Color getColor(int i, int j) {
        if (isOriginUpperLeft) return new Color(imagenBG.getRGB(i, j));
        else                   return new Color(imagenBG.getRGB(i, alto - j - 1));
    }

    /**
     * Cambia el color del pixel (i, j) por el color c
     */
    public void setColor(int i, int j, Color c) {
        if (c == null) { throw new RuntimeException("can't set Color to null"); }
        if (isOriginUpperLeft) imagenBG.setRGB(i, j, c.getRGB());
        else                   imagenBG.setRGB(i, alto - j - 1, c.getRGB());
    }

    /**
     * Es esta imagen igual a la intancia obj
     */
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;
        Imagen that = (Imagen) obj;
        if (this.getAncho()  != that.getAncho())  return false;
        if (this.getAlto() != that.getAlto()) return false;
        for (int x = 0; x < getAncho(); x++)
            for (int y = 0; y < getAlto(); y++)
                if (!this.getColor(x, y).equals(that.getColor(x, y))) return false;
        return true;
    }

    /**
     * Guarda esta imagen en un archivo con un formato estandar.
     * El tipo de archivo debe ser .png o .jpg.
     */
    public void guardar(String name) {
        guardar(new File(name));
    }

    /**
     * Guarda esta imagen en un archivo con un formato estandar.
     */
    private void guardar(File file) {
        this.nombreArchivo = file.getName();
        if (frame != null) { frame.setTitle(nombreArchivo); }
        String suffix = nombreArchivo.substring(nombreArchivo.lastIndexOf('.') + 1);
        suffix = suffix.toLowerCase();
        if (suffix.equals("jpg") || suffix.equals("png")) {
            try { ImageIO.write(imagenBG, suffix, file); }
            catch (IOException e) { e.printStackTrace(); }
        }
        else {
            System.out.println("Error: La extension del archivo debe ser .jpg or .png");
        }
    }

    /**
     * Abre una cja de dialogo cuando el usuario seleciona "Guardar Como" del menu
     */
    public void actionPerformed(ActionEvent e) {
        FileDialog chooser = new FileDialog(frame,
                "Use una extension .png o .jpg", FileDialog.SAVE);
        chooser.setVisible(true);
        if (chooser.getFile() != null) {
            guardar(chooser.getDirectory() + File.separator + chooser.getFile());
        }
    }

    /**
     * Este metodo convierte cada prixel de la imagen a color blanco
     */
    private void convertirABlanco() {
        Color blanco = new Color(255, 255, 255);
        for (int i=0;i<imagenBG.getWidth();i++) {
            for (int j=0;j<imagenBG.getHeight();j++) {
                setColor(i, j, blanco);
            }
        }
    }
    
    
    public void limpiar() {
        convertirABlanco();
        mostrar();
    }
    

}

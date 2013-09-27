
package Testes;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Nayron
 */
public class ClasseTeste extends JFrame{
    //Bloco 1 - Objeto da Janela
    
    private JButton objeto0;
    private JButton objeto02;
    
    //contrutor....
    public ClasseTeste(){
        // Bloco 2 - Definição dos dados da janela
        this.getContentPane().setLayout(null);
        this.getContentPane().setBackground(new Color(0,153,204));
        //java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(new java.awt.Dimension(200,200));
         this.setLocation(400,300);
        //this.setLocation((screenSize.width - 336)/2,(screenSize.height - 230)/2);
        this.setTitle("Aprendendo Swing");
        this.setResizable(true);
        
        //Bloco 3 - Criação dos objetos da Janela
        objeto0 = new JButton("Button");
        objeto0.setBounds(new Rectangle(79,47,100,30));
         
        this.getContentPane().add(objeto0,null);
        objeto02 = new JButton("teste");
         objeto02.setBounds(new Rectangle(69,50,600,46));
          this.getContentPane().add(objeto02,null);
        objeto0.addMouseListener(new MouseAdapter(){
           public void mouseClicked(MouseEvent e){
               //Ações após clicar o botão
               JOptionPane.showMessageDialog(rootPane, "Teste");
           } 
        });
         objeto02.addMouseListener(new MouseAdapter(){
           public void mouseClicked(MouseEvent e){
               //Ações após clicar o botão
               JOptionPane.showMessageDialog(rootPane, "Teste");
           } 
        });
        this.addWindowListener(new WindowAdapter(){
            public void WindowClosing(WindowEvent e){
                aoFechar();
            }
        });
        this.setVisible(true);
    }
     private void aoFechar(){
         System.exit(0);
     }
     //insira  aqui os metados para eventos
     public static void main(String args[]){
   
         new ClasseTeste();
     }
        
   }
    


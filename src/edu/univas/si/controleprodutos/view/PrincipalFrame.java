package edu.univas.si.controleprodutos.view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

import org.jvnet.substance.SubstanceLegacyDefaultLookAndFeel;
import org.jvnet.substance.skin.SubstanceBusinessLookAndFeel;
import org.jvnet.substance.skin.SubstanceCremeLookAndFeel;
import org.jvnet.substance.skin.SubstanceModerateLookAndFeel;
import org.jvnet.substance.skin.SubstanceNebulaLookAndFeel;
import org.jvnet.substance.skin.SubstanceRavenLookAndFeel;

import edu.univas.si.controleprodutos.components.LabelImage;

public class PrincipalFrame extends JFrame{
	
	private static final long serialVersionUID = 2702265523125343626L;
	
	private static PrincipalFrame _instance;
	private static JPanel _jPanelMain;	
	private static GeneralMenuBar _generalMenuBar;
	private static GeneralToolBar _generalToolBar;
	
	
	private PrincipalFrame(){
		super("Controle de Vendas e Estoque");
		setContentPane(getJPanelMain());
		setJMenuBar(getGeneralMenuBar());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);			
		setMinimumSize(new Dimension(600,400));
		LabelImage labelImage = new LabelImage("/images/background.png");
		setView(labelImage);
		//labelImage.updateUI();
		setVisible(true);
		setLookAndFeel("Legacy");
	}
	
	public static JFrame getInstance(){
		if(_instance == null){
			_instance = new PrincipalFrame();
		}
		return _instance;
	}
	
	private static JPanel getJPanelMain(){
		if(_jPanelMain == null){
			_jPanelMain = new JPanel();
			_jPanelMain.setLayout(new BorderLayout());
			_jPanelMain.add(getGeneralToolBar(), BorderLayout.SOUTH);
		}
		return _jPanelMain;
	}
	
	public static void setView(JPanel pane){
		getJPanelMain().removeAll();
		getJPanelMain().add(pane,BorderLayout.CENTER);
		getJPanelMain().add(getGeneralToolBar(), BorderLayout.SOUTH);
		getJPanelMain().updateUI();
	}
	
	private static GeneralToolBar getGeneralToolBar(){
		if(_generalToolBar == null){
			_generalToolBar = new GeneralToolBar();
		}
		return _generalToolBar;
	}
	
	private static GeneralMenuBar getGeneralMenuBar(){
		if(_generalMenuBar == null){
			_generalMenuBar = new GeneralMenuBar();
		}
		return _generalMenuBar;
	}
	
	public static void setLookAndFeel(String lookAndFeel){				
		setDefaultLookAndFeelDecorated(true);
	    try {
	    	if (lookAndFeel.equals("Business")){
	    		UIManager.setLookAndFeel(new SubstanceBusinessLookAndFeel());
			}else if (lookAndFeel.equals("Creme")){
	    		UIManager.setLookAndFeel(new SubstanceCremeLookAndFeel());
			}else if (lookAndFeel.equals("Legacy")){
		    	UIManager.setLookAndFeel(new SubstanceLegacyDefaultLookAndFeel());				
			}else if (lookAndFeel.equals("Moderate")){
	    		UIManager.setLookAndFeel(new SubstanceModerateLookAndFeel());
			}else if (lookAndFeel.equals("Nebula")){
				UIManager.setLookAndFeel(new SubstanceNebulaLookAndFeel());
			}else if (lookAndFeel.equals("Raven")){
		    		UIManager.setLookAndFeel(new SubstanceRavenLookAndFeel());
			}
	    } catch (Exception e) {
	    	JOptionPane.showMessageDialog(null, 
					"Substance LookAndFeel failed to initialize!", 
					"Erro!", JOptionPane.WARNING_MESSAGE);
	    }
	}
	
	public static void setViewToPrint(PrintableInterface printable){
		getGeneralMenuBar().setJTableToPrint(printable);
	}
	
	public static void removeItemPrint(){
		getGeneralMenuBar().removeItemPrint();
	}
	
}
 

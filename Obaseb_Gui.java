package Swing;

import java.awt.EventQueue;
import static BibTeX.fayılridır.formatBibTeX;
import static BibTeX.fayılridır.parseBibTeX;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.jbibtex.BibTeXDatabase;

public class Obaseb_Gui {

	private JFrame frmObaseb;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
     * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
                    try {
                        Obaseb_Gui window = new Obaseb_Gui();
                        window.frmObaseb.setVisible(true);
                    } catch (Exception e) {
                    }
                });
	}

	/**
	 * Create the application.
	 */
	public Obaseb_Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmObaseb = new JFrame();
		frmObaseb.setTitle("OBASEB");
		frmObaseb.setBounds(100, 100, 880, 720);
		frmObaseb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblKey = new JLabel("     Key :");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboBox.setForeground(Color.BLACK);
		comboBox.setMaximumRowCount(12);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"January ", "February", "March ", "April ", "May ", "June", "July ", "August ", "September ", "October ", "November", "December"}));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		JLabel lblAuthor = new JLabel(" Author* :");
		
		JLabel lblNewLabel = new JLabel("    Title* :");
		
		JLabel lblNewLabel_1 = new JLabel("Journal* :");
		
		JLabel lblNewLabel_2 = new JLabel("    Year* :");
		
		JLabel lblNewLabel_3 = new JLabel("Volume :");
		
		JLabel lblNewLabel_4 = new JLabel("Number :");
		
		JLabel lblNewLabel_5 = new JLabel(" Pages :");
		
		JLabel lblMonth = new JLabel("    Month :");
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setToolTipText("");
		comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		comboBox_1.setMaximumRowCount(15);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Article", "Book ", "Booklet ", "Conference ", "Inbook", "Incollection ", "Inproceedings", "Manual ", "Mastersthesis ", "Misc ", "Phdthesis ", "Proceedings ", "Techreport ", "Unpublished "}));
		
		JLabel lblEntryType = new JLabel("Entry Type :");
		
		JPanel panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(frmObaseb.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField, GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(661, Short.MAX_VALUE)
					.addComponent(lblEntryType)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAuthor, GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblKey, GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(627, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField_6, GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
					.addGap(740))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
					.addGap(728))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 99, Short.MAX_VALUE)
					.addGap(728))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField_7, GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(729, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE))
						.addComponent(lblMonth, GroupLayout.PREFERRED_SIZE, 827, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(15)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEntryType))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblKey)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblAuthor)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel)
					.addGap(11)
					.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_3)
					.addGap(11)
					.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_4)
					.addGap(11)
					.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_5)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblMonth)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
					.addContainerGap())
		);
		frmObaseb.getContentPane().setLayout(groupLayout);
		
		JMenuBar menuBar = new JMenuBar();
		frmObaseb.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
                
                
                JMenuItem mnıtmOpen = new JMenuItem("Open");
		mnFile.add(mnıtmOpen);
                
                JMenuItem mnıtmWrite = new JMenuItem("Write");
		mnFile.add(mnıtmWrite);
                
                 mnıtmWrite.addActionListener((ActionEvent e) -> {
                     String userDir = System.getProperty("user.home");
                     JFileChooser fc = new JFileChooser(userDir +"/Desktop");
                     FileNameExtensionFilter filter = new FileNameExtensionFilter("BIB FILES", "bib", "BibTeX");
                     fc.setFileFilter(filter);
                     Component parent = null;
                     fc.setSelectedFile(new File("fileToSave.bib"));
                     final int returnVal = fc.showSaveDialog(parent);
                     File file ;
                     
                     if(returnVal == JFileChooser.APPROVE_OPTION)
                     {
                         file = fc.getSelectedFile();
                         try{
                             FileWriter fw = new FileWriter(file.getAbsoluteFile());
                             try (BufferedWriter bw = new BufferedWriter(fw)) 
                             {

                                 String value = comboBox_1.getSelectedItem().toString().toLowerCase();
                                 int counter = 1;
                                 String textField1 = textField_1.getText();
                                 String textField2 = textField_2.getText();
                                 String textField3 = textField_3.getText();
                                 String textField4 = textField_4.getText();
                                 String textField5 = textField_5.getText();
                                 String textField6 = textField_6.getText();
                                 String textField7 = textField_7.getText();
                                 
                                 String content = "@"+value+"{Sh:"+counter+",\n" +
                                         "	author = {"+textField1+"},\n" +
                                         "	ams-subject = {("+textField7+")},\n" +
                                         "	journal = {"+textField4+"},\n" +
                                         "	review = {"+textField7+"},\n" +
                                         "	pages = {"+textField2+"},\n" +
                                         "	title = {{"+textField3+"}},\n" +
                                         "	volume = {"+textField6+"},\n" +
                                         "	year = {"+textField5+"}\n" +
                                         "}";
                                 
                                 bw.write(content);
                             }
                             
                         } catch (IOException ex)
                         {
                             Logger.getLogger(Obaseb_Gui.class.getName()).log(Level.SEVERE, null, ex);
                         }
                     }
                     
                     else
                     {
                         JOptionPane optionPane = new JOptionPane("Seçim yapılmadı", JOptionPane.ERROR_MESSAGE);
                         JDialog dialog = optionPane.createDialog("Error");
                         dialog.setVisible(true);
                     }
                });
                
                JMenuItem mnıtmSearch = new JMenuItem("Search");
		mnFile.add(mnıtmSearch);
                
                 mnıtmSearch.addActionListener((ActionEvent e) -> {
                     String userDir = System.getProperty("user.home");
                     JFileChooser fc = new JFileChooser(userDir +"/Desktop");
                     FileNameExtensionFilter filter = new FileNameExtensionFilter("BIB FILES", "bib", "BibTeX");
                     fc.setFileFilter(filter);
                     Component parent = null;
                     int returnVal = fc.showOpenDialog(parent);
                     if(returnVal == JFileChooser.APPROVE_OPTION)
                     {
                         File FilePath = fc.getSelectedFile();
                         
                         try
                         {
                             BibTeXDatabase database = parseBibTeX(FilePath);
                             formatBibTeX(database, FilePath);
                         }catch(org.jbibtex.ParseException p)
                         {
                             JOptionPane optionPane = new JOptionPane("ErrorMsg", JOptionPane.ERROR_MESSAGE);
                             JDialog dialog = optionPane.createDialog("Dosya algılanamadı.");
                             dialog.setVisible(true);
                         }catch(FileNotFoundException f)
                         {
                             JOptionPane optionPane = new JOptionPane("ErrorMsg", JOptionPane.ERROR_MESSAGE);
                             JDialog dialog = optionPane.createDialog("Dosya bulunamadı ya da tanınmadı.");
                             dialog.setVisible(true);
                         }   catch (IOException ex) {
                             Logger.getLogger(Obaseb_Gui.class.getName()).log(Level.SEVERE, null, ex);
                         }
                         
                         try (Scanner in = new Scanner(FilePath))
                         {
                             
                             String girdi = in.nextLine();
                             
                             String arama = JOptionPane.showInputDialog("Please give a String to search");
                             
                             if(arama .length() > 0)
                             {
                                 while(in.hasNext())
                                 {
                                     if(girdi.contains(arama ) == false)
                                     {
                                         girdi = in.nextLine();
                                     }
                                     
                                     else if(girdi.contains(arama ) == true)
                                     {
                                         JOptionPane.showMessageDialog(null, "" +girdi+ "","SONUÇ" , JOptionPane.INFORMATION_MESSAGE);
                                         girdi = in.nextLine();
                                         break;
                                     }
                                     
                                     else
                                     {
                                         JOptionPane optionPane = new JOptionPane("ErrorMsg", JOptionPane.ERROR_MESSAGE);
                                         JDialog dialog = optionPane.createDialog("Bulunamadı");
                                         dialog.setVisible(true);
                                     }
                                 }
                             }
                             
                             else
                             {
                                 JOptionPane optionPane = new JOptionPane("ErrorMsg", JOptionPane.ERROR_MESSAGE);
                                 JDialog dialog = optionPane.createDialog("Failure");
                                 dialog.setVisible(true);
                             }
                             
                         } catch (FileNotFoundException ex) {
                             Logger.getLogger(Obaseb_Gui.class.getName()).log(Level.SEVERE, null, ex);
                         }
                     }
                });
                         
                mnıtmOpen.addActionListener((ActionEvent e) -> {
                    String userDir = System.getProperty("user.home");
                    JFileChooser fc = new JFileChooser(userDir +"/Desktop");
                    FileNameExtensionFilter filter = new FileNameExtensionFilter("BIB FILES", "bib", "bibtex");
                    fc.setFileFilter(filter);
                    Component parent = null;
                    int returnVal = fc.showOpenDialog(parent);
                    if(returnVal == JFileChooser.APPROVE_OPTION)
                    {
                        File FilePath = fc.getSelectedFile();
                        
                        try
                        {
                            BibTeXDatabase database = parseBibTeX(FilePath);
                            
                            formatBibTeX(database, FilePath);
                        }catch(org.jbibtex.ParseException p)
                        {
                            System.out.print("Okunmaya çalışan dosyada hata var ya da boş");
                        }catch(FileNotFoundException f)
                        {
                            System.out.print("Dosya bulunamadı ya da açılamıyor.");
                        }   catch (IOException ex) {
                            Logger.getLogger(Obaseb_Gui.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        try (Scanner in = new Scanner(FilePath))
                        {
                            String author = in.nextLine();
                            String identifier ="@article";
                            

                            while(!(author.contains(identifier)))
                            {
                                if(in.hasNext())
                                {
                                    author = in.nextLine();
                                }
                                
                                else
                                {
                                    System.out.println("Dosya okunamadı ya da boş");
                                    break;
                                }
                                
                            }
                            
                            author = author.split("@author")[0];
                            
                            author = in.nextLine();
                            String value = author.split("=")[1];
                            value = value.split("\\}")[0];
                            value = value.split("\\{")[1];
                            
                            textField_1.setText(value.split("\\,")[1].trim() + " " +  value.split("\\,")[0].trim());
                            
                            String amssubject = in.nextLine(); // ams-subject giriş //
                            String amssubject2;
                            
                            amssubject2 = amssubject.split("=")[1];
                            amssubject2 = amssubject2.split("\\}")[0].trim();
                            
                            String cevap = amssubject2.split("\\{")[1].trim().substring(amssubject2.split("\\{")[1].trim().indexOf("(")+1,amssubject2.split("\\{")[1].trim().indexOf(")"));
                            
                            
                            String journal = in.nextLine(); // journal giriş //
                            String journal2;
                            
                            journal2 = journal.split("=")[1].trim();
                            
                            journal2 = journal2.split("\\}")[0].trim();
                            
                            textField_4.setText(journal2.split("\\{")[1].trim());
                            
                            String review = in.nextLine(); // review giriş //
                            String review2;
                            
                            review2 = review.split("=")[1].trim();
                            review2 = review2.split("\\}")[0].trim();
                            
                            String pages = in.nextLine(); // pages giriş //
                            String pages2;
                            
                            pages2 = pages.split("=")[1].trim();
                            pages2 = pages2.split("\\}")[0].trim();
                            pages2 = pages2.split("\\{")[1].trim();
                            
                            textField_2.setText(pages2.split("\\--")[0] + "-" + pages2.split("\\--")[1]);
                            
                            
                            String title = in.nextLine(); // title giriş //
                            String title2;
                            
                            
                            title2 = title.split("=")[1].trim();
                            title2 = title2.split(",")[0].trim();
                            
                            
                            String cevap2 = title2.substring(title2.indexOf("{")+2,title2.indexOf("}"));
                            
                            textField_3.setText(cevap2); // title veritabanına yazılacak //
                            
                            
                            String volume = in.nextLine(); // volume giriş //
                            String volume2;
                            
                            volume2 = volume.split("=")[1].trim();
                            volume2 = volume2.split(",")[0].trim();
                            
                            String cevap3 = volume2.substring(volume2.indexOf("{")+1,volume2.indexOf("}"));
                            
                            textField_6.setText(cevap3);  // volume veri tabanına yazılacak //
                            
                            String year = in.nextLine(); // volume giriş //
                            String year2;
                            
                            year2 = year.split("=")[1].trim();
                            
                            String cevap4 =  year2.substring(year2.indexOf("{")+1, year2.indexOf("}"));
                            
                            textField_5.setText(cevap4);  // year veri tabanına yazılacak
                            
                            textField_7.setText("1");
                            
                            
                        }   catch (FileNotFoundException ex) {
                            Logger.getLogger(Obaseb_Gui.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
		
		JMenuItem mnıtmDelete = new JMenuItem("Delete");
		mnFile.add(mnıtmDelete);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
	}
                 
	private void addPopup(Component component, final JPopupMenu popup) 
        {
		component.addMouseListener(new MouseAdapter() {
                        @Override
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
                        @Override
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
                
                
	}
                
}


package BibTeX;

import Swing.Obaseb_Gui;
import java.awt.Component;
import java.io.File;
import java.io.FileNotFoundException;
import org.jbibtex.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class fayılridır
{   
    /**
     *
     * @param file
     * @return
     * @throws java.io.FileNotFoundException
     */
    public static ArrayList<String> parseAll(File file) throws FileNotFoundException
    {
         try
                        {
                            BibTeXDatabase database = parseBibTeX(file); 
                            formatBibTeX(database, file);
                        }catch(ParseException | FileNotFoundException p)
                        {
                                JOptionPane optionPane = new JOptionPane("ErrorMsg", JOptionPane.ERROR_MESSAGE);
                                JDialog dialog = optionPane.createDialog("Dosya okunurken bir hata oluştu.");
                                dialog.setVisible(true);
                        }                   catch (IOException | ObjectResolutionException ex) {
                            Logger.getLogger(Obaseb_Gui.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                      ArrayList values;
                      values = new ArrayList<>();
                        
                        try (Scanner in = new Scanner(file))
                        {
                            String first;
                            first = in.nextLine();
                            
                            while(in.hasNext())
                            {
                                if(first.contains("@article"))
                                { 
                                    values.add("@article");
                                    first = in.nextLine();
                                    while(first.contains("="))
                                    {
                                        
                                        values.add(first.split("=")[0].trim());
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                                else if(first.contains("@book"))
                                {
                                    values.add("@book");
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                              else if(first.contains("@booklet"))
                                {
                                    values.add("@booklet");
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                              else if(first.contains("@inbook"))
                                {
                                    values.add("@inbook");
                                    first = in.nextLine();
                                    
                                   while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                              else if(first.contains("@incollection"))
                                {
                                    values.add("@incollection");
                                    first = in.nextLine();
                                    
                                   while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                              else if(first.contains("@inproceedings"))
                                {
                                    values.add("@inproceedings");
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                               else if(first.contains("@manual"))
                                {
                                    values.add("@manual");
                                    first = in.nextLine();
                                    
                                   while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                              else if(first.contains("@masterthesis"))
                                {
                                    values.add("@masterthesis");
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                              else if(first.contains("@misc"))
                                {
                                    values.add("@misc");
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                               else if(first.contains("@phdthesis"))
                                {
                                    values.add("@phdthesis");
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                              else  if(first.contains("@proceedings"))
                                {
                                    values.add("@proceedings");
                                    first = in.nextLine();
                                    
                                   while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                                
                              else  if(first.contains("@techreport"))
                                {
                                    values.add("@techreport");
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                              else if(first.contains("@unpublished"))
                                {
                                    values.add("@unpublished");
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                else
                               {
                                   if(in.hasNext() == false)
                                   {
                                       break;
                                   }
                                   else
                                           {
                                               first = in.nextLine();
                                           }
                                   
                               }
    }
    }
        return values;
    }
    
    public static ArrayList<String> parse(File file) throws FileNotFoundException
    {
         try
                        {
                            BibTeXDatabase database = parseBibTeX(file); 
                            formatBibTeX(database, file);
                        }catch(ParseException | FileNotFoundException p)
                        {
                                JOptionPane optionPane = new JOptionPane("ErrorMsg", JOptionPane.ERROR_MESSAGE);
                                JDialog dialog = optionPane.createDialog("Dosya okunurken bir hata oluştu.");
                                dialog.setVisible(true);
                        }                   catch (IOException | ObjectResolutionException ex) {
                            Logger.getLogger(Obaseb_Gui.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                      ArrayList values;
                      values = new ArrayList<>();
                        
                        try (Scanner in = new Scanner(file))
                        {
                            String first;
                            first = in.nextLine();
                            
                            while(in.hasNext())
                            {
                                if(first.contains("@article"))
                                { 
                                    
                                    first = in.nextLine();
                                    while(first.contains("="))
                                    {
                                        
                                        values.add(first.split("=")[0].trim());
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                                else if(first.contains("@book"))
                                {
                                    
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                              else if(first.contains("@booklet"))
                                {
                                    
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                              else if(first.contains("@inbook"))
                                {
                                    
                                    first = in.nextLine();
                                    
                                   while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                              else if(first.contains("@incollection"))
                                {
                                   
                                    first = in.nextLine();
                                    
                                   while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                              else if(first.contains("@inproceedings"))
                                {
                                    
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                               else if(first.contains("@manual"))
                                {
                                    
                                    first = in.nextLine();
                                    
                                   while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                              else if(first.contains("@masterthesis"))
                                {
                                    
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                              else if(first.contains("@misc"))
                                {
                                    
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                               else if(first.contains("@phdthesis"))
                                {
                                    
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                              else  if(first.contains("@proceedings"))
                                {
                                    
                                    first = in.nextLine();
                                    
                                   while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                                
                              else  if(first.contains("@techreport"))
                                {
                                    
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                              else if(first.contains("@unpublished"))
                                {                                   
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                else
                               {
                                   if(in.hasNext() == false)
                                   {
                                       break;
                                   }
                                   else
                                           {
                                               first = in.nextLine();
                                           }
                                   
                               }
    }
    }
        return values;
    }
    
    
     public static ArrayList<String> parseleft(File file) throws FileNotFoundException
    {
         try
                        {
                            BibTeXDatabase database = parseBibTeX(file); 
                            formatBibTeX(database, file);
                        }catch(ParseException | FileNotFoundException p)
                        {
                                JOptionPane optionPane = new JOptionPane("ErrorMsg", JOptionPane.ERROR_MESSAGE);
                                JDialog dialog = optionPane.createDialog("Dosya okunurken bir hata oluştu.");
                                dialog.setVisible(true);
                        }                   catch (IOException | ObjectResolutionException ex) {
                            Logger.getLogger(Obaseb_Gui.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                      ArrayList values;
                      values = new ArrayList<>();
                        
                        try (Scanner in = new Scanner(file))
                        {
                            String first;
                            first = in.nextLine();
                            
                            while(in.hasNext())
                            {
                                if(first.contains("@article"))
                                { 
                                    
                                    first = in.nextLine();
                                    while(first.contains("="))
                                    {
                                        
                                        values.add(first.split("=")[0].trim());
                                        
                                        first = in.nextLine();
                                    }
                                }
                                
                                else if(first.contains("@book"))
                                {
                                    
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                       
                                        first = in.nextLine();
                                    }
                                }
                                
                              else if(first.contains("@booklet"))
                                {
                                    
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());                                    
                                        first = in.nextLine();
                                    }
                                }
                                
                              else if(first.contains("@inbook"))
                                {
                                    
                                    first = in.nextLine();
                                    
                                   while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                              else if(first.contains("@incollection"))
                                {
                                   
                                    first = in.nextLine();
                                    
                                   while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                              else if(first.contains("@inproceedings"))
                                {
                                    
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                               else if(first.contains("@manual"))
                                {
                                    
                                    first = in.nextLine();
                                    
                                   while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                              else if(first.contains("@masterthesis"))
                                {
                                    
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                              else if(first.contains("@misc"))
                                {
                                    
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                               else if(first.contains("@phdthesis"))
                                {
                                    
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                              else  if(first.contains("@proceedings"))
                                {
                                    
                                    first = in.nextLine();
                                    
                                   while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                                
                              else  if(first.contains("@techreport"))
                                {
                                    
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                              else if(first.contains("@unpublished"))
                                {                                   
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        first = in.nextLine();
                                    }
                                }
                                else
                               {
                                   if(in.hasNext() == false)
                                   {
                                       break;
                                   }
                                   else
                                           {
                                               first = in.nextLine();
                                           }
                                   
                               }
    }
    }
        return values;
    }
     
      public static ArrayList<String> parseright(File file) throws FileNotFoundException
    {
         try
                        {
                            BibTeXDatabase database = parseBibTeX(file); 
                            formatBibTeX(database, file);
                        }catch(ParseException | FileNotFoundException p)
                        {
                                JOptionPane optionPane = new JOptionPane("ErrorMsg", JOptionPane.ERROR_MESSAGE);
                                JDialog dialog = optionPane.createDialog("Dosya okunurken bir hata oluştu.");
                                dialog.setVisible(true);
                        }                   catch (IOException | ObjectResolutionException ex) {
                            Logger.getLogger(Obaseb_Gui.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                      ArrayList values;
                      values = new ArrayList<>();
                        
                        try (Scanner in = new Scanner(file))
                        {
                            String first;
                            first = in.nextLine();
                            
                            while(in.hasNext())
                            {
                                if(first.contains("@article"))
                                { 
                                    values.add("@article");
                                    first = in.nextLine();
                                    while(first.contains("="))
                                    {
                                        
                                        values.add(first.split("=")[1].trim());                                        
                                        first = in.nextLine();
                                    }
                                }
                                
                                else if(first.contains("@book"))
                                {
                                    values.add("@book");
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                              else if(first.contains("@booklet"))
                                {
                                    values.add("@booklet");
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[1].trim());                                    
                                        first = in.nextLine();
                                    }
                                }
                                
                              else if(first.contains("@inbook"))
                                {
                                    values.add("@inbook");
                                    first = in.nextLine();
                                    
                                   while(first.contains("="))
                                    {
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                              else if(first.contains("@incollection"))
                                {
                                   values.add("@incollection");
                                    first = in.nextLine();
                                    
                                   while(first.contains("="))
                                    {
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                              else if(first.contains("@inproceedings"))
                                {
                                    values.add("@inproceedings");
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                               else if(first.contains("@manual"))
                                {
                                    values.add("@manual");
                                    first = in.nextLine();
                                    
                                   while(first.contains("="))
                                    {
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                              else if(first.contains("@masterthesis"))
                                {
                                    values.add("@masterthesis");
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                              else if(first.contains("@misc"))
                                {
                                    values.add("@misc");
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                               else if(first.contains("@phdthesis"))
                                {
                                    values.add("@phdthesis");
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                              else  if(first.contains("@proceedings"))
                                {
                                    values.add("@proceedings");
                                    first = in.nextLine();
                                    
                                   while(first.contains("="))
                                    {
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                                
                              else  if(first.contains("@techreport"))
                                {
                                    values.add("@techreport");
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                              else if(first.contains("@unpublished"))
                                {
                                    values.add("@unpublished");
                                    first = in.nextLine();
                                    
                                    while(first.contains("="))
                                    {
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                else
                               {
                                   if(in.hasNext() == false)
                                   {
                                       break;
                                   }
                                   else
                                           {
                                               first = in.nextLine();
                                           }           
                               }
    }
    }
        return values;
    }
    
    /**
     *
     * @param database
     * @param file
     * @throws IOException
     */
    static public void formatBibTeX(BibTeXDatabase database, File file) throws IOException {
		try (Writer writer = file != null ? new FileWriter(file) : new OutputStreamWriter(System.out)) // yeni dosyanın çıktısı 
                {
			BibTeXFormatter formatter = new BibTeXFormatter();

			formatter.format(database, writer);
		}
	}

    /**
     *
     * @param file
     * @return
     * @throws IOException
     * @throws ParseException
     */
    static public BibTeXDatabase parseBibTeX(File file) throws IOException, ParseException 
        {
		 Reader reader = new FileReader(file); 

	         BibTeXParser parser = new BibTeXParser();

			return parser.parse(reader);
		} 
    
    /**
     *
     * @param list
     * @return
     */
    static public ArrayList<String>cleaner(ArrayList<String> list) 
{
    for (int i = 0; i < list.size(); i++) 
    {
          if(list.get(i).contains("{"))
          {  
             String temp = list.get(i);
             temp = temp.replace("{","");
             temp.trim();
             list.set(i, temp);
          }
          
          if(list.get(i).contains("}"))
          {
             String temp = list.get(i);
             temp = temp.replace("}","");
             temp.trim();
             list.set(i, temp); 
          }
          
          if(list.get(i).contains(","))
          {
             String temp = list.get(i);
             temp = temp.replace(",","");
             temp.trim();
             list.set(i, temp);
          }
          
          if(list.get(i).contains("("))
          {
              String temp = list.get(i);
             temp = temp.replace("(","");
             temp.trim();
             list.set(i, temp);
          }
          
          if(list.get(i).contains(")"))
          {
              String temp = list.get(i);
             temp = temp.replace(")","");
             temp.trim();
             list.set(i, temp);
          }
    } 
    return list;
}

public static ArrayList<String>values(ArrayList list)
{
    ArrayList values = new ArrayList();
    
    list = splitter(list);
    
    for(int a = 0;a<list.size();a = a+1)
    {
        values.add(list.get(a));
    }
    
    return values;
}
    
public static ArrayList <String> splitter(ArrayList <String> list)
    {
        ArrayList<String> replacer = new ArrayList<>();
        
        for(int i = 1; i<list.size();i++)
        {
            if(list.get(i).contains("@") == false)
        {
            replacer.add(list.get(i));
        }
        }
        return replacer;
    }

public static ArrayList <String>assignedTo(ArrayList <String> list)
{
    ArrayList<String> returned = new ArrayList<>();
    for(int i = 1; i<list.size();i++)
        {
            if(list.get(i).contains("@") == false)
        {
            returned.add(list.get(i));
            returned.add(list.get(i+1));
        }
        } 
    return returned;  
}

public static int getRows(ArrayList<String> list)
{
    int row_count = 0;
    
    for(int i=1;i<list.size();i++)
    {
        if(list.get(i).contains("@") == false)
        {
            row_count++;
        }
    }
    return row_count;
}

public static ArrayList <String> keys(ArrayList <String> list)
{
          ArrayList<String> replacer = new ArrayList<>();
          
          for(int i = 0; i<list.size();i++)
        {
            if(list.get(i).contains("@") == true)
        {
            replacer.add(list.get(i));
        }
        }
        return replacer;        
}

public static ArrayList <String> search(ArrayList <String> list , String keyword1 ,String keyword2)
{
    ArrayList<String> searched = new ArrayList<>();
    int counter = 0;
    
    for(int i = 0; i<list.size(); i++)
    {
        if(list.get(i).contains(keyword1) && list.get(i+1).contains(keyword2) )
        {
            while(list.get(i).contains("@") == false)
            {
                searched.add(list.get(i));
                i = i -1 ;
                counter++;
            }
            
            i = i + counter;
            
            while(list.get(i).contains("@") == false)
            {
                searched.add(list.get(i));
                i = i + 1;
            }
       }
    }
        return searched;   
}   

public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) 
    { 
        ArrayList<T> newList = new ArrayList<>(); 
        list.stream().filter((element) -> (!newList.contains(element))).forEachOrdered((element) -> {
        newList.add(element);
        }); 
        return newList; 
    } 


    /**
     *
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException
        {
                     String userDir = System.getProperty("user.home");
                     JFileChooser fc = new JFileChooser(userDir +"/Desktop");
                     FileNameExtensionFilter filter = new FileNameExtensionFilter("BIB FILES", "bib", "BibTeX");
                     fc.setFileFilter(filter);
                     Component parent = null;
                     int returnVal = fc.showOpenDialog(parent);
                     
                     if(returnVal == JFileChooser.APPROVE_OPTION)
                     {
                         File FilePath = fc.getSelectedFile();
                         //System.out.println(cleaner(parseAll(FilePath)));
                         
                         ArrayList<String> list = new ArrayList<>();
                         list = parseleft(FilePath);
                         
                         System.out.println(getRows(list));
                         System.out.println(cleaner(parseright(FilePath)));
                     }
                      
        }
}

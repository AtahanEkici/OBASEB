package BibTeX;

import Swing.Obaseb_Gui;
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

public class fayılridır
{   
    /**
     *
     * @param file
     * @return
     */
    public static ArrayList<String> parseAll(File file) throws FileNotFoundException
    {
         try
                        {
                            BibTeXDatabase database = parseBibTeX(file); 
                            formatBibTeX(database, file);
                        }catch(ParseException p)
                        {
                            System.out.print("Okunmaya çalışan dosyada hata var ya da boş"); //pop up uyarısı verecek
                        }catch(FileNotFoundException f)
                        {
                            System.out.print("Dosya bulunamadı ya da açılamıyor."); //pop up uyarısı verecek
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
                                
                               else if(first.contains("@proceedings"))
                                {
                                    first = in.nextLine();
                                    
                                   while(first.contains("="))
                                    {
                                        values.add(first.split("=")[0].trim());
                                        values.add(first.split("=")[1].trim());
                                        first = in.nextLine();
                                    }
                                }
                                
                                
                               else if(first.contains("@techreport"))
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
                                   first = in.nextLine();
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
    } 
    return list;
}

    /**
     *
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException
        {
            File file = new File("C:\\Users\\LayThese\\Desktop\\sample.bib");
 
            System.out.println(cleaner(parseAll(file)));  
        }
}
